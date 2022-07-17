import { Component, OnInit } from '@angular/core';
import { LoginServicesService } from '../login/login-services.service';
import { User, UserLog } from '../interfaz/user';
import { Router } from '@angular/router';
import { ModuloUserServicesService } from '../modulo-user/modulo-user-services.service';
import { MessageService } from 'primeng/api';

@Component({
  selector: 'app-administracion',
  templateUrl: './administracion.component.html',
  styleUrls: ['./administracion.component.css'],
  providers: [MessageService]
})
export class AdministracionComponent implements OnInit {
 
  constructor(private messageService: MessageService, private loginServicesService:LoginServicesService,private router:Router, private moduloUserServicesService:ModuloUserServicesService) {

   }

  
  comprasClientes:any;
  optionCargo=["Administrador","Empleado"]
  userEnSession:UserLog={apellidos:"",cedula:"", correo:"", id:0, nombres:"", password: "", tipoUser:"", usuario:""}

  ngOnInit() {
   
     this.userEnSession= this.loginServicesService.obtenerLocalStorage();
     console.log("ESTA LOGEADO")
     console.log(this.userEnSession)
    
  }

  arrayComprasTemp:any[]=[];
  arrayCompras:any[]=[];
  Nombresompras:any[]=[];
  
  UsuariosList:any


  objCrearUser:User={
    apellidos:"",
    correo:"",
    cedula:"",
    nombres:"",
    password:"",
    usuario:"",
    tipoUser:"",
    id:""
  }

  objCrearNuevoUser:User={
    apellidos:"",
    correo:"",
    cedula:"",
    nombres:"",
    password:"",
    usuario:"",
    tipoUser:""
  }

  vistaUser:boolean=false;
  vistaCrearUsuario(){
    this.vistaUser=true;
  }


  display:boolean=false
  

  seclectedUser(usuarios:User){
    this.objCrearUser=usuarios;
    this.vistaUser=true;
        console.log(usuarios)
  }

 
  getUsuariosAgregados(){
    this.moduloUserServicesService.getUsuariosAgregados().then(respu =>{
      console.log(respu)
      this.UsuariosList=respu
       })
  }


 respuestaValidar:any;
  guardarUsuario(){
   
    this.objCrearUser.usuario= this.objCrearUser.correo
    console.log( this.objCrearUser) 
    this.loginServicesService.validarCedula(this.objCrearUser.cedula).then(resp => {
      this.respuestaValidar=resp
      if ( this.respuestaValidar.code !==400) {
        this.loginServicesService.crearUsuario(this.objCrearUser).then(res => {

       })
      }
      else{
        this.messageService.add({severity:'error',detail:'CEDULA INVALIDA',summary:'Error'})
      }


    })
   
   
  }

 
}
