package org.ucc.oop;

import java.util.Date;

import org.ucc.oop.practica.uno.CuentaBancaria;
import org.ucc.oop.practica.uno.Movimiento;
import org.ucc.oop.practica.uno.Persona;
import org.ucc.oop.practica.uno.TipoMovimiento;
import org.ucc.oop.practica.uno.Titular;

public class MainCuentaBancaria {

	public static void main(String[] args) {
		Titular egan = new Persona("Egan", "Bernal", "5432187");
		CuentaBancaria cuenta = new CuentaBancaria("123456789", 0D, true, egan, 1.5f);
		cuenta.registrarMovimiento(new Movimiento(TipoMovimiento.CONSIGNACION, 1850000000D, new Date()));
		cuenta.registrarMovimiento(new Movimiento(TipoMovimiento.CONSIGNACION, 74000000D, new Date()));
		cuenta.registrarMovimiento(new Movimiento(TipoMovimiento.CONSIGNACION, 4610390893D, new Date()));
		cuenta.registrarMovimiento(new Movimiento(TipoMovimiento.RETIRO, 5000000D, new Date()));
		cuenta.registrarMovimiento(new Movimiento(TipoMovimiento.RETIRO, 200000000D, new Date()));
		cuenta.registrarMovimiento(new Movimiento(TipoMovimiento.RETIRO, 1850000000D*0.33D, new Date()));
		System.out.println("Saldo de la cuenta: " + cuenta.getSaldo());
	}
}
