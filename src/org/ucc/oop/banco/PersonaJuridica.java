/**
 * 
 */
package org.ucc.oop.banco;

/**
 * @author iotec_ceo
 *
 */
public class PersonaJuridica implements Titular {

	private String razonSocial;
	private String nit;
	
	

	public PersonaJuridica(String razonSocial, String nit) {
		super();
		this.razonSocial = razonSocial;
		this.nit = nit;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public String getNit() {
		return nit;
	}

	public void setNit(String nit) {
		this.nit = nit;
	}

	@Override
	public String getNombres() {
		return this.razonSocial;
	}

	@Override
	public String getIdentificacion() {
		return this.nit;
	}

}
