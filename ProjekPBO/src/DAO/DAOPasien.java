/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DAOInterface.IDAOPasien;
import Helper.KoneksiDB;
import Model.Pasien;
import Model.Dokter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author ASUS Vivobook
 */
public class DAOPasien implements IDAOPasien {

    // Buat Konstruktor
    public DAOPasien() {
        con = KoneksiDB.getConnection();
    }
    
    @Override
    public void insert(Pasien b) {
        PreparedStatement statement = null;
        boolean result = true;
        if (b.getId_pasien() == null || b.getNIK() == null || b.getNama().isEmpty() || b.getTgl_lahir().isEmpty()
             || b.getNo_hp() == null|| b.getTinggi_badan() == null || b.getBerat_badan() == null || b.getGol_darah().isEmpty()
             || b.getJk().isEmpty() || b.getJadwal_dokter().isEmpty() || b.getAlamat().isEmpty() || b.getRiwayat_penyakit().isEmpty()
             || b.getKeluhan().isEmpty()) {
            System.out.println("Silakan Lengkapi Data Terlebih Dahulu");
            result = false;
        } else {
            try {
                statement = con.prepareStatement(strInsert);
                statement.setInt(1, b.getId_pasien());
                statement.setInt(2, b.getNIK());
                statement.setString(3, b.getNama());
                statement.setString(4, b.getTgl_lahir());
                statement.setInt(5, b.getNo_hp());
                statement.setInt(6, b.getTinggi_badan());
                statement.setInt(7, b.getBerat_badan());
                statement.setString(8, b.getGol_darah());
                statement.setString(9, b.getJk());
                statement.setString(10, b.getJadwal_dokter());
                statement.setString(11, b.getAlamat());
                statement.setString(12, b.getRiwayat_penyakit());
                statement.setString(13, b.getKeluhan());
                statement.execute();
            } catch(SQLException e) {
                System.out.println("Gagal Daftar");
            } finally {
                try {
                    if (statement != null) {
                        statement.close();
                    }
                } catch (SQLException ex) {
                    System.out.println("Gagal Daftar");
                }
            }
        }
    }
    
    Connection con;
    
    //Query SQL
    //insert data
    String strInsert = "insert into calon_pasien (id_pasien, NIK, nama, tgl_lahir, no_hp, tinggi_badan, berat_badan, gol_darah, jk, jadwal_dokter, alamat, riwayat_penyakit, keluhan) values (?,?,?,?,?,?,?,?,?,?,?,?,?);";
}
