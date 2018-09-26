package clases;

import java.util.Scanner;

public class Alumno extends Usuario{

	private String nombres;
	private String apellidos;
	
	public void setNombre(String nm) {
		nombres = nm;
	}
	
	public String getNombre() {
		return nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apell) {
		apellidos = apell;
	}
	
	public static void main(String arg[]) {
		
	}
}
