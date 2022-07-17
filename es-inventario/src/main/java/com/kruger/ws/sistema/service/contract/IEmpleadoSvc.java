/**
 * 
 */
package com.kruger.ws.sistema.service.contract;

import java.util.Date;
import java.util.List;

import com.kruger.ws.sistema.model.EmpleadoAdminType;
import com.kruger.ws.sistema.model.EmpleadoType;
import com.kruger.ws.sistema.model.EstadoVacunacion;
import com.kruger.ws.sistema.model.TipoVacuna;
import com.kruger.ws.sistema.utils.exceptions.BusinessException;

/**
 * @author Angelica
 *
 */
public interface IEmpleadoSvc {
	
	EmpleadoAdminType crearEmpleado(EmpleadoAdminType empleadoType)throws BusinessException;
	EmpleadoAdminType actualizarEmpleado (EmpleadoAdminType empleadoType)throws BusinessException;
	Boolean eliminarEmpleado(String empleadoId) throws BusinessException;
	List<EmpleadoType> consultaEmpleadoPorEstadoVacunacion(EstadoVacunacion estado);
	List<EmpleadoType> consultaEmpleadoPorRangoFechaVacunacion(Date fechaDesde, Date fechaHasta);
	List<EmpleadoType> consultaEmpleadoPorTipoVacuna(TipoVacuna vacuna);
	List<EmpleadoType> consultaEmpleadosFiltros(EstadoVacunacion estado, TipoVacuna vacuna, Date fechaDesde, Date fechaHasta);

}
