/**
 * 
 */
package com.kruger.ws.sistema.repository.contract;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kruger.ws.sistema.repository.model.Empleado;

/**
 * @author Angelica
 *
 */
public interface IEmpleadoRepository extends JpaRepository<Empleado, Long>{
	

}