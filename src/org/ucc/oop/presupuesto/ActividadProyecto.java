package org.ucc.oop.presupuesto;

import java.util.ArrayList;
import java.util.List;

public class ActividadProyecto {

	private Actividad actividad;
	private List<APU> apus;

	public ActividadProyecto(Actividad actividad) {
		this.actividad = actividad;
	}

	public Actividad getActividad() {
		return this.actividad;
	}
	
	public void agregarApuInsumo(APU apu) {
		if (null == this.apus) {
			this.apus = new ArrayList<>();
		}
		this.apus.add(apu);
	}
}
