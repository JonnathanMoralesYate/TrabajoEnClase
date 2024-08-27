package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;


public class Conexion {

    
    public static void main(String[] args) {
       try {
            Class.forName("org.mariadb.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3307/Prueba?user=root&password=");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("show databases;");
            System.out.println("Connected");
            System.out.println(rs);
        }catch (ClassNotFoundException | SQLException e){
            System.out.println(e);
        }
    }
    
        org.mariadb.jdbc.Connection Conexion() throws ClassNotFoundException, SQLException {
        Class.forName("org.mariadb.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3307/Prueba?user=root&password=");
        
        return (org.mariadb.jdbc.Connection) con;
    }
        
        PreparedStatement preparedStatement(String sql){
            throw new UnsupportedOperationException("Not supported yet.");
    }
        
    }
