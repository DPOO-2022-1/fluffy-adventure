package Graficos;

import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelCrearActividad extends JPanel {
	
	public PanelCrearActividad(PanelAplicacion al) {
		
		JButton BotonVerProy = new JButton("Ver Proyectos");
		JButton BotonCrearProy = new JButton("Crear un Proyecto");
		JButton BotonCrearActividad = new JButton("Crear una actividad");
		
		BotonVerProy.setActionCommand("VerProy");
		BotonCrearProy.setActionCommand("CrearProy");
		BotonCrearActividad.setActionCommand("CrearActividad");
		
		BotonVerProy.addActionListener(al);
		BotonCrearProy.addActionListener(al);
		BotonCrearActividad.addActionListener(al);
		
		add(BotonVerProy);
		add(BotonCrearProy);
		add(BotonCrearActividad);
		
		setBackground(Color.red);
		
	}
	
}
