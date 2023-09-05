/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package agendamiento.Infraestructura.Data.Colecciones;


import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lab217-11
 */
public class Agendamiento {
    
    private static String userDB="postgres";
    private static String passDB = "Alumno2023";
    private static String portDB= "5432";
    private static String dataBase="Agendamiento";
    
    private static final String url= "jdbc:postgresql://localhost:5432/"+dataBase;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        try {
            Connection conn = DriverManager.getConnection(url, userDB, passDB);
            
            
            
            // TODO code application logic here
        } catch (SQLException ex) {
            Logger.getLogger(Agendamiento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
