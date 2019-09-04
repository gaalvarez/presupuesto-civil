/**
 * 
 */
package org.ucc.oop.presupuesto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

/**
 * @author iotec_ceo
 *
 */
public class ProyectoObra {

	private String nombre;
	private Date fechaInicio;
	private Date fechaFinal;
	private List<ActividadProyecto> actividades;

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

	public void agregarActividad(ActividadProyecto actividad) {
		if (null == this.actividades) {
			this.actividades = new ArrayList<>();
		}
		Optional<ActividadProyecto> actividadBuscada = this.actividades.stream()
				.filter(item -> item.getActividad().getNombre().equals(actividad.getActividad().getNombre()))
				.findFirst();
		// solo agrega la actividad una vez
		if (!actividadBuscada.isPresent()) {
			this.actividades.add(actividad);
		}
	}
}
