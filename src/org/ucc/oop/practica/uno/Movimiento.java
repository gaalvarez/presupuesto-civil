package org.ucc.oop.practica.uno;

import java.util.Date;


public class Movimiento {

	private TipoMovimiento tipoMovimiento;
	private Double monto;
	private Date fecha;

	public Movimiento(TipoMovimiento tipoMovimiento, Double monto, Date fecha) {
		super();
		this.tipoMovimiento = tipoMovimiento;
		this.monto = monto;
		this.fecha = fecha;
	}

	public Movimiento() {
		this.monto = 0D;
	}

	public TipoMovimiento getTipoMovimiento() {
		return tipoMovimiento;
	}

	public void setTipoMovimiento(TipoMovimiento tipoMovimiento) {
		this.tipoMovimiento = tipoMovimiento;
	}

	public Double getMonto() {
		return monto;
	}

	public void setMonto(Double monto) {
		this.monto = monto;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

}
