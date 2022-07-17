/**
 * 
 */
package com.kruger.ws.sistema.controller.impl;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.kruger.ws.sistema.controller.contract.IEmpleadoAdminController;
import com.kruger.ws.sistema.model.EmpleadoAdminType;
import com.kruger.ws.sistema.model.RespuestaType;

/**
 * @author Angelica
 *
 */
@RestController
@CrossOrigin(origins = "*")
public class EmpleadoAdminController implements IEmpleadoAdminController {

	@Override
	public ResponseEntity<RespuestaType> crearEmpleado(@Valid EmpleadoAdminType body) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<RespuestaType> actualizarEmpleado(@Valid EmpleadoAdminType body) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<?> eliminarCliente(String empleadoId) {
		// TODO Auto-generated method stub
		return null;
	}

}
