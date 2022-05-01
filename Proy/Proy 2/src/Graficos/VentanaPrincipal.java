package Graficos;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

import Modelo.aplicacion;

public class VentanaPrincipal extends JFrame {
	
	PanelUsuarioActual panelUsuario;
	PanelAplicacion panelApp;
	aplicacion app;
	PanelBotones botones;
	
	public VentanaPrincipal() {
		
		// Configuraciones Iniciales JFrame
		
		setTitle("Aplicacion");
		setResizable(false);
		setSize(new Dimension(900,700));
		
		// Creacion de paneles
		
		panelUsuario = new PanelUsuarioActual();
		panelApp = new PanelAplicacion();
		botones = new PanelBotones(panelApp);
		
		app = new aplicacion(panelUsuario.DarNombre(), panelUsuario.DarCorreo());
		
		// Creacion del Layout
		
		setLayout(new BorderLayout());
		
		// Añadir elementos al Layout
		
		add(panelUsuario, BorderLayout.NORTH);
		add(panelApp, BorderLayout.CENTER);
		add(botones, BorderLayout.SOUTH);
		
		// Configuraciones Finales
		
		setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		
		VentanaPrincipal app = new VentanaPrincipal();
		
	}

}
