import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AboutComponent } from './components/about-page/about.component';
import { AdminPageComponent } from './components/admin-page/admin-page.component';
import { HomeComponent } from './components/home-page/home.component';
import { LoginComponent } from './components/login-page/login.component';
import { RegistrationComponent } from './components/registration-page/registration.component';
import { UserPageComponent } from './components/user-page/user-page.component';

const routes: Routes = [
  { path: '', component: HomeComponent, data: { title: 'Homepage' } },
  { path: 'home',  component: HomeComponent, data: { title: 'Homepage' } },
  { path: 'login',  component: LoginComponent, data: { title: 'Login' } },
  { path: 'registration',  component: RegistrationComponent, data: { title: 'Registration' } },
  { path: 'about',  component: AboutComponent, data: { title: 'About' } },
  { path: 'user',  component: UserPageComponent, data: { title: 'User Page' } },
  { path: 'admin',  component: AdminPageComponent, data: { title: 'Admin Page' } },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
