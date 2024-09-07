package conexion;

import java.sql.*;
import javax.swing.JOptionPane;


public class Conexion {
    
    //declarar una conexion
    Connection conectar=null;

    //metodo para conectar
    public Connection conectar() throws SQLException {
                
       try {
           //llamamos el driver de mysql
            Class.forName("org.mariadb.jdbc.Driver");
            
            //metodo conectar
            conectar=DriverManager.getConnection("jdbc:mariadb://localhost:3307/prueba?user=root&password=");
            JOptionPane.showMessageDialog(null, "Conexion Exitosa", "Conexion", JOptionPane.INFORMATION_MESSAGE);
            
        }catch (ClassNotFoundException e){
            
            JOptionPane.showMessageDialog(null, "Sin Conexion"+e, "Conexion", JOptionPane.INFORMATION_MESSAGE);
            
        
    }

        return conectar;

    }
}
