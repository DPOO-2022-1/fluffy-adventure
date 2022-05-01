package Modelo;

public class usuario {
	
	public String nombre;
	public String correo;
	
	public usuario(String t1, String t2) {
		
		nombre = t1;
		correo = t2;
		
		
	}
	
	public String DarNombre() {
		return nombre;
	}
	
	public String DarCorreo() {
		return correo;
	}
	
	public String DarInfo(){
		
		String texto = "nombre: " + nombre + "\ncorreo: " + correo + "";
		
		return texto;
	}
	
}