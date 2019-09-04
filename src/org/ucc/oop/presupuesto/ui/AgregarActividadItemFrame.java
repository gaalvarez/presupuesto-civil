package org.ucc.oop.presupuesto.ui;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.stream.Collectors;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import org.ucc.oop.presupuesto.Actividad;
import org.ucc.oop.presupuesto.ActividadProyecto;
import org.ucc.oop.presupuesto.ProyectoObra;
import org.ucc.oop.presupuesto.Store;

public class AgregarActividadItemFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField searchText = new JTextField(20);
	private JButton searchButton = new JButton("Buscar");
	private JTable actividadesTable;
	private JButton selecccionButton = new JButton("Seleccionar");
	private ProyectoObra proyecto;

	/**
	 * Create the frame.
	 */
	public AgregarActividadItemFrame(ProyectoObra proyecto) {
		this.proyecto = proyecto;
		construirInterfaz();
	}

	private void construirInterfaz() {
		this.contentPane = new JPanel(new GridBagLayout());

		GridBagConstraints constraints = new GridBagConstraints();
		constraints.anchor = GridBagConstraints.WEST;
		constraints.insets = new Insets(10, 10, 10, 10);
		constraints.gridx = 0;
		constraints.gridy = 0;

		contentPane.add(searchText, constraints);

		GridBagConstraints constraints2 = new GridBagConstraints();
		constraints2.anchor = GridBagConstraints.WEST;
		constraints2.insets = new Insets(10, 10, 10, 10);
		constraints2.gridx = 1;
		constraints2.gridy = 0;
		searchButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO:implementar aquí la lógica de buscar por el nombre de una actividad
				// y actualizar la tabla con los valores que coincidan con la busqueda
			}
		});
		contentPane.add(searchButton, constraints2);

		// set border for the panel
		contentPane.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),
				"Asignar Actividades a: " + this.proyecto.getNombre()));

		// tabla de actividades
		Store store = new Store();
		String column[] = { "Nombre", "Unidad" };
		String[][] actividades = store.getActividades().stream()
				.map(item -> new String[] { item.getNombre(), item.getUnidad() }).toArray(String[][]::new);
		this.actividadesTable = new JTable(actividades, column);
		actividadesTable.setPreferredScrollableViewportSize(new Dimension(500, store.getActividades().size() * 16));
		JScrollPane scrollPane = new JScrollPane(actividadesTable);
		GridBagConstraints constraintsT = new GridBagConstraints();
		constraintsT.anchor = GridBagConstraints.CENTER;
		constraintsT.insets = new Insets(10, 10, 10, 10);
		constraintsT.gridx = 0;
		constraintsT.gridy = 1;
		constraintsT.gridwidth = 2;
		contentPane.add(scrollPane, constraintsT);

		// botón de selección de actividad
		GridBagConstraints constraintsSelectB = new GridBagConstraints();
		constraintsSelectB.anchor = GridBagConstraints.WEST;
		constraintsSelectB.insets = new Insets(10, 10, 10, 10);
		constraintsSelectB.gridx = 0;
		constraintsSelectB.gridy = 2;
		this.selecccionButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int indiceSelección = actividadesTable.getSelectedRow();
				Actividad actividadSeleccionada = store.getActividades().get(indiceSelección);
				ActividadProyecto actividadProyecto = new ActividadProyecto(actividadSeleccionada);
				proyecto.agregarActividad(actividadProyecto);
			}
		});
		contentPane.add(selecccionButton, constraintsSelectB);

		// add the panel to this frame
		getContentPane().add(contentPane);

		this.pack();
		setLocationRelativeTo(null);
	}

}
