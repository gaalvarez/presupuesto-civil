/**
 * 
 */
package org.ucc.oop.presupuesto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author iotec_ceo
 *
 */
public class Store {

	private List<Actividad> actividades = new ArrayList<>();
	private List<ProyectoObra> proyectos = new ArrayList<>();
	private List<Insumo> insumos = new ArrayList<>();

	public Store() {
		this.initActividades();
	}

	private void initActividades() {
		this.actividades = Arrays.asList(new Actividad[] { new Actividad("Localización y replanteo", "m2"),
				new Actividad("Movimiento Tierra", "m3"), new Actividad("Relleno para estructuras", "m3"),
				new Actividad("Cuneta en concetro", "m3"), new Actividad("Excavaciones Varias", "m3") });
	}

	public List<Actividad> getActividades() {
		return this.actividades;
	}
	
	/*TODO: inicializar los insumos de la misma forma que las actividades*/
}
