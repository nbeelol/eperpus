/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DAOInterface.IDAODataUser;
import Helper.KoneksiDB;
import java.sql.Connection;
import Model.DataUser;
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
public class DAODataUser implements IDAODataUser{

    public DAODataUser()
    {
        con = KoneksiDB.getConnection();
    }
    @Override
    public List<DataUser> getAll() {
    List<DataUser> lstDU = null;
        try
        {
            lstDU = new ArrayList<DataUser>();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(strRead);
            while(rs.next())
            {
                DataUser dtau = new DataUser();
                dtau.setId(rs.getInt("id"));
                dtau.setNama(rs.getString("nama"));
                dtau.setEmail(rs.getString("email"));
                dtau.setNohp(rs.getString("nohp"));
                dtau.setUsername(rs.getString("username"));
                dtau.setPassword(rs.getString("password"));
                lstDU.add(dtau);
            }
            
        }
        catch(SQLException e)
        {
           System.out.println("error"+e);
        }
        return lstDU;    }

    @Override
    public boolean insert(DataUser b) {
    boolean result=true;
        PreparedStatement statement = null;

        try
        {
            statement = con.prepareStatement(strInsert);
            statement.setInt(1, b.getId());
            statement.setString(2,b.getNama());
            statement.setString(3,b.getEmail());
            statement.setString(4,b.getNohp());
            statement.setString(5,b.getUsername());
            statement.setString(6,b.getPassword());
            statement.execute();
        }catch(SQLException e)
        {
          System.out.println("gagal input");
          result=false;
        }
        
        finally
        {
            try {
                statement.close();
            }catch (SQLException ex){
                System.out.println("gagal input");
                result=false;
            }
        }   
        return result;
    }

    @Override
    public void update(DataUser b) {
    PreparedStatement statement = null;
        try
        {
            statement = con.prepareStatement(strUpdate);
            statement.setString(1,b.getNama());
            statement.setString(2,b.getEmail());
            statement.setString(3,b.getNohp());
            statement.setString(4,b.getUsername());
            statement.setString(5,b.getPassword());
            statement.setInt(6, b.getId());
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
         }
    }

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
         }   
    }

    @Override
    public List<DataUser> getAllByName(String nama) {
    List<DataUser> lstDtaU = null;
        try
        {
            lstDtaU = new ArrayList<DataUser>();
            PreparedStatement st = con.prepareStatement(strSearch);
            st.setString(1, "%"+nama+"%");
            ResultSet rs = st.executeQuery();
            while(rs.next())
            {
                DataUser dtaU = new DataUser();
                dtaU.setId(rs.getInt("id"));
                dtaU.setNama(rs.getString("nama"));
                dtaU.setEmail(rs.getString("email"));
                dtaU.setNohp(rs.getString("nohp"));
                dtaU.setUsername(rs.getString("username"));
                dtaU.setPassword(rs.getString("password"));
                lstDtaU.add(dtaU);
            }
            
        }
        catch(SQLException e)
        {
           System.out.println("error"+e);
        }
        return lstDtaU;  
    }
    
    Connection con;
    String strRead = "select*from user order by id desc;";
    String strInsert = "insert into user (id,nama,email,nohp,username,password) values (?,?,?,?,?,?);";
    String strUpdate = "update user set nama=?, email=?, nohp=?, username=?, password=? where id=?";  
    String strDelete = "delete from user where id=?";
    String strSearch = "select*from user where nama like ?;";
}
