package org.ucc.oop.banco;

public class CuentaBancaria {

	private String numero;
	private Double saldo;
	private Persona titular;
	private Banco banco;
	private boolean estado;
	private Transaccion[] transacciones;

	public CuentaBancaria(String numero, Persona titular, Banco banco) {
		super();
		this.saldo = 0D;
		this.estado = true;
		this.transacciones = new Transaccion[10000];
		this.numero = numero;
		this.titular = titular;
		this.banco = banco;
	}

	public void consignar(Double monto) {
		this.saldo += monto;
	}

	public void retirar(Double monto) {
		this.saldo -= monto;
	}

	public Double getSaldo() {
		return saldo;
	}
	
	public void modificarSaldo(Transaccion transaccion ) {
		if (transaccion.getTipo().equals("CONSIGNACION")) {
			this.consignar(transaccion.getMonto());
		}
		if (transaccion.getTipo().equals("RETIRO")) {
			this.retirar(transaccion.getMonto());
		}
	}

	public Double obtenerInteresGenerado() {
		return ((this.banco.getInteres() / 100) * this.saldo) / 12;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public Transaccion[] getTransacciones() {
		return transacciones;
	}

	public void setTransacciones(Transaccion[] transacciones) {
		this.transacciones = transacciones;
	}

	public String getNumero() {
		return numero;
	}

	public Persona getTitular() {
		return titular;
	}

	public Banco getBanco() {
		return banco;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
}
