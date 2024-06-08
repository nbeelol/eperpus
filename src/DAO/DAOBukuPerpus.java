/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DAOInterface.IDAOBukuPerpus;
import Helper.KoneksiDB;
import Model.BukuPerpus;
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
public class DAOBukuPerpus implements IDAOBukuPerpus{

    public DAOBukuPerpus()
    {
        con = KoneksiDB.getConnection();
    }
    
    @Override
    public List<BukuPerpus> getAll() {
    List<BukuPerpus> lstBkuP = null;
        try
        {
            lstBkuP = new ArrayList<BukuPerpus>();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(strRead);
            while(rs.next())
            {
                BukuPerpus BkuP = new BukuPerpus();
                BkuP.setId_buku(rs.getInt("id_buku"));
                BkuP.setJudul(rs.getString("judul"));
                BkuP.setPenulis(rs.getString("penulis"));
                BkuP.setGenre(rs.getString("genre"));
                BkuP.setStatus(rs.getString("status"));
                lstBkuP.add(BkuP);
            }
            
        }
        catch(SQLException e)
        {
           System.out.println("error"+e);
        }
        return lstBkuP;    }

    @Override
    public void insert(BukuPerpus b) {
        PreparedStatement statement = null;
        try
        {
            statement = con.prepareStatement(strInsert);
            statement.setInt(1, b.getId_buku());
            statement.setString(2,b.getJudul());
            statement.setString(3, b.getPenulis());
            statement.setString(4,b.getGenre());
            statement.setString(5,b.getStatus());
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
        }
            }

    @Override
    public void update(BukuPerpus b) {
        PreparedStatement statement = null;
        try
        {
            statement = con.prepareStatement(strUpdate);
            statement.setString(1,b.getJudul());
            statement.setString(2, b.getPenulis());
            statement.setString(3,b.getGenre());
            statement.setString(4,b.getStatus());
            statement.setInt(5,b.getId_buku());
            statement.execute();
        }catch(SQLException e)
        {
          System.out.println("gagal update");
  
        }
        
        finally
        {
            try {
                statement.close();
            }catch (SQLException ex){
                System.out.println("gagal update");
            }   
         }    }

    @Override
    public void delete(int id) {
        PreparedStatement statement = null;
        try
        {
            statement = con.prepareStatement(strDelete);
            statement.setInt(1,id);
            statement.execute();
        }catch(SQLException e)
        {
          System.out.println("gagal delete");
  
        }
        
        finally
        {
            try {
                statement.close();
            }catch (SQLException ex){
                System.out.println("gagal delete");
            }   
         }    }

    @Override
    public List<BukuPerpus> getAllByName(String judul) {
        List<BukuPerpus> lstBkuP = null;
        try
        {
            lstBkuP = new ArrayList<BukuPerpus>();
            PreparedStatement st = con.prepareStatement(strSearch);
            st.setString(1, "%"+judul+"%");
            ResultSet rs = st.executeQuery();
            while(rs.next())
            {
                BukuPerpus BkuP = new BukuPerpus();
                BkuP.setId_buku(rs.getInt("id_buku"));
                BkuP.setJudul(rs.getString("judul"));
                BkuP.setPenulis(rs.getString("penulis"));
                BkuP.setGenre(rs.getString("genre"));
                BkuP.setStatus(rs.getString("status"));
                lstBkuP.add(BkuP);
            }
            
        }
        catch(SQLException e)
        {
           System.out.println("error"+e);
        }
        return lstBkuP;    }
    
    

    public List<BukuPerpus> getJudulBuku() {
    List<BukuPerpus> lstBkuP = new ArrayList<>();
        String sql = "SELECT judul, penulis, genre FROM buku WHERE status = 'Tersedia' OR status = 'tersedia' ORDER BY judul";
        try {
            PreparedStatement statement = con.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                BukuPerpus BkuP = new BukuPerpus();
                BkuP.setJudul(rs.getString("judul"));
                BkuP.setPenulis(rs.getString("penulis"));
                BkuP.setGenre(rs.getString("genre"));
                lstBkuP.add(BkuP);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lstBkuP;    }
    
    Connection con;
    //SQL Query
    String strRead = "select * from buku;";
    String strInsert = "insert into buku(id_buku,judul,penulis,genre,status) values (?,?,?,?,?);";
    String strUpdate = "update buku set judul=?, penulis=?, genre=?, status=? where id_buku=?";
    String strDelete = "delete from buku where id_buku=?";
    String strSearch = "select* from buku where judul like ?;";
}
