/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.DAODokter;
import DAO.DAOPasien;
import DAOInterface.IDAOPasien;
import Helper.KoneksiDB;
import Model.Dokter;
import Model.Pasien;
import View.Daftar;
import View.Konfirmasi;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS Vivobook
 */
public class ControllerPasien {
   //nama frame 
    public ControllerPasien(Daftar dft)
    {
        //panggil frame
        this.dft = dft;
        iPasien = new DAOPasien();
        iDokter = new DAODokter();
        isiCBJadwalDokter();
    }
    
    public void insert() {
        Pasien b = new Pasien();
        b.setId_pasien(Integer.parseInt(dft.gettxtID().getText()));
        b.setNIK(Integer.parseInt(dft.gettxtNIK().getText()));
        b.setNama(dft.gettxtnama().getText());
        b.setTgl_lahir(dft.gettxttgl().getText());
        b.setNo_hp(Integer.parseInt(dft.gettxtnohp().getText()));
        b.setTinggi_badan(Integer.parseInt(dft.gettxttinggi().getText()));
        b.setBerat_badan(Integer.parseInt(dft.gettxtberat().getText()));
        b.setGol_darah(dft.gettxtgol().getText());
        b.setJk(dft.getJkel().getSelectedItem().toString());
        b.setJadwal_dokter(dft.getJadwal().getSelectedItem().toString());
        b.setAlamat(dft.gettxtalamat().getText());
        b.setRiwayat_penyakit(dft.gettxtriwayat().getText());
        b.setKeluhan(dft.gettxtkeluhan().getText());
        iPasien.insert(b);
            JOptionPane.showMessageDialog(null, "Silakan Cek Kembali Data Anda");
    }
    
    
    // Metode untuk mengisi combobox dengan jadwal dokter
     private void isiCBJadwalDokter() {
        List<Dokter> lstdr = iDokter.getJadwalDokter();
        for (Dokter dr : lstdr) {
            // Format teks yang akan ditampilkan di combobox
            String jdwdr = dr.getNama_dokter() + " - " + dr.getSpesialisasi() + " - " + dr.getJadwal_dokter();
            // Tambahkan teks ke combobox
            dft.getJadwal().addItem(jdwdr);
        }
     }
     
     public void daftar(JFrame currentFrame){
        Daftar dft = new Daftar();
        dft.setVisible(true);
        //Menutup form 
        currentFrame.dispose(); 
    }
     
     public void konf(JFrame currentFrame){
        Konfirmasi konf = new Konfirmasi();
        konf.setVisible(true);
        //Menutup form 
        currentFrame.dispose(); 
    }
    
    //Property
    //Panggil form
    Daftar dft;
    IDAOPasien iPasien;
    DAODokter iDokter;
 
}
