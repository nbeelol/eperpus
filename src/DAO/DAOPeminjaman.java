/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DAOInterface.IDAOPeminjaman;
import Helper.KoneksiDB;
import Model.Peminjaman;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gina
 */
public class DAOPeminjaman implements IDAOPeminjaman{

    public DAOPeminjaman()
    {
        con = KoneksiDB.getConnection();
    }
    @Override
    public List<Peminjaman> getAll() {
        List<Peminjaman> lstPnjm = null;
        try
        {
            lstPnjm = new ArrayList<Peminjaman>();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(strRead);
            while(rs.next())
            {
                Peminjaman pnjm = new Peminjaman();
                pnjm.setNama(rs.getString("nama"));
                pnjm.setEmail(rs.getString("email"));
                pnjm.setNo_telp(rs.getString("no_telp"));
                pnjm.setJudul_buku(rs.getString("judul_buku"));
                pnjm.setTgl_peminjaman(rs.getString("tgl_peminjaman"));
                pnjm.setTgl_pengembalian(rs.getString("tgl_pengembalian"));
                lstPnjm.add(pnjm);
            }
            
        }
        catch(SQLException e)
        {
           System.out.println("error"+e);
        }
        return lstPnjm;
        
    }

    @Override
    public void insert(Peminjaman b) {
PreparedStatement statement = null;
        try
        {
            statement = con.prepareStatement(strInsert);
            statement.setString(1,b.getNama());
            statement.setString(2, b.getEmail());
            statement.setString(3,b.getNo_telp());
            statement.setString(4,b.getJudul_buku());
            statement.setString(5,b.getTgl_peminjaman());
            statement.setString(6,b.getTgl_pengembalian());
            statement.execute();
        }catch(SQLException e)
        {
          System.out.println("gagal input");
  
        }
        
        finally
        {
            try {
                statement.close();
            }catch (SQLException ex){
                System.out.println("gagal input");
            }
        }    }
    
    
    
    Connection con;
    //SQL Query
    String strRead = "select * from pinjam;";
    String strInsert = "insert into pinjam( nama, email, no_telp, judul_buku, tgl_peminjaman, tgl_pengembalian) values (?,?,?,?,?,?);";


   

}
