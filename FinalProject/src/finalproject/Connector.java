/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalproject;
import java.sql.*;

/**
 *
 * @author mac
 */
public class Connector {
    String DBurl = "jdbc:mysql://localhost/fp_pbo";
    String DBusername = "root";
    String DBpasswowrd = "";
    
    Connection conn;
    Statement statement;

    public Connector() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection(DBurl, DBusername, DBpasswowrd);
            System.out.println("Connection Success");
        }catch(Exception ex){
            System.out.println("Connection Failed" + ex.getMessage());
        }
    }
}
