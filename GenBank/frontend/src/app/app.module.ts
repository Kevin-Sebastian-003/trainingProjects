import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { ReactiveFormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './components/main-components/navbar/navbar.component';
import { FooterComponent } from './components/main-components/footer/footer.component';
import { HeaderComponent } from './components/home-page/header/header.component';
import { FeaturesComponent } from './components/home-page/features/features.component';
import { ContactComponent } from './components/home-page/contact/contact.component';
import { HomeComponent } from './components/home-page/home.component';
import { LoginComponent } from './components/login-page/login.component';
import { RegistrationComponent } from './components/registration-page/registration.component';
import { UserPageComponent } from './components/user-page/user-page.component';
import { AdminPageComponent } from './components/admin-page/admin-page.component';
import { AboutComponent } from './components/about-page/about.component';
import { FundTransferComponent } from './components/user-page/fund-transfer/fund-transfer.component';
import { AccountsComponent } from './components/admin-page/accounts/accounts.component';
import { TransactionsComponent } from './components/admin-page/transactions/transactions.component';
import { DepositsComponent } from './components/user-page/deposits/deposits.component';
import { AccountOverviewComponent } from './components/user-page/account-overview/account-overview.component';
import { UsersComponent } from './components/admin-page/users/users.component';

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    FooterComponent,
    HeaderComponent,
    FeaturesComponent,
    ContactComponent,
    HomeComponent,
    LoginComponent,
    RegistrationComponent,
    UserPageComponent,
    AdminPageComponent,
    AboutComponent,
    AccountOverviewComponent,
    FundTransferComponent,
    AccountsComponent,
    TransactionsComponent,
    DepositsComponent,
    UsersComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
