package controlador;

import java.sql.*;

import clases.Conexion;
import clases.Usuario;

public class Login {
	
	public boolean ingreso(String rt,String cl) {
		Conexion con = new Conexion();
		Connection cn;
		
		cn = con.conexion();
		try {
			Statement st = cn.createStatement();
			ResultSet result = st.executeQuery("SELECT * FROM user ");
			Usuario user = new Usuario();
			boolean aux;
			System.out.println("punto control 1");
			System.out.println(result.getString("rut"));
			System.out.println("punto control 2");
			
			aux = user.ingresar(result.getString(1), result.getNString(2));
			System.out.println("punto control 3");
			while(result.next()) {
				System.out.println("punto control 4");
				if(aux) {
					return true;
				}
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("No se pudo conectar a base de datos");
		}
		
		
		return false;
	}
}
