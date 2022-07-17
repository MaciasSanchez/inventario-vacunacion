import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { LoginServicesService } from './login-services.service';
import { UserLog, User } from '../interfaz/user';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(private router:Router, private loginServicesService:LoginServicesService ) { 
    
  }
  password:string="";
  user:string="";
  text:string="";
  userLog:UserLog={
    apellidos:"",
    cedula:"",
    correo:"",
    id:0,
    nombres:"",
    password:"",
    usuario:"",
    tipoUser:""
  };

  objCrearUser:User={
    apellidos:"",
    cedula:"",
    correo:"",
    nombres:"",
    password:"",
    usuario:"",
    tipoUser:""
  }


  df:string="";
  validarlogin(){
    var usuarioTemp:UserLog[]= [ {  id:1, cedula:"0930548151",correo:"albeirogir@live.com",apellidos:"giraldo baquerizo",nombres:"brenyx albeiro",usuario:"agiraldo", password:"1234", tipoUser:"Administrador" },
    { id:2,cedula:"0930548151", correo:"amacias@live.com",apellidos:"Macias Sanchez",nombres:"Angelica Maria",usuario:"amacias" ,password:"1234", tipoUser:"Empleado"  } ]           // this.usuarios  descomentar esto para cuando ya se consuma  servicio
    console.log(usuarioTemp)
  
    usuarioTemp.forEach(element => {

      if (this.password== element.password && (this.user==element.correo || this.user==element.usuario ) ) {
        
        this.userLog=element;
        console.log(element)
        localStorage.setItem("userLog",JSON.stringify(this.userLog));
        if (element.tipoUser =="Administrador") {
          this.router.navigate(['administracion']);
        }else{
          this.router.navigate(['users']);
        }
      }else{
        this.text="USUARIO O CONTRASEÑA INCORRECTO"
      }
    });
    

    console.log(this.UserEnSession)
  }

 usuarios:any;
  ngOnInit(): void {
 // this.consultarUsuario(); servicio para consumir usuario
  }

 
 
UserEnSession:any;
obtenerLocalStorage(){

  const value = localStorage.getItem("userLog") // string | null
  let user= JSON.parse(value || '')
 this.UserEnSession=user
}


mostrarLogin:boolean=true;
mostrarRegistro:boolean=false;
registro(){
  this.mostrarLogin=false;
this.mostrarRegistro=true;

}



consultarUsuario(){
  this.loginServicesService.validarlogin().then(resp => {
    this.usuarios=resp
    console.log(this.usuarios)
  } )
}


}
