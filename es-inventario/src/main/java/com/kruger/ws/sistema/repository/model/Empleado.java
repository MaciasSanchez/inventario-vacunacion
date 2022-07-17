/**
 * 
 */
package com.kruger.ws.sistema.repository.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import com.kruger.ws.sistema.model.EstadoVacunacion;
import com.kruger.ws.sistema.model.VacunaType;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Angelica
 *
 */
@Getter
@Setter
@Entity
@Table(name = "empleados")
@SequenceGenerator(name="EmployeeSeq",sequenceName = "EMPLOYEES_SEQ",initialValue = 1, allocationSize = 10)
public class Empleado {
	
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EmployeeSeq")
    private Long id;

	@Column(name = "cedula", unique = true)
    private String cedula;

	@Column(name = "nombres")
    private String nombres;

	@Column(name = "apellidos")
    private String apellidos;

	@Column(name = "email")
    private String correoElectronico;

	@Column(name = "fecha_nacimiento")
	@DateTimeFormat(iso = ISO.DATE)
    private Date fechaNacimiento;
	

	@Column(name = "domicilio")
	private String domicilio;

	@Column(name = "telefono-movil")
    private String telefonoMovil;

	@Column(name = "estado_vacunacion")
	@Enumerated(EnumType.STRING)
    private EstadoVacunacion estadoVacunacion;

	@OneToOne(optional = false, cascade = CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="vacuna", referencedColumnName = "id", nullable = true)
    private List<VacunaType> vacuna;

}
