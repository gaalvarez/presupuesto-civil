/**
 * 
 */
package org.ucc.oop;

import org.ucc.oop.presupuesto.Equipo;
import org.ucc.oop.presupuesto.ProyectoObra;
import org.ucc.oop.presupuesto.TipoEquipo;

/**
 * @author iotec_ceo
 *
 */
public class MainPresupuesto {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Equipo equipo = new Equipo();
		Equipo equipo2 = new Equipo(TipoEquipo.EQUIPO_TOPOGRAFICO);
		Equipo equipo3 = new Equipo(TipoEquipo.MAQUINARIA);
		System.out.println(equipo.getTipo());
		System.out.println(equipo2.getTipo());
		System.out.println(equipo3.getTipo());
	}

}
