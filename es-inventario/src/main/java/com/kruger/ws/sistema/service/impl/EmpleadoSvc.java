package com.kruger.ws.sistema.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.kruger.ws.sistema.model.EmpleadoAdminType;
import com.kruger.ws.sistema.model.EmpleadoType;
import com.kruger.ws.sistema.model.EstadoVacunacion;
import com.kruger.ws.sistema.model.TipoVacuna;
import com.kruger.ws.sistema.repository.contract.IEmpleadoRepository;
import com.kruger.ws.sistema.service.contract.IEmpleadoSvc;
import com.kruger.ws.sistema.utils.exceptions.BusinessException;
import com.nttdata.ws.prueba.repository.model.Cliente;
import com.nttdata.ws.prueba.utils.ClienteConvert;

/**
 * @author Angelica
 *
 */
public class EmpleadoSvc implements IEmpleadoSvc {
	
	@Autowired
	IEmpleadoRepository empleadoRepository;

	@Override
	public EmpleadoAdminType crearEmpleado(EmpleadoAdminType empleadoType) throws BusinessException {
		// TODO Auto-generated method stub
		
		Cliente cliente = empleadoRepository.save(ClienteConvert.typeToModel(clienteType));
		return ClienteConvert.modelToType(cliente);
		return null;
	}

	@Override
	public EmpleadoAdminType actualizarEmpleado(EmpleadoAdminType empleadoType) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean eliminarEmpleado(String empleadoId) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EmpleadoType> consultaEmpleadoPorEstadoVacunacion(EstadoVacunacion estado) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EmpleadoType> consultaEmpleadoPorRangoFechaVacunacion(Date fechaDesde, Date fechaHasta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EmpleadoType> consultaEmpleadoPorTipoVacuna(TipoVacuna vacuna) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EmpleadoType> consultaEmpleadosFiltros(EstadoVacunacion estado, TipoVacuna vacuna, Date fechaDesde,
			Date fechaHasta) {
		// TODO Auto-generated method stub
		return null;
	}

}
