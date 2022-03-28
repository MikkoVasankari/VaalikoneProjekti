package dao;
import java.sql.DriverManager;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import data.Ehdokas;

import java.sql.Connection;

public class Daor {
	private String url;
	private String user;
	private String pass;
	private Connection conn;
	
	public Daor(String url, String user, String pass) {
		this.url=url;
		this.user=user;
		this.pass=pass;
	}
	
	public boolean getConnection() {
		try {
	        if (conn == null || conn.isClosed()) {
	            try {
	                Class.forName("com.mysql.jdbc.Driver").newInstance();
	            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
	                throw new SQLException(e);
	            }
	            conn = DriverManager.getConnection(url, user, pass);
	        }
	        return true;
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
			return false;
		}
	}
	public Ehdokas readEhdokas(String id) {
		Ehdokas f=null;
		try {
			String sql="select * from ehdokkaat where id=?";
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, id);
			ResultSet RS=pstmt.executeQuery();
			while (RS.next()){
				f=new Ehdokas();
				f.setId(RS.getInt("ehdokas_id"));
				f.setEtunimi(RS.getString("etunimi"));
			}
			return f;
		}
		catch(SQLException e) {
			return null;
		}
	}
	
	
	
}