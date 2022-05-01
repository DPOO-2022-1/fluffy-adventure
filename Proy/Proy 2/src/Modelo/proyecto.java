package Modelo;

import java.util.ArrayList;
import java.util.HashMap;

public class proyecto {
	
	private String nombre;
	private String descripcion;
	private String fechaInicial;
	private String fechaFinal;
	private String tipo;
	private ArrayList<actividad> actividades;
	private usuario principal;
	private ArrayList<usuario> usuariosSec = new ArrayList<usuario>();
	
	
	public proyecto(String nom, String desc, String fechIn, String fechFin, String tip, usuario usu) {
		
		nombre = nom;
		descripcion = desc;
		fechaInicial = fechIn;
		fechaFinal = fechFin;
		setTipo(tip);
		principal = usu;
		ArrayList<actividad> act= new ArrayList<actividad>();
		setActividades(act);
		ArrayList<usuario> usuariosSec = new ArrayList<usuario>();
		setusuariosSec(usuariosSec);
	}
	
// Get y Set
	
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getFechaInicial() {
		return fechaInicial;
	}

	public void setFechaInicial(String fechaInicial) {
		this.fechaInicial = fechaInicial;
	}

	public String getFechaFinal() {
		return fechaFinal;
	}

	public void setFechaFinal(String fechaFinal) {
		this.fechaFinal = fechaFinal;
	}

	public usuario getPrincipal() {
		return principal;
	}

	public void setPrincipal(usuario principal) {
		this.principal = principal;
	}
	
	public String darNombre() {
		return nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public ArrayList<actividad> getActividades() {
		return actividades;
	}

	public void setActividades(ArrayList<actividad> actividades) {
		this.actividades = actividades;
	}
	
	public ArrayList<usuario> usuariosSec() {
		return usuariosSec;
	}

	public void setusuariosSec(ArrayList<usuario> usuariosSec) {
		this.usuariosSec = usuariosSec;
	}
	
	
// Procesos
	
	public void agregarActividad(actividad activity) 
	{
		this.actividades.add(activity);
	}
	
	public void agregarUsuarioSec(usuario usu) {
		
	
		this.usuariosSec.add(usu);
	}
	
	public String generarReporteTxt() {
		
		String texto1 = "nombreProy: " + nombre + "\nDescripcion: " + descripcion + "\nTipo: " + tipo + "\nFechaIni: " + 
		fechaInicial + "\nFechaFin: " + fechaFinal + "\n\nUsuario Principal\n\n";
		
		String texto2 = "UsuarioPrin: " + principal.DarNombre() + "\nCorreoPrin: " + principal.DarCorreo();
		
		String texto3 = "\n\nUsuarios Secundarios\n\n";
		
		for(usuario x: usuariosSec) {
			
			String textoMom = "Usuario: " + x.DarNombre() + "\nCorreo: " + x.DarCorreo();
			texto3 = texto3.concat(textoMom);
		}
		
		return texto1+texto2+texto3;
	}
	
	public float darReporteTiemposPromedio()
	{
		Integer n = this.actividades.size();
		Integer tiempo = 0;
		
		for(int x=0 ; x < n ; x++) 
		{
			tiempo+=actividades.get(x).getHoraTotal();
		}
		
		float tiempo_promedio= tiempo/n;
	
		return tiempo_promedio;
	}
	
}