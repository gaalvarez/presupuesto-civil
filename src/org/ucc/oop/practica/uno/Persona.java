/**
 * 
 */
package org.ucc.oop.practica.uno;

/**
 * @author iotec_ceo
 *
 */
public class Persona implements Titular {

	private String nombres;
	private String apellidos;
	private String identificacion;

	public Persona(String nombres, String apellidos, String identificacion) {
		super();
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.identificacion = identificacion;
	}

	@Override
	public String getIdentificacion() {
		return this.identificacion;
	}

	public String getNombres() {
		return nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

}
