package com.kruger.ws.sistema.model;

import java.time.LocalDate;
import java.util.List;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class EmpleadoType {

    @JsonProperty("id")
    private Long id;

    @NotNull(message = "La cédula es obligatoria")
    @NotEmpty(message = "La cédula es obligatoria")
    @NotBlank(message = "La cédula es obligatoria")
    @Size(min = 10, max = 10, message = "La cédula debe contener exactamente 10 dígitos")
    @Pattern(regexp = "[0-9]+", message = "El número de cédula debe contener números únicamente")
    @JsonProperty("cedula")
    private String cedula;

    @NotNull(message = "Los nombres son obligatorios")
    @NotEmpty(message = "Los nombres son obligatorios")
    @NotBlank(message = "Los nombres son obligatorios")
    @Pattern(regexp = "[a-zA-ZñÑáéíóúÁÉÍÓÚ\\s]+", message = "Los nombres no deben contener números o caracteres especiales")
    @JsonProperty("nombres")
    private String nombres;

    @NotNull(message = "Los apellidos son obligatorios")
    @NotEmpty(message = "Los apellidos son obligatorios")
    @NotBlank(message = "Los apellidos son obligatorios")
    @Pattern(regexp = "[a-zA-ZñÑáéíóúÁÉÍÓÚ\\s]+", message = "Los apellidos no deben contener números o caracteres especiales")
    @JsonProperty("apellidos")
    private String apellidos;

    @NotNull(message = "El correo electrónico es obligatorio")
    @NotEmpty(message = "El correo electrónico es obligatorio")
    @NotBlank(message = "El correo electrónico es obligatorio")
    @Email(message = "El correo electrónico debe ser válido")
    @JsonProperty("correoElectronico")
    private String correoElectronico;

    @JsonFormat(pattern = "dd-MM-yyyy")
    @PastOrPresent(message = "La fecha de nacimiento debe ser anterior o igual a la fecha actual")
    @JsonProperty("fechaNacimiento")
    private LocalDate fechaNacimiento;

    @JsonProperty("domicilio")
    private String domicilio;

    @Pattern(regexp = "[0-9]+", message = "El número de teléfono móvil debe contener números únicamente")
    @JsonProperty("telefonoMovil")
    private String telefonoMovil;

    @JsonProperty("estadoVacunacion")
    private EstadoVacunacion estadoVacunacion;

    @JsonProperty("vacuna")
    private List<VacunaType> vacuna;

}
