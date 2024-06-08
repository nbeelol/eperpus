/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.DAOBukuPerpus;
import DAO.DAOPeminjaman;
import DAOInterface.IDAOPeminjaman;
import Model.BukuPerpus;
import Model.Peminjaman;
import Model.TabelModelRiwayat;
import View.FormPeminjaman;
import View.FormRiwayat;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Gina
 */
public class ControllerPeminjaman {
    
    public ControllerPeminjaman(FormPeminjaman frmPeminjaman){
        this.frmPeminjaman = frmPeminjaman;
        iPeminjaman = new DAOPeminjaman();
        daoP = new DAOBukuPerpus();
        isiCBJudulBuku();
    }

    public void isiTabel() {
        lstPnjm = iPeminjaman.getAll();
        TabelModelRiwayat tabelRwyt = new TabelModelRiwayat(lstPnjm);
        frmRiwayat.getTabelData().setModel(tabelRwyt);    
    }
    
    public void insert()
    {
        Peminjaman b = new Peminjaman();
        b.setNama(frmPeminjaman.gettxtNamaPengguna().getText());
        b.setEmail(frmPeminjaman.gettxtEmail().getText());
        b.setNo_telp(frmPeminjaman.gettxtNoTelp().getText());
        b.setJudul_buku(frmPeminjaman.gettxtJudul().getSelectedItem().toString());
        b.setTgl_peminjaman(frmPeminjaman.gettxtTglPeminjaman().getText());
        b.setTgl_pengembalian(frmPeminjaman.gettxtTglPengembalian().getText());
        iPeminjaman.insert(b);
        JOptionPane.showMessageDialog(null, "Peminjaman berhasil");
    }
    
    public void reset()
    {
        frmPeminjaman.gettxtNamaPengguna().setText("");
        frmPeminjaman.gettxtEmail().setText("");
        frmPeminjaman.gettxtNoTelp().setText("");
        frmPeminjaman.gettxtJudul().setSelectedItem("Pilih Judul Buku");
        frmPeminjaman.gettxtTglPeminjaman().setText("");
        frmPeminjaman.gettxtTglPengembalian().setText("");
    }
    
    
    private void isiCBJudulBuku() {
    List<BukuPerpus> lstBkuP = daoP.getJudulBuku();
        for (BukuPerpus pm : lstBkuP) {
            // Format teks yang akan ditampilkan di combobox
            String judul = pm.getJudul() + " - " + pm.getPenulis() + " - " + pm.getGenre();
            // Tambahkan teks ke combobox
            frmPeminjaman.gettxtJudul().addItem(judul);
        }    }
    
    FormPeminjaman frmPeminjaman;
    FormRiwayat frmRiwayat;
    IDAOPeminjaman iPeminjaman;
    List<Peminjaman> lstPnjm;
    DAOBukuPerpus daoP;
}
