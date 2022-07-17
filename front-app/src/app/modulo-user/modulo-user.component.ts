import { Component, OnInit } from '@angular/core';

import { ModuloUserServicesService } from './modulo-user-services.service';

import { LoginServicesService } from '../login/login-services.service';
import { UserLog } from '../interfaz/user';

@Component({
  selector: 'app-modulo-user',
  templateUrl: './modulo-user.component.html',
  styleUrls: ['./modulo-user.component.css']
})
export class ModuloUserComponent implements OnInit {

  constructor(private moduloUserServicesService:ModuloUserServicesService, private loginServicesService:LoginServicesService) { }



userEnSession:UserLog={apellidos:"", correo:"", id:0, cedula:"", nombres:"", password: "", tipoUser:"", usuario:""}
  ngOnInit(): void {
      this.obtenerVacunas();
      this.userEnSession= this.loginServicesService.obtenerLocalStorage();
  }
  
  arrayVacunas:any
  obtenerVacunas(){
    this.moduloUserServicesService.getVacunas().then(resp => {
      this.arrayVacunas=resp
      console.log(this.arrayVacunas)
    } );
  }

  mensajeConf:boolean=false;
  menssaje:string="";
  seclectedVacuna(vacunaSelecte:any){
      console.log(vacunaSelecte)
    
      
  }


  nuevaVac:boolean=false;
  nuevaVacuna(){
    this.nuevaVac=false;
     this.mensajeConf=false;
  }
}
