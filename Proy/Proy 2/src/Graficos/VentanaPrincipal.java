package Graficos;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame {
	
	PanelUsuarioActual panelUsuario;
	PanelAplicacion panelApp;
	
	public VentanaPrincipal() {
		
		// Configuraciones Iniciales JFrame
		
		setTitle("Aplicacion");
		setResizable(false);
		setSize(new Dimension(600,700));
		
		// Creacion de paneles
		
		panelUsuario = new PanelUsuarioActual();
		panelApp = new PanelAplicacion();
		
		// Creacion del Layout
		
		setLayout(new BorderLayout());
		
		// Añadir elementos al Layout
		
		add(panelUsuario, BorderLayout.NORTH);
		add(panelApp, BorderLayout.CENTER);
		
		// Configuraciones Finales
		
		setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		
		VentanaPrincipal app = new VentanaPrincipal();
		
	}

}
