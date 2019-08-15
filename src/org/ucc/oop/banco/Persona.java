/**
 * 
 */
package org.ucc.oop.banco;

/**
 * @author iotec_ceo
 *
 */
public class Persona {

	private String nombres;
	private String apellidos;
	private String identificacion;

	public Persona(String nombres, String apellidos, String identificacion) {
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.identificacion = identificacion;
	}

	public String getNombres() {
		return nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public String getIdentificacion() {
		return identificacion;
	}

}
