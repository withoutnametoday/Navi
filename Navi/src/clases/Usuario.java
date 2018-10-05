package clases;

public class Usuario {
	private String rut;
	private String clave;
        
        public boolean verificarRut(String rutIngresado, String claveIngresada){
            if(rut.equals(rutIngresado) && clave.equals(claveIngresada)){
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

