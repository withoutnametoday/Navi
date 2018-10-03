package clases;

import java.util.ArrayList;

public class Alumno extends Usuario{

	
	private String nombres;
	private String apellidos;
	private ArrayList<Ramo> aprovado;
	private ArrayList<Ramo> cursando;
	private ArrayList<Ramo> reprovado;
	private float porcentajeAvance;
	private String direccion;
	private String mailPrivado;
	private String mailInstitucional;
	
	//procedimientos
	/*
	public boolean agregarRamoAprovado() {
		
	}
	public boolean agregarRamoReprovado() {
		
	}
	public boolean modificarDireccion() {
		
	}
	public boolean modificarNumeroTelefonico() {
		
	}
	public boolean modificarMailPrivado() {
		
	}
	public boolean agregarRamoCursando() {
		
	}
	public boolean eliminarRamoCursando() {
		
	}
	public boolean modificarPorcentajeAvance() {
		
	}
	*/
	
	
	
	//seters y geters
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

	public ArrayList<Ramo> getAprovado() {
		return aprovado;
	}

	public void setAprovado(ArrayList<Ramo> aprovado) {
		this.aprovado = aprovado;
	}

	public ArrayList<Ramo> getReprovado() {
		return reprovado;
	}

	public void setReprovado(ArrayList<Ramo> reprovado) {
		this.reprovado = reprovado;
	}

	public float getPorcentajeAvance() {
		return porcentajeAvance;
	}

	public void setPorcentajeAvance(float porcentajeAvance) {
		this.porcentajeAvance = porcentajeAvance;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getMailPrivado() {
		return mailPrivado;
	}

	public void setMailPrivado(String mailPrivado) {
		this.mailPrivado = mailPrivado;
	}

	public String getMailInstitucional() {
		return mailInstitucional;
	}

	public void setMailInstitucional(String mailInstitucional) {
		this.mailInstitucional = mailInstitucional;
	}
	public ArrayList<Ramo> getCursando() {
		return cursando;
	}
	public void setCursando(ArrayList<Ramo> cursando) {
		this.cursando = cursando;
	}
}
