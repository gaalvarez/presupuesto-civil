package org.ucc.oop;

import java.awt.EventQueue;

import org.ucc.oop.presupuesto.ui.CrearProyectoFrame;

public class Main {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CrearProyectoFrame frame = new CrearProyectoFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}