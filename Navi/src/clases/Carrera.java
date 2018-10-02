package clases;

import java.util.ArrayList;

public class Carrera {
	private String nombre;
	private ArrayList<Ramo> malla;
	private String nombreJefeCarrera;
	
	//metodos
	/*
	public boolean modificarMalla() { //??????
		
	}
	public boolean cambiarJefeCarrera(String nombre) { //????????????????
		
	}
	*/
	
	//setters getters
	public ArrayList<Ramo> getMalla() {
		return malla;
	}
	
	public void setMalla(ArrayList<Ramo> malla) {
		this.malla = malla;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombreJefeCarrera() {
		return nombreJefeCarrera;
	}
	
	public void setNombreJefeCarrera(String nombreJefeCarrera) {
		this.nombreJefeCarrera = nombreJefeCarrera;
	}
	
	

}
