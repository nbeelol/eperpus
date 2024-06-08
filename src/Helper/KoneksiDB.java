package Helper;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
 import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import Helper.KoneksiDB;
/**
 *
 * @author aldia
 */
public class KoneksiDB {
    static Connection con;
    
    public static Connection getConnection(){
        if(con == null){
            try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/perpustakaan","root","Unnesaja30");
            System.out.print("berhasil");
            
        } catch (ClassNotFoundException ex) {
            System.out.print("eror");
        } catch (SQLException ex) {
            System.out.print("eror DB");
        }
        }
        return con;
    }
}
