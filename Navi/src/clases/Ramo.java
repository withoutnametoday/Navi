package clases;

import java.util.ArrayList;

/**
 * 
 * @author Franco
 *
 */
public class Ramo {
	
	private String nombre;
    private int paralelo;
	private String codigo;
	private String nombreProfesor;
	private String mailProfesor;
	private String sala;
	private String nombreAyudante;
	private String mailAyudante;
	private String horario;
	private String descripcion;
    private float promedio;
	private ArrayList<Float> notasPrueba;
	private ArrayList<Float> notasTaller;
	private ArrayList<Float> notasQuiz;
	private ArrayList<Float> notasProyecto;
	
	
	//metodos
	
	public boolean cambiarProfesor(String nombreActual, String nombreNuevo) {
		if(nombreActual.equals(this.nombreProfesor)){
                    nombreProfesor=nombreNuevo;
                   
                    return true;
                }
                return false;
	}
        
	public boolean cambiarSala(String salaActual, String salaNueva) {
            if(salaActual.equals(this.sala)){
                sala=salaNueva;
                return true;
            }
            return false;
	}
        
	public boolean cambiarHorario(String horarioActual, String horarioNuevo){
            if(horarioActual.equals(this.horario)){
                horario=horarioNuevo;
                return true;
            }
            return false;
		
	}
        
        public void agregarPrueba(float notaNueva){
            notasPrueba.add(notaNueva);
        }
        
        public void agregarPrueba(float nota,int numeroPrueba){
            notasPrueba.add(numeroPrueba-1, nota);
        }
        
        public void eliminarPrueba(int numeroPrueba){
            notasPrueba.remove(numeroPrueba-1);
        }
        
        public void agregarTaller(float notaNueva){
            notasTaller.add(notaNueva);
        }
        
        public void agregarTaller(float nota,int numeroPrueba){
            notasTaller.add(numeroPrueba-1, nota);
        }
        
        public void eliminarTaller(int numeroPrueba){
            notasTaller.remove(numeroPrueba-1);
        }
        
        public void agregarQuiz(float notaNueva){
            notasQuiz.add(notaNueva);
        }
        
        public void agregarQuiz(float nota,int numeroPrueba){
            notasQuiz.add(numeroPrueba-1, nota);
        }
        
        public void eliminarQuiz(int numeroPrueba){
            notasQuiz.remove(numeroPrueba-1);
        }
        
        public void agregarProyecto(float notaNueva){
            notasProyecto.add(notaNueva);
        }
        
        public void agregarProyecto(float nota,int numeroPrueba){
            notasProyecto.add(numeroPrueba-1, nota);
        }
        
        public void eliminarProyecto(int numeroPrueba){
            notasProyecto.remove(numeroPrueba-1);
        }
	
	public float promedioPrueba(float porcentaje1, float porcentaje2, float porcentaje3){
            return notasPrueba.get(0)*porcentaje1+notasPrueba.get(1)*porcentaje2+notasPrueba.get(2)*porcentaje3;
        }
	
        public float promedioTaller(float porcentaje){
            float suma=0;
            for(int i=0; i < notasTaller.size();i++){
                suma+=notasTaller.get(i);
            }
            return (suma/notasTaller.size())*porcentaje;
        }
        
        public float promedioQuiz(float porcentaje){
            float suma=0;
            for(int i=0; i < notasQuiz.size();i++){
                suma+=notasQuiz.get(i);
            }
            return (suma/notasQuiz.size())*porcentaje;
        }
        
        public float promedioProyecto(float porcentaje){
            float suma=0;
            for(int i=0; i < notasProyecto.size();i++){
                suma+=notasProyecto.get(i);
            }
            return (suma/notasProyecto.size())*porcentaje;
        }
	
        public float promedioRamo(float porcentaje1, float porcentaje2, float porcentaje3, float porcentaje4, float porcentaje5, float porcentaje6){
            promedio=promedioPrueba(porcentaje1, porcentaje2, porcentaje3)+promedioTaller(porcentaje4)+promedioQuiz(porcentaje5)+promedioProyecto(porcentaje6);
            return promedio;
        }
        
        
        
        
	//setters y getter
	public float getPromedio() {
            return promedio;
        }

        public void setPromedio(float promedio) {
            this.promedio = promedio;
        }
        
        
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
        
        public int getParalelo() {
            return paralelo;
        }

        public void setParalelo(int paralelo) {
            this.paralelo = paralelo;
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
		return descripcion;
	}

	public void setDesc(String desc) {
		descripcion = desc;
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
	
}
