package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;


public class MySQL2{
    private static Connection connection;
    public static  void creatConnection() throws Exception{
        if (connection == null) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/myposdb","root","Jester890@#");
            
        }
        
    }
    public static ResultSet executeSearch(String query) throws Exception{
        creatConnection();
        return connection.createStatement().executeQuery(query);
        
    }
    public static Integer executeuPDATE(String query) throws Exception{
        creatConnection();
        return connection.createStatement().executeUpdate(query);
        
    }
}