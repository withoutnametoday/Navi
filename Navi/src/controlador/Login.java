package controlador;

import java.sql.*;

import javax.swing.JOptionPane;

import clases.Alumno;

public class Login {
	
	public Alumno ingreso(String rt,String cl, Connection cn) {
		Conexion con = new Conexion();
		Alumno alumn = null;
		boolean aux = false;
		
		cn = con.conexion();
		try {
			Statement st = cn.createStatement();
			ResultSet result = st.executeQuery("SELECT * FROM user ");
				
			result.first();
			aux = (result.getString(1).equals(rt) && result.getString(2).equals(cl));
			
			while(result.next()) {
				
				if(aux) {
					alumn = new Alumno();
					
					alumn.setClave(cl);
					alumn.setRut(rt);
					
					return alumn;
				}
				aux = (result.getString(1).equals(rt) && result.getString(2).equals(cl));
			}
			
			//caso para el ultimo elemento de la tabla "user" de la base de datos
			if(aux) {
				alumn = new Alumno();
				
				alumn.setClave(cl);
				alumn.setRut(rt);
				
				return alumn;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Problemas al conectar a base de datos");
			System.out.println("No se pudo conectar a base de datos");
		}
		
		
		return alumn;
	}
	
	public ResultSet cargarDatosAlumno(Connection conect, Alumno alu) {
		ResultSet result = null;
		
		try {
			Statement st = conect.createStatement();
			ResultSet resultado = st.executeQuery("SELECT * FROM user JOIN alumno ON user.rut = alumno.rut WHERE alumno.rut ='" + alu.getRut()+"'");
			resultado.first();
			result = resultado;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("No se pudo conectar a base de datos");
			JOptionPane.showMessageDialog(null,"Rut o Clave erroneos, intentelo nuevamente " + e);
		}
		

		
		return result;
	}
}
