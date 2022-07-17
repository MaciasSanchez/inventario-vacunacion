export interface User{
        apellidos: string,
        correo: string,
        id?: string,
        cedula:string,
        nombres: string,
        password: string,
        usuario: string,
        tipoUser:string 
}
export interface UserLog{
    apellidos: string,
    cedula:string,
    correo: string,
    id: number,
    nombres: string,
    password: string,
    usuario: string,
    tipoUser:string  
}