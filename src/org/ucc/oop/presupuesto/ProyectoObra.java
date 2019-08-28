/**
 * 
 */
package org.ucc.oop.presupuesto;

import java.util.Date;

/**
 * @author iotec_ceo
 *
 */
public class ProyectoObra {

	private String nombre;
	private Date fechaInicio;
	private Date fechaFinal;
	private Actividad[] actividades;
	
	public ProyectoObra(String nombre) {
		this.nombre = nombre;
	}
	
	public ProyectoObra(String nombre, Date fechaInicio) {
		this.nombre = nombre;
		this.fechaInicio = fechaInicio;
	}
	
	public ProyectoObra(String nombre, Date fechaInicio, Date fechaFinal) {
		this.nombre = nombre;
		this.fechaFinal = fechaFinal;
	}
	
	public String getNombre() {
		return this.nombre;
	}
}
