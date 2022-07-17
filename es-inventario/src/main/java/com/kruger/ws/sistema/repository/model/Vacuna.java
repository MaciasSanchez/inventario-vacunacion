/**
 * 
 */
package com.kruger.ws.sistema.repository.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import com.kruger.ws.sistema.model.TipoVacuna;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Angelica
 *
 */
@Getter
@Setter
@Entity
@Table(name = "vacuna")
@SequenceGenerator(name="vaccineSeq",sequenceName = "VACCINE_SEQ",initialValue = 1, allocationSize = 10)
public class Vacuna {
	
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "vaccineSeq")
    private Long id;

	@Column(name = "marca_vacuna")
	@Enumerated(EnumType.STRING)
    private TipoVacuna tipoVacuna;

	@Column(name = "fecha_vacunacion")
	@DateTimeFormat(iso = ISO.DATE)
    private Date fechaVacunacion;


	@Column(name = "dosis")
    private Integer numeroDosis;

}
