package org.ucc.oop.presupuesto.ui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.ucc.oop.presupuesto.ProyectoObra;

public class CrearProyectoFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel labelUsername = new JLabel("Nombre Proyecto: ");
	private JTextField textUsername = new JTextField(20);
	private JButton buttonLogin = new JButton("Crear");
	private ProyectoObra proyecto;

	/**
	 * Create the frame.
	 */
	public CrearProyectoFrame() {
		this.contentPane = new JPanel(new GridBagLayout());

		GridBagConstraints constraints = new GridBagConstraints();
		constraints.anchor = GridBagConstraints.WEST;
		constraints.insets = new Insets(10, 10, 10, 10);
		constraints.gridx = 0;
		constraints.gridy = 0;
		contentPane.add(labelUsername, constraints);

		GridBagConstraints constraints2 = new GridBagConstraints();
		constraints2.anchor = GridBagConstraints.WEST;
		constraints2.insets = new Insets(10, 10, 10, 10);
		constraints2.gridy = 0;
		constraints2.gridx = 1;
		contentPane.add(textUsername, constraints2);

		GridBagConstraints constraints3 = new GridBagConstraints();
		constraints3.anchor = GridBagConstraints.CENTER;
		constraints3.insets = new Insets(10, 10, 10, 10);
		constraints3.gridy = 1;
		constraints3.gridx = 0;
		constraints3.gridwidth = 2;
		buttonLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				accionCrearProyecto();
			}
		});
		contentPane.add(buttonLogin, constraints3);

		// set border for the panel
		contentPane.setBorder(
				BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Creación de Proyecto-Obra"));

		// add the panel to this frame
		getContentPane().add(contentPane);

		this.pack();
		setLocationRelativeTo(null);
	}

	private void accionCrearProyecto() {
		String nombre = this.textUsername.getText();
		this.proyecto = new ProyectoObra(nombre);
		AgregarActividadItemFrame actividad = new AgregarActividadItemFrame(this.proyecto);
		actividad.setVisible(true);
		setVisible(false);
	}

}
