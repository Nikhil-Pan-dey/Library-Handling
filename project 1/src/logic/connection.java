package logic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class connection{
//	interface_class inter ;
	public Connection con;
	public Statement st;
	public PreparedStatement pst;
	public ResultSet rs,rs1,rs2;
	public void making_connection() {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/DB1","root","root");
		st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
		
		}catch(Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
}
}
