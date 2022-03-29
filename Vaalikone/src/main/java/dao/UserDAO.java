package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class UserDAO {
 
    public User checkLogin(String name, String pass) throws SQLException,
            ClassNotFoundException, InstantiationException, IllegalAccessException {

 
    	Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/vaalikone", "root", "root");
        String sql = "SELECT * FROM userreg WHERE name = ? and pass = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, name);
        statement.setString(2, pass);
 
        ResultSet result = statement.executeQuery();
 
        User user = null;
 
        if (result.next()) {
            user = new User();
            user.setName(name);
            user.setPass(pass);
        }
 
        connection.close();
 
        return user;
    }
}