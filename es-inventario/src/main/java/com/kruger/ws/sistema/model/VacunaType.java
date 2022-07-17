/**
 * 
 */
package com.kruger.ws.sistema.model;

import java.time.LocalDate;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Positive;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Angelica
 *
 */
@Getter
@Setter
public class VacunaType {
	
	@JsonProperty("id")
    private Long id;

    @NotNull(message = "El tipo de vacuna aplicado es obligatorio")
    @JsonProperty("tipoVacuna")
    private TipoVacuna tipoVacuna;

    @JsonFormat(pattern = "dd-MM-yyyy")
    @NotNull(message = "La fecha de vacunación es obligatoria")
    @PastOrPresent(message = "La fecha de vacunación debe ser anterior o igual a la fecha actual")
    @JsonProperty("fechaVacunacion")
    private LocalDate fechaVacunacion;


    @NotNull(message = "El número de dosis aplicados es obligatorio")
    @Positive(message = "El número ingresado debe ser mayor a 0")
    @JsonProperty("numeroDosis")
    private Integer numeroDosis;

}
