/**
 * 
 */
package org.ucc.oop.banco;

import java.util.Date;

/**
 * @author iotec_ceo
 *
 */
public class Transaccion {

	private Double monto;
	private String tipo;
	private Date fecha;

	public Transaccion(Double monto, String tipo, Date fecha) {
		super();
		this.monto = monto;
		this.tipo = tipo;
		this.fecha = fecha;
	}

	public Double getMonto() {
		return monto;
	}

	public String getTipo() {
		return tipo;
	}

	public Date getFecha() {
		return fecha;
	}

}
