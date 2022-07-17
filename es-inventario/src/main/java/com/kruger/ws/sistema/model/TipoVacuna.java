/**
 * 
 */
package com.kruger.ws.sistema.model;

/**
 * @author Angelica
 *
 */
public enum TipoVacuna {
	
    SPUTNIK("SPUTNIK"), 
    ASTRAZENECA("ASTRAZENECA"), 
    PFIZER("PFIZER"), 
    JHONSON_AND_JHONSON("JHONSON&JHONSON");

	
	private String value;
	
	TipoVacuna(String value){
		this.value = value;
	}
	 public String getValue() {
	      return value;
	    }

	@Override
	public String toString() {
	      return String.valueOf(value);
	    }

	public static TipoVacuna fromValue(String value) {
	      for (TipoVacuna b : TipoVacuna.values()) {
	        if (b.value.equals(value)) {
	          return b;
	        }
	      }
	      throw new IllegalArgumentException("Unexpected value '" + value + "'");
	    }

}
