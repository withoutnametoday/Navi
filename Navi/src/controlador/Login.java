package controlador;

import java.sql.*;

import clases.Conexion;

public class Login {
	
	public boolean ingreso(String rt,String cl) {
		Conexion con = new Conexion();
		Connection cn;
		boolean aux = false;
		
		cn = con.conexion();
		try {
			Statement st = cn.createStatement();
			ResultSet result = st.executeQuery("SELECT * FROM user ");
				
			result.first();
			aux = (result.getString(1).equals(rt) && result.getString(2).equals(cl));
			
			while(result.next()) {
				
				if(aux) {
					return true;
				}
				aux = (result.getString(1).equals(rt) && result.getString(2).equals(cl));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("No se pudo conectar a base de datos");
		}
		
		
		return aux;
	}
}
