package org.ucc.oop.presupuesto;

public class Insumo {

	private String nombre;
	private String descripcion;
	private Double costo;

	public Insumo() {

	}

	public Insumo(String nombre, String descripcion, Double costo) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.costo = costo;
	}

	public Double getCosto() {
		return this.costo;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}
}
