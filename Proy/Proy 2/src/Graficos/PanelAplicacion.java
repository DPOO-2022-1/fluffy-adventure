package Graficos;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class PanelAplicacion extends JPanel implements ActionListener {
	
	PanelVerProyecto pVerProy;
	PanelCrearProyecto pCrearProy;
	PanelCrearActividad pCrearActividad;
	CardLayout cardLayout = new CardLayout();
	
	public PanelAplicacion() {
		
		// inicializamos paneles
		
		pVerProy = new PanelVerProyecto(this);
		pCrearProy = new PanelCrearProyecto(this);
		pCrearActividad = new PanelCrearActividad(this);
		

		
		// añadimos paneles al control
		
		setLayout(cardLayout);
		add(pVerProy, "VerProy");
		add(pCrearProy, "CrearProy");
		add(pCrearActividad, "CrearActividad");
		
		cardLayout.show(this, "VerProy");
		
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand() == "VerProy") {
			cardLayout.show(this, "VerProy");
		} else if(e.getActionCommand() == "CrearProy") {
			cardLayout.show(this, "CrearProy");
		} else if(e.getActionCommand() == "CrearActividad") {
			cardLayout.show(this, "CrearActividad");
		}
		
	}

}
