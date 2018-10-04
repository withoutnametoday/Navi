package clases;

import java.sql.*;

import javax.swing.JOptionPane;
//import clases.Alumno;
//import controlador.Login;

public class Conexion {
	
	private Connection con = null;
	
	public Connection conexion() {
		try {
			//carga los drivers
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localHost/login", "root", "");
		}
		catch(ClassNotFoundException | SQLException e){
			System.out.println("error de conexion" + e);
			JOptionPane.showMessageDialog(null,"Rut o Clave erroneos, intentelo nuevamente " + e);
		}
		
		return con;
	}
	

}
