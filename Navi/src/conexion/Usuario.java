package conexion;

import java.sql.*;

import org.graalvm.compiler.hotspot.stubs.StubOptions;

public class Usuario {
	
	Connection con=null;
	
	public Connection conexion() {
		try {
			//carla los drivers
			Class.forName("com.mysql.jdbc.driver");
			con = DriverManager.getConnection("jdbc:mysql://localHost/user", "root", "");
			System.out.println("conexion establecida");
			
		}
		catch(ClassNotFoundException | SQLException e){
			System.out.println("error de conexion" + e);
		}
		
		return con;
	}
}
