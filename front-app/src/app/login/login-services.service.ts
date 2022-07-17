import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { User, UserLog } from '../interfaz/user';

@Injectable({
  providedIn: 'root'
})
export class LoginServicesService {

  constructor(private http: HttpClient) {}


  getUserPor() {
    return this.http.post("http://localhost:8080/api/users/listarUsersPor/",{"id":"61ea6da1364d3b3ae2a0c2f9"})
    .toPromise()
    .then(res => res)
    .then(data => { return data; });
}

  validarlogin(){
    return this.http.get("http://localhost:8080/api/users/listarUsers")
    .toPromise()
    .then(res => res)
    .then(data => { return data; });
  }

  crearUsuario(user:User) {
    return this.http.post("http://localhost:8080/api/users/usersCreate/",user)
    .toPromise()
    .then(res => res)
    .then(data => { return data; });
}

validarCedula(cedula:string) {
  return this.http.post("http://localhost:8080/api/users/usersCreate/",{"cedula":cedula })
  .toPromise()
  .then(res => res)
  .then(data => { return data; });
}

actualizarUsuario(user:User) {
  return this.http.put("http://localhost:8080/api/users/usersUpdate/",user)
  .toPromise()
  .then(res => res)
  .then(data => { return data; });
}

userEnsession:UserLog={
  apellidos:"",cedula:"",  correo:"", id:0, nombres:"", password: "", tipoUser:"", usuario:""
};

obtenerLocalStorage(){

  const value = localStorage.getItem("userLog") // string | null
  let user= JSON.parse(value || '')
 this.userEnsession=user
 return this.userEnsession
}

}
