package controlador;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import clases.Alumno;
import gui.Apl_login;
import gui.Apl_prin;


public class Main {
	
	/**
	 * 
	 * @param arg
	 */
	public static void main(String[] arg){
		
		Apl_login.main(null);
		
	}
	
	/**
	 * 
	 * @param rt
	 * @param cl
	 * @throws SQLException
	 */
	public void iniciarSecion(String rt, String cl) throws SQLException {
		Alumno alumn = new Alumno();
		Conexion con = new Conexion();
		Login log = new Login();
		ResultSet datosAlumno;
		Connection cn;
		
		cn = con.conexion();
		
		alumn = log.ingreso(rt, cl, cn);
		
		if(alumn!=null){
			datosAlumno = log.cargarDatosAlumno(cn, alumn);
			Apl_prin ventana= new Apl_prin();
			datosAlumno.first();
			
			alumn.setNombre(datosAlumno.getString(3));
			alumn.setApellidos(datosAlumno.getString(4));
			alumn.setDireccion(datosAlumno.getString(7));
			alumn.setNumeroTelefono((datosAlumno.getString(8)));
			alumn.setMailPrivado(datosAlumno.getString(9));
			alumn.setMailInstitucional(datosAlumno.getString(10));
			
			ventana.abriVentana(alumn);
			
		}
		else {
			JOptionPane.showMessageDialog(null, "Error al ingresar a base de datos");
		}
		
	}
}