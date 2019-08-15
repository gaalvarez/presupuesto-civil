/**
 * 
 */
package org.ucc.oop.practica.uno;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author iotec_ceo
 *
 */
public class CuentaBancaria {

	private String numero;
	private Double saldo;
	private boolean estado;
	private Titular titular;
	private Movimiento[] movimientos = new Movimiento[1000];
	private float interes;
	private int indiceMovimientos = 0;
	private Logger log = Logger.getLogger(CuentaBancaria.class.getName());

	public CuentaBancaria(String numero, Double saldo, boolean estado, Titular titular, float interes) {
		super();
		this.numero = numero;
		this.saldo = saldo;
		this.estado = estado;
		this.titular = titular;
		this.interes = interes;
	}

	public String getNumero() {
		return numero;
	}

	private void consignar(Double monto) {
		if (monto >= 0) {
			this.saldo += monto;
		} else {
			log.log(Level.WARNING, "No puede consignar un valor negativo: " + monto);
		}
	}

	private void retirar(Double monto) {
		if (this.saldo >= monto) {
			this.saldo -= monto;
		} else {
			log.log(Level.WARNING, "No hay suficiente saldo en la cuenta para el retiro de: " + monto);
		}
	}

	public void registrarMovimiento(Movimiento movimiento) {
		this.movimientos[indiceMovimientos++] = movimiento;
		if (TipoMovimiento.RETIRO.equals(movimiento.getTipoMovimiento())) {
			this.retirar(movimiento.getMonto());
		} else {
			this.consignar(movimiento.getMonto());
		}
	}

	public Movimiento consultarInteresMensual() {
		if (estado) {
			Double montoInteres = ((interes / 100) * saldo) / 12;
			return new Movimiento(TipoMovimiento.ABONO, montoInteres, new Date());
		} else {
			log.log(Level.WARNING, "La cuenta no está activa");
			return new Movimiento();
		}
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public Titular getTitular() {
		return titular;
	}

	public void setTitular(Titular titular) {
		this.titular = titular;
	}

	public Movimiento[] getMovimientos() {
		return movimientos;
	}

	public void setMovimientos(Movimiento[] movimientos) {
		this.movimientos = movimientos;
	}

}
