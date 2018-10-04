package clases;

public class Usuario {
	private String rut;
	private String clave;
	
	public boolean ingresar (String rut, String cla) {
		
		if(this.rut.equals(rut) && this.clave.equals(cla)) {
			return true;
		}
		
		return false;
	}
	
	public void setRut( String rt) {
		rut = rt;
	}
	
	public void setClave( String cl) {
		clave = cl;
	}
	
	public String getRut() {
		return rut;
	}
	
	public String getClave() {
		return clave;
	}
	
}

