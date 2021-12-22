import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  loginform!: FormGroup;
  errors!: Boolean;
  
  constructor(private fb: FormBuilder, private router: Router) { }

  ngOnInit(): void {
    this.loginform = this.fb.group({
      userName!: ['',[Validators.required]],
      password!: ['',Validators.required],
    });
    this.errors = false;
  }

  onSubmit() {
    if (this.loginform.get('userName')!.value == "test" && this.loginform.get('password')!.value == "test"){
      this.router.navigate(['/user'])
    }
    else {
      this.errors = true;
    }
  }
}
