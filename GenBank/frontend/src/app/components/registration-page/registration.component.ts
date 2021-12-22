import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent implements OnInit {
  registrationform!: FormGroup;
  
  constructor(private fb: FormBuilder, private router: Router) { }

  ngOnInit(): void {

  }
  onSubmit() {
    alert("sasas");
  }
}
