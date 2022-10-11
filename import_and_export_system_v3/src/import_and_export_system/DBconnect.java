/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package import_and_export_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author LENOVO
 */
public class DBconnect {
     public static Connection connect() throws ClassNotFoundException{
        Connection con=null;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
/**
 * @localhost 1433
 */
        String connectionURL="jdbc:sqlserver://localhost:1433;databaseName=Export_And_Import;user=admin;password=1111";
        try{
            con=DriverManager.getConnection(connectionURL);
            System.out.println("Connection is successfull");
    
    }   
    catch(SQLException e){
         System.out.println(e);
    }
        return con;
    }
}
