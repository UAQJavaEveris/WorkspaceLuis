package mx.com.everis.javaweb.conections;
import java.sql.*;

public class Conexion {

	private Connection con = null;
	
	public Connection getCon() {
		return con;
	}
	public void setCon(Connection con) {
		this.con = con;
	}	
	
	public void connect(){
		try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			System.out.println("Connected");
			
		}catch(Exception e){
			System.out.println(e.toString());
		}
		
		
		try{
			setCon(DriverManager.getConnection("jdbc:mysql://localhost/catalogo?"
					+ "user=root&password="));
			
		}catch(SQLException ex){
			System.out.println("SQLException: "+ ex.getMessage());
		}			
	}

	public void disconnect(){
		if(con!=null){
			try {
				if(!con.isClosed()){
					con.close();
					con=null;
					System.out.println("Disconnected");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
}
