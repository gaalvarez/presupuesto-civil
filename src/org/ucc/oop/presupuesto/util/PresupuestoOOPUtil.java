package org.ucc.oop.presupuesto.util;

import org.ucc.oop.presupuesto.Insumo;

public class PresupuestoOOPUtil {

	private Insumo insumo1;
	private Insumo insumo2;

	public Insumo getMaximo() {
		return insumo1.getCosto() > insumo2.getCosto() ? insumo1 : insumo2;
	}

	public Insumo getMinimo() {
		return insumo1.getCosto() < insumo2.getCosto() ? insumo1 : insumo2;
	}

	public Double getSuma() {
		return insumo1.getCosto() + insumo2.getCosto();
	}
}
