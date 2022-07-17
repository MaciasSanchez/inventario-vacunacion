/**
 * 
 */
package com.kruger.ws.sistema.model;

/**
 * @author Angelica
 *
 */
public enum EstadoVacunacion {
	
	VACUNADO("VACUNADO"),
	NO_VACUNADO("NO_VACUNADO");
	
	private String value;
	
	EstadoVacunacion(String value){
		this.value = value;
	}
	 public String getValue() {
	      return value;
	    }

	@Override
	public String toString() {
	      return String.valueOf(value);
	    }

	public static EstadoVacunacion fromValue(String value) {
	      for (EstadoVacunacion b : EstadoVacunacion.values()) {
	        if (b.value.equals(value)) {
	          return b;
	        }
	      }
	      throw new IllegalArgumentException("Unexpected value '" + value + "'");
	    }

}
