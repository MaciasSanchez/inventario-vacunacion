import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {DropdownModule} from 'primeng/dropdown';
import { LoginComponent } from './login/login.component';
import {CardModule} from 'primeng/card';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import {ButtonModule} from 'primeng/button';
import {InputTextModule} from 'primeng/inputtext';
import { AdministracionComponent } from './administracion/administracion.component';
import { HttpClientModule } from '@angular/common/http';
import {TableModule} from 'primeng/table';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { ModuloUserComponent } from './modulo-user/modulo-user.component';
import {DialogModule} from 'primeng/dialog';
import {MessagesModule} from 'primeng/messages';
import {MessageModule} from 'primeng/message';
import {ToastModule} from 'primeng/toast';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    AdministracionComponent,
    ModuloUserComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    DropdownModule,
    CardModule,
    FormsModule,
    ButtonModule,
    InputTextModule,
    HttpClientModule,
    TableModule,
    ReactiveFormsModule,
    FormsModule,
    BrowserAnimationsModule,
    DialogModule,
    MessagesModule,
    MessageModule,
    ToastModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
