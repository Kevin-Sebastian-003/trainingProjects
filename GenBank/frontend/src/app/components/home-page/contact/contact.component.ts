import { Component, OnInit, Directive, forwardRef, Attribute,OnChanges, SimpleChanges,Input } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { Contact } from 'src/app/models/contact';

@Component({
  selector: 'app-home-contact',
  templateUrl: './contact.component.html',
  styleUrls: ['./contact.component.css']
})
export class ContactComponent implements OnInit{

  contactForm!: FormGroup;
  submitted = false;
  model!: Contact
  constructor(private fb: FormBuilder){ 
    this.model = new Contact();
  }

  ngOnInit() {
    // this.contactForm = this.fb.group({
    //   fullName: [''],
    //   email: [''],
    //   phoneNo: [''],
    //   message: ['']
    // })
    this.contactForm = this.fb.group({
      fullName!: ['', [Validators.required, Validators.minLength(4)]],
      email!: ['', [Validators.required, Validators.email]],
      phoneNo!: ['',[Validators.required, Validators.minLength(10), Validators.maxLength(10)]],
      message!: ['', Validators.required]
    })
  }


  onSubmit() {
    this.model.fullName = this.contactForm.get('fullName')!.value;
    this.model.email = this.contactForm.get('email')!.value;
    this.model.phoneNo = this.contactForm.get('phoneNo')!.value;
    this.model.message = this.contactForm.get('message')!.value;
    this.model.setDateTime();
    console.log(this.model)
    this.submitted = true;
  }

}