package controlador;

import gui.Apl_login;
import gui.Apl_prin;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import clases.Alumno;
import clases.Conexion;

public class Main {

	public static void main(String[] arg){
		
		Apl_login.main(null);
		
	}
	
	public void iniciarSecion() {
		Alumno alumn = new Alumno();
		Conexion con = new Conexion();
		Connection cn;
		
		cn = con.conexion();
		try {
			Statement st = cn.createStatement();
			ResultSet result = st.executeQuery("SELECT * FROM user ");
				
			result.first();
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("No se pudo conectar a base de datos");
		}
		
		
	}
}
