package controlador;

import java.sql.*;
import clases.Alumno;
import controlador.Login;

public class Conexion {
	
	private Connection con = null;
	
	public Connection conexion() {
		try {
			//carga los drivers
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localHost/login", "root", "");
			System.out.println("conexion establecida");
			
		}
		catch(ClassNotFoundException | SQLException e){
			System.out.println("error de conexion" + e);
		}
		
		return con;
	}
	
	public static void main(String arg[]) {
		Conexion nuev = new Conexion();
		
		nuev.con = nuev.conexion();
	}
}
