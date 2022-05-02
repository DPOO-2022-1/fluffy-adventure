package Graficos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Modelo.usuario;

public class PanelVerProyecto extends JPanel {
	
	private String nombre = "";
	private String descripcion= "";
	private String fechaInicial= "";
	private String fechaFinal= "";
	private String tipo= "";
	private usuario principal;
	private String usuCorreo = "";
	private String usuNomb = "";
	
	private JLabel nom, desc, FechIn, FechFi, tip, usuNom, usuCor;
	
	public PanelVerProyecto(PanelAplicacion al) {
		
		
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		 nom = new JLabel("Nombre: " + nombre);
		 desc = new JLabel("Descripcion : " + descripcion);
		 FechIn = new JLabel("Fecha Inicial: " + fechaInicial);
		 FechFi = new JLabel("Fecha Final: " + fechaFinal);
		 tip = new JLabel("Tipo: " + tipo);
		
		if (principal != null) {
			
			usuNomb = principal.DarNombre();
			usuCorreo = principal.DarCorreo();
			
		}
		
		 usuNom = new JLabel("Usuario: " + usuCorreo);
		 usuCor = new JLabel("Correo: " + usuNomb);
		
		add(nom);
		add(desc);
		add(FechIn);
		add(FechFi);
		add(tip);
		add(usuNom);
		add(usuCor);
		
		
	}
	
	public void ActualizarPanel(String nombre1, String descripcion1, String fechaInicial1, String fechaFinal1, String tipo1, usuario principal1) {
		
		this.nombre = nombre1;
		this.descripcion = descripcion1;
		this.fechaInicial = fechaInicial1;
		this.fechaFinal = fechaFinal1;
		this.tipo = tipo1;
		this.principal = principal1;
		
		nom.setText("Nombre: " + nombre);
		desc.setText("Descripcion : " + descripcion);
		FechIn.setText("Fecha Inicial: " + fechaInicial);
		FechFi.setText("Fecha Final: " + fechaFinal);
		tip.setText("Tipo: " + tipo);
		usuNom.setText("Usuario: " + usuCorreo);
		usuCor.setText("Correo: " + usuNomb);
		
		
	}
	
}
