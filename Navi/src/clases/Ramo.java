package clases;

import java.util.ArrayList;

public class Ramo {
	
	private String nombre;
	private String codigo;
	private String nombreProfesor;
	private String mailProfesor;
	private String sala;
	private String nombreAyudante;
	private String mailAyudante;
	private String horario;
	private String desc;
	private float promedioActual;
	private ArrayList<Float> notasPrueba;
	private ArrayList<Float> notasTaller;
	private ArrayList<Float> notasQuiz;
	private ArrayList<Float> notasProyecto;
	
	
	//metodos
	public boolean cambiarProfesor() {
		
	}
	public boolean cambiarSala() {
		
	}
	public boolean cambiarHorario() {
		
	}
	public boolean agregarAlumno() {
		
	}
	public boolean eliminarAlumno() {
		
	}
	
	
	
	//setters y getter
	
	public void setCodigo(String cl) {
		codigo = cl;
	}
	
	public String getCodigo() {
		return codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombreProfesor() {
		return nombreProfesor;
	}

	public void setNombreProfesor(String nombreProfesor) {
		this.nombreProfesor = nombreProfesor;
	}

	public String getMailProfesor() {
		return mailProfesor;
	}

	public void setMailProfesor(String mailProfesor) {
		this.mailProfesor = mailProfesor;
	}

	public String getSala() {
		return sala;
	}

	public void setSala(String sala) {
		this.sala = sala;
	}

	public String getNombreAyudante() {
		return nombreAyudante;
	}

	public void setNombreAyudante(String nombreAyudante) {
		this.nombreAyudante = nombreAyudante;
	}

	public String getMailAyudante() {
		return mailAyudante;
	}

	public void setMailAyudante(String mailAyudante) {
		this.mailAyudante = mailAyudante;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	public ArrayList<Alumno> getInscritos() {
		return inscritos;
	}
	public void setInscritos(ArrayList<Alumno> inscritos) {
		this.inscritos = inscritos;
	}
	public ArrayList<Float> getNotasPrueba() {
		return notasPrueba;
	}
	public void setNotasPrueba(ArrayList<Float> notasPrueba) {
		this.notasPrueba = notasPrueba;
	}
	public ArrayList<Float> getNotasTaller() {
		return notasTaller;
	}
	public void setNotasTaller(ArrayList<Float> notasTaller) {
		this.notasTaller = notasTaller;
	}
	public ArrayList<Float> getNotasQuiz() {
		return notasQuiz;
	}
	public void setNotasQuiz(ArrayList<Float> notasQuiz) {
		this.notasQuiz = notasQuiz;
	}
	public ArrayList<Float> getNotasProyecto() {
		return notasProyecto;
	}
	public void setNotasProyecto(ArrayList<Float> notasProyecto) {
		this.notasProyecto = notasProyecto;
	}
	public float getPromedioActual() {
		return promedioActual;
	}
	public void setPromedioActual(float promedioActual) {
		this.promedioActual = promedioActual;
	}

	
}
