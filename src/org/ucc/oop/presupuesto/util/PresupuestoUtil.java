package org.ucc.oop.presupuesto.util;

import org.ucc.oop.presupuesto.Insumo;

public class PresupuestoUtil {

	public static Insumo getMaximoCosto(Insumo insumo1, Insumo insumo2) {
		return insumo1.getCosto() > insumo2.getCosto() ? insumo1 : insumo2;
	}

	public static Insumo getMaxCosto(Insumo[] insumos) {
		Insumo insumoInicial = insumos[0];
		for (Insumo insumo : insumos) {
			if (insumoInicial.getCosto() < insumo.getCosto()) {
				insumoInicial = insumo;
			}
		}
		return insumoInicial;
	}

	public static Insumo getMinCosto(Insumo[] insumos) {
		Insumo insumoInicial = insumos[0];
		for (Insumo insumo : insumos) {
			if (insumoInicial.getCosto() > insumo.getCosto()) {
				insumoInicial = insumo;
			}
		}
		return insumoInicial;
	}
}
