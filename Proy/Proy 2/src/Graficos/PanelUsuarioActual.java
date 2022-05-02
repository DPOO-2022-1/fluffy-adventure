package Graficos;

import javax.swing.JLabel;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Modelo.proyecto;

public class PanelUsuarioActual extends JPanel {
	
	String nombre;
	String correo;
	String nombreProy;
	
	
	public PanelUsuarioActual() {
		
		nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
		JLabel lable_nombre = new JLabel("Nombre: " + nombre);
		
		correo = JOptionPane.showInputDialog("Ingrese su correo: ");
		JLabel lable_correo = new JLabel("correo: " + correo);

		
		add(lable_nombre);
		add(lable_correo);
		
	}
	
	// Enviar Info como parametro
	
	public String DarNombre() {
		return nombre;
	}
	
	public String DarCorreo() {
		return correo;
	}
	
	
	
	public String DarInfo(){
		
		
		
		String texto = "Nombre: " + nombre + "Correo: " + correo + "\nProyecto actual: " + nombre ;
		
		return texto;
	}
	
	
}
