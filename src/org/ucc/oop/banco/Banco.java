package org.ucc.oop.banco;

public class Banco {

	private String nombre;
	private String direccion;
	private String nit;
	private float interes;

	public Banco(String nombre, String direccion, String nit, float interese) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.nit = nit;
		this.interes = interese;
	}
	
	public float getInteres() {
		return this.interes;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getNit() {
		return nit;
	}
}
