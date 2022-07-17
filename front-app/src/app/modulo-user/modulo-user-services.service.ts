import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})
export class ModuloUserServicesService {

  constructor(private http: HttpClient) {}

  getVacunas() {
    return this.http.get("")
    .toPromise()
    .then(res => res)
    .then(data => { return data; });
}

ActualizarVacuna(vacunaSelecte:any) {
  return this.http.post("http://localhost:8080/api/compras/comprasCreate/",vacunaSelecte)
  .toPromise()
  .then(res => res)
  .then(data => { return data; });
}

getFactruas() {
  return this.http.get("http://localhost:8080/api/compras/listarCompras/")
  .toPromise()
  .then(res => res)
  .then(data => { return data; });
}


getUsuariosAgregados() {
  return this.http.get("http://localhost:8080/api/compras/listarComprasPor/")
  .toPromise()
  .then(res => res)
  .then(data => { return data; });
}

}
