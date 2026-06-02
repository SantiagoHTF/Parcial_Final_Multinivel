/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db; // Conservando tu paquete actual

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
    private static final String URL = "jdbc:mysql://localhost:3306/rpgmanager?serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD = "Pato123*"; 

    public static Connection obtenerConexion() {
        Connection con = null;
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            
           
            con = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexión realizada con exito a MySQL.");
            
        } catch (ClassNotFoundException e) {
            System.out.println(" Error: No se encontro el Driver de MySQL. Revisa dependencias.");
        } catch (SQLException e) {
            System.out.println(" Error de SQL: " + e.getMessage());
        }
        return con; 
    }
}
