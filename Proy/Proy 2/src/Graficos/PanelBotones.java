package Graficos;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelBotones extends JPanel {
	
	public PanelBotones(PanelAplicacion al) {
		
		JButton BotonVerProy = new JButton("Ver proyecto actual");
		JButton BotonCambiarProy = new JButton("cambiar a otro proyecto");
		JButton BotonCrearProy = new JButton("Crear un Proyecto");
		JButton BotonCrearActividad = new JButton("Crear una actividad");

		
		BotonVerProy.setActionCommand("VerProy");
		BotonCambiarProy.setActionCommand("CamProy");
		BotonCrearProy.setActionCommand("CrearProy");
		BotonCrearActividad.setActionCommand("CrearActividad");
		
		BotonVerProy.addActionListener(al);
		BotonCambiarProy.addActionListener(al);
		BotonCrearProy.addActionListener(al);
		BotonCrearActividad.addActionListener(al);
		
		add(BotonVerProy);
		add(BotonCambiarProy);
		add(BotonCrearProy);
		add(BotonCrearActividad);
		
	}
	
	
}
