import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { AdministracionComponent } from './administracion/administracion.component';
import { ModuloUserComponent } from './modulo-user/modulo-user.component';


const routes: Routes = [

{ path:'', component:LoginComponent},
{ path:'administracion', component:AdministracionComponent},
{ path:'users', component:ModuloUserComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
