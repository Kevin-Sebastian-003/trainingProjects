import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { Registration } from 'src/app/models/registration';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent implements OnInit {
  registrationform!: FormGroup;
  errors!: Boolean;
  model!: Registration;
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
    'pincode': { 'required': 'PIN code required', 'pattern': 'enter valid PIN code' },
    'city': { 'required': 'City required', 'pattern': 'enter valid city' },
    'state': { 'required': 'State required', 'pattern': 'enter valid state' },
    'country': { 'required': 'Country required', 'pattern': 'enter valid country' },
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

  constructor(private fb: FormBuilder, private router: Router) {
    this.model = new Registration();
  }

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
      pincode!: ['', [Validators.required, Validators.pattern('[0-9]{6}')]],
      city!: ['', [Validators.required, Validators.pattern('[a-z]+')]],
      state!: ['', [Validators.required, Validators.pattern('[a-z]+')]],
      country!: ['', [Validators.required, Validators.pattern('[a-z]+')]],
      agreement!: ['', Validators.requiredTrue]
    });
    this.registrationform.valueChanges.subscribe((data) => {
      this.logValidationErrors(this.registrationform);
      this.logValidationSuccess(this.registrationform);
    });
  }

  commonBlur() {
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
      if (abstractControl && !this.formErrors[key] && (abstractControl.touched || abstractControl.dirty)) {
        this.formSuccess[key] = '1';
      }
      else {
        this.formSuccess[key] = '';
      }
    });
  }

  onSubmit() {
    if (this.registrationform.valid) {
      this.model.firstname = this.registrationform.get('firstname')?.value;
      this.model.lastname = this.registrationform.get('lastname')?.value;
      this.model.gender = this.registrationform.get('gender')?.value;
      this.model.pan = this.registrationform.get('pan')?.value;
      this.model.aadhar = this.registrationform.get('aadhar')?.value;
      // this.model.countrycode = this.registrationform.get('countrycode')?.value;
      this.model.phone = this.registrationform.get('phone')?.value;
      this.model.email = this.registrationform.get('email')?.value;
      this.model.password = this.registrationform.get('password')?.value;
      this.model.address = this.registrationform.get('address1')?.value + this.registrationform.get('address2')?.value;
      this.model.pincode = this.registrationform.get('pincode')?.value;
      this.model.city = this.registrationform.get('firstname')?.value;
      this.model.state = this.registrationform.get('state')?.value;
      this.model.country = this.registrationform.get('country')?.value;
      console.log(this.model);
      console.log("OK");
    } else
      console.log("Not ok");

  }

}

