package org.ucc.oop;

import java.util.Date;

import org.ucc.oop.banco.Banco;
import org.ucc.oop.banco.CuentaBancaria;
import org.ucc.oop.banco.Persona;
import org.ucc.oop.banco.Transaccion;

public class MainBanco {

	public static void main(String[] args) {
		Persona egan = new Persona("Egan", "Bernal", "1061234929");
		Banco banco = new Banco("BBVA", "Popayán", "901176940", 1.7f);
		CuentaBancaria cuentaEgan = new CuentaBancaria("123456789", egan, banco);
		Transaccion pagoCampeonTour = new Transaccion(18500000000D, "CONSIGNACION", new Date());
		Transaccion pagoCampeonJoven = new Transaccion(75000000D, "CONSIGNACION", new Date());
		Transaccion retiroVacaciones = new Transaccion(200000000D, "RETIRO", new Date());
		Transaccion impuestosDIAN = new Transaccion(18500000000D*0.33, "RETIRO", new Date());
		cuentaEgan.modificarSaldo(pagoCampeonTour);
		cuentaEgan.modificarSaldo(pagoCampeonJoven);
		cuentaEgan.modificarSaldo(retiroVacaciones);
		cuentaEgan.modificarSaldo(impuestosDIAN);
		
		System.out.println("Saldo: " + cuentaEgan.getSaldo());
		
	}

}
