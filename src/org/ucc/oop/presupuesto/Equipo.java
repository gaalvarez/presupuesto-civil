/**
 * 
 */
package org.ucc.oop.presupuesto;

/**
 * @author iotec_ceo
 *
 */
public class Equipo extends Insumo {

	private TipoEquipo tipo; //"MAQUINARIA", "EQUIPO MANO", "EQUIPO TOPOGRAFICO"
	private String referencia;
	private int rendimiento;
	
	
	public Equipo() {
		this.tipo = TipoEquipo.MAQUINARIA;
	}
	
	public Equipo(TipoEquipo tipo) {
		this.tipo = tipo;
	}

	public TipoEquipo getTipo() {
		return tipo;
	}
}
