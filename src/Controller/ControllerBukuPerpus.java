/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.DAOBukuPerpus;
import DAOInterface.IDAOBukuPerpus;
import Model.BukuPerpus;
import Model.TabelModelBukuPerpus;
import View.FormBukuPerpus;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Gina
 */
public class ControllerBukuPerpus {
    
    public ControllerBukuPerpus(FormBukuPerpus frmBukuPerpus){
        this.frmBkuP = frmBukuPerpus;
        iBukuPerpus = new DAOBukuPerpus();
    }
    
    public void isiTabel() {
        lstBkuP = iBukuPerpus.getAll();
        TabelModelBukuPerpus tabelBkuP = new TabelModelBukuPerpus(lstBkuP);
        frmBkuP.getTabelData().setModel(tabelBkuP); 
    }
    
    public void insert()
    {
        BukuPerpus b = new BukuPerpus();
        b.setId_buku(Integer.parseInt(frmBkuP.gettxtIdBuku().getText()));
        b.setJudul(frmBkuP.gettxtJudul().getText());
        b.setPenulis(frmBkuP.gettxtPenulis().getText());
        b.setGenre(frmBkuP.getGenre().getSelectedItem().toString());
        b.setStatus(frmBkuP.getStatus().getSelectedItem().toString());
        iBukuPerpus.insert(b);
        JOptionPane.showMessageDialog(null, "Input berhasil");
    }
    
    public void reset()
    {
        if(frmBkuP.gettxtIdBuku().isEnabled())
            frmBkuP.gettxtIdBuku().setEnabled(true);
        frmBkuP.gettxtIdBuku().setText("");
        frmBkuP.gettxtJudul().setText("");
        frmBkuP.gettxtPenulis().setText("");
        frmBkuP.getGenre().setSelectedItem("Fiksi");
        frmBkuP.getStatus().setSelectedItem("Tersedia");
    }
    
    public void isiField(int row)
    {
        frmBkuP.gettxtIdBuku().setEnabled(false);
        frmBkuP.gettxtIdBuku().setText(lstBkuP.get(row).getId_buku().toString());
        frmBkuP.gettxtJudul().setText(lstBkuP.get(row).getJudul());
        frmBkuP.gettxtPenulis().setText(lstBkuP.get(row).getPenulis());
        frmBkuP.getGenre().setSelectedItem(lstBkuP.get(row).getGenre());
        frmBkuP.getStatus().setSelectedItem(lstBkuP.get(row).getStatus());
    }
    
    public void update()
    {
        BukuPerpus b = new BukuPerpus();
        b.setJudul(frmBkuP.gettxtJudul().getText());
        b.setPenulis(frmBkuP.gettxtPenulis().getText());
        b.setGenre(frmBkuP.getGenre().getSelectedItem().toString());
        b.setStatus(frmBkuP.getStatus().getSelectedItem().toString());
        b.setId_buku(Integer.parseInt(frmBkuP.gettxtIdBuku().getText()));
        iBukuPerpus.update(b);
        JOptionPane.showMessageDialog(null, "Update berhasil");
    }
    
    public void delete()
    {
        BukuPerpus b = new BukuPerpus();
        iBukuPerpus.delete(Integer.parseInt(frmBkuP.gettxtIdBuku().getText()));
        JOptionPane.showMessageDialog(null, "Delete berhasil");
    }
    
    public void cari()
    {
        lstBkuP = iBukuPerpus.getAllByName(frmBkuP.gettxtCariBuku().getText());
        TabelModelBukuPerpus tabelBkuP = new TabelModelBukuPerpus(lstBkuP);
        frmBkuP.getTabelData().setModel(tabelBkuP);
    }
    
    
    FormBukuPerpus frmBkuP;
    IDAOBukuPerpus iBukuPerpus;
    List<BukuPerpus> lstBkuP;
    
}
