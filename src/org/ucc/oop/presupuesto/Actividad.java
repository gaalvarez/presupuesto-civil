/**
 * 
 */
package org.ucc.oop.presupuesto;

/**
 * gustavo.alvarez@campusucc.edu.co
 * 
 * @author iotec_ceo
 *
 */
public class Actividad {

	private String nombre;
	private String unidad;

	public Actividad(String nombre, String unidad) {
		super();
		this.unidad = unidad;
		this.nombre = nombre;
	}

	public String getUnidad() {
		return unidad;
	}

	public String getNombre() {
		return nombre;
	}
}
