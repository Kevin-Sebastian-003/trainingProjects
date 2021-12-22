import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent implements OnInit {
  registrationform!: FormGroup;
  errors!: Boolean;
  validationMessages: any = {
    'firstname': { 'required': 'First Name required', 'minlength': 'firstname should be atleast 4 characters' },
    'lastname': { 'required': 'Last Name required' },
    'gender': { 'required': 'Gender required' },
    'pan': { 'required': 'PAN details required', 'pattern': 'enter valid PAN number' },
    'aadhar': { 'required': 'Aadhar Card required', 'pattern': 'enter valid Aadhar number' },
    // 'countrycode': { 'required': 'Country code required', 'pattern': 'enter valid country code' },
    'phone': { 'required': 'Phone number required', 'pattern': 'enter valid number' },
    'email': { 'required': 'Email required', 'email': 'Enter valid email' },
    'password': { 'required': 'Password required', 'minlength': 'Password should be atleast 6 characters' },
    'address1': { 'required': 'Address required' },
    'pincode': { 'required': 'Pincode required' },
    'city': { 'required': 'City required' },
    'state': { 'required': 'State required' },
    'country': { 'required': 'Country required' },
    'agreement': { 'required': 'Please agree to terms and conditions' }
  };
  formErrors: any = {
    'firstname': '', 'lastname': '', 'gender': '', 'pan': '', 'aadhar': '', /*'countrycode': '',*/ 'phone': '',
    'email': '', 'password': '', 'address1': '', 'pincode': '', 'city': '', 'state': '', 'country': '',
    'agreement': ''
  };
  formSuccess: any = {
    'firstname': '', 'lastname': '', 'gender': '', 'pan': '', 'aadhar': '', /*'countrycode': '',*/ 'phone': '',
    'email': '', 'password': '', 'address1': '', 'pincode': '', 'city': '', 'state': '', 'country': '',
    'agreement': ''
  };

  constructor(private fb: FormBuilder, private router: Router) { }

  ngOnInit(): void {
    this.errors = false;
    this.registrationform = this.fb.group({
      firstname!: ['', [Validators.required, Validators.minLength(4)]],
      lastname!: ['', Validators.required],
      gender!: ['', Validators.required],
      pan!: ['', [Validators.required, Validators.pattern('[a-z]{5}[0-9]{4}[a-z]')]],
      aadhar!: ['', [Validators.required, Validators.pattern('[0-9]{12}')]],
      // countrycode!: ['+91', [Validators.required, Validators.pattern('([+]?\d{1,3})')]],
      phone!: ['', [Validators.required, Validators.pattern('[0-9]{10}')]],
      email!: ['', [Validators.required, Validators.email]],
      password!: ['', [Validators.required, Validators.minLength(6)]],
      address1!: ['', Validators.required],
      address2: [''],
      pincode!: ['', Validators.required],
      city!: ['', Validators.required],
      state!: ['', Validators.required],
      country!: ['', Validators.required],
      agreement!: ['', Validators.required]
    });
    this.registrationform.valueChanges.subscribe((data) => {
      this.logValidationErrors(this.registrationform);
      this.logValidationSuccess(this.registrationform);
    });
  }

  commonBlur(){
    this.logValidationErrors();
    this.logValidationSuccess();
  }
  logValidationErrors(group: FormGroup = this.registrationform): void {
    Object.keys(group.controls).forEach((key) => {
      const abstractControl = group.get(key);
      // if (abstractControl instanceof FormGroup) {
      //   this.logValidationErrors(abstractControl);
      // } else {
      this.formErrors[key] = '';
      if (abstractControl && !abstractControl.valid && (abstractControl.touched || abstractControl.dirty)) {
        const messages = this.validationMessages[key];
        for (const errorKey in abstractControl.errors) {
          if (errorKey) {
            this.formErrors[key] += messages[errorKey] + ' ';
          }
        }
      }
      // }
    });
  }

  logValidationSuccess(group: FormGroup = this.registrationform): void {
    Object.keys(group.controls).forEach((key) => {
      const abstractControl = group.get(key);
      if(abstractControl && this.formErrors[key] && (abstractControl.touched || abstractControl.dirty)){
        this.formSuccess[key]='1';
      }
    });
  }

  onSubmit() {
    if(this.registrationform.valid)
    console.log("OK");
    else
    this.registrationform.invalid;

  }

}

