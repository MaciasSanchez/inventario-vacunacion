/**
 * 
 */
package com.kruger.ws.sistema.controller.contract;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kruger.ws.sistema.model.EmpleadoAdminType;
import com.kruger.ws.sistema.model.RespuestaType;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

/**
 * @author Angelica
 *
 */
public interface IEmpleadoAdminController {
	
	
	@Operation(summary = "crearEmpleado", description = "Crear un nuevo empleado", tags = { "Administrador" })
	@ApiResponses(value = {
			@ApiResponse(responseCode = "201", description = "Created", content = @Content(schema = @Schema(implementation = RespuestaType.class))),
			@ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(schema = @Schema(implementation = RespuestaType.class))),
			@ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(schema = @Schema(implementation = RespuestaType.class))) })
	@RequestMapping(value = "/empleados", produces = "application/json; charset=UTF-8", consumes = "application/json; charset=UTF-8", method = RequestMethod.POST)
	ResponseEntity<RespuestaType> crearEmpleado(
			@Parameter(in = ParameterIn.DEFAULT, description = "Empleado", required = true, schema = @Schema()) @Valid @RequestBody EmpleadoAdminType body);

	@Operation(summary = "actualizarEmpleado", description = "Actualizar Empleado", tags = { "Administrador" })
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "OK", content = @Content(schema = @Schema(implementation = RespuestaType.class))),
			@ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(schema = @Schema(implementation = RespuestaType.class))),
			@ApiResponse(responseCode = "404", description = "Not Found", content = @Content(schema = @Schema(implementation = RespuestaType.class))),
			@ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(schema = @Schema(implementation = RespuestaType.class))) })
	@RequestMapping(value = "/empleados/{id}", produces = "application/json; charset=UTF-8", consumes = "application/json; charset=UTF-8", method = RequestMethod.PUT)
	ResponseEntity<RespuestaType> actualizarEmpleado(
			@Parameter(in = ParameterIn.DEFAULT, description = "Empleado", required = true, schema = @Schema()) @Valid @RequestBody EmpleadoAdminType body);

	@Operation(summary = "eliminarEmpleado", description = "Elimina un Empleado por ID", tags = { "Administrador" })
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "OK", content = @Content(schema = @Schema(implementation = Boolean.class))),
			@ApiResponse(responseCode = "204", description = "No Content", content = @Content(schema = @Schema(implementation = RespuestaType.class))),
			@ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(schema = @Schema(implementation = RespuestaType.class))),
			@ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(schema = @Schema(implementation = RespuestaType.class))) })
	@RequestMapping(value = "/empleados/{Id}", produces = "application/json; charset=UTF-8", method = RequestMethod.DELETE)
	ResponseEntity<?> eliminarCliente(
			@Parameter(in = ParameterIn.PATH, description = "Empleado", required = true, schema = @Schema()) @PathVariable("empleadoId") String empleadoId);

//	@Operation(summary = "consulta cliente por identificación", description = "consulta cliente por identificación", tags={ "Clientes" })
//    @ApiResponses(value = { 
//        @ApiResponse(responseCode = "200", description = "OK", content = @Content(schema = @Schema(implementation = ClienteType.class))),
//        @ApiResponse(responseCode = "204", description = "No Content", content = @Content(schema = @Schema(implementation = RespuestaType.class))),
//        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(schema = @Schema(implementation = RespuestaType.class))),
//        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(schema = @Schema(implementation = RespuestaType.class))) })
//    @RequestMapping(value = "/clientes/{numIdentificacion}",
//        produces = "application/json; charset=UTF-8", 
//        method = RequestMethod.GET)
//    ResponseEntity<?> consultarClientePorIdentificacion(@Parameter(in = ParameterIn.PATH, description = "num.de Identificación del Cliente", required=true, schema=@Schema()) @PathVariable("numIdentificacion") String numIdentificacion);
//	
//	@Operation(summary = "consulta clientes por estado", description = "consulta clientes por estado", tags={ "Clientes" })
//    @ApiResponses(value = { 
//        @ApiResponse(responseCode = "200", description = "OK", content = @Content(array = @ArraySchema(schema = @Schema(implementation = ClienteType.class)))),
//        @ApiResponse(responseCode = "204", description = "No Content", content = @Content(schema = @Schema(implementation = RespuestaType.class))),
//        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(schema = @Schema(implementation = RespuestaType.class))),
//        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(schema = @Schema(implementation = RespuestaType.class))) })
//    @RequestMapping(value = "/clientes/estado/{estado}",
//        produces = "application/json; charset=UTF-8", 
//        method = RequestMethod.GET)
//    ResponseEntity<?> consultarClientesPorEstado(@Parameter(in = ParameterIn.PATH, description = "estado del cliente", required=true, schema=@Schema()) @PathVariable("estado") Boolean estado);

	

}
