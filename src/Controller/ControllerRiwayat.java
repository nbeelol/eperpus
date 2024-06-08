/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.DAOPeminjaman;
import DAOInterface.IDAOPeminjaman;
import Model.Peminjaman;
import Model.TabelModelRiwayat;
import View.FormRiwayat;
import java.util.List;

/**
 *
 * @author Gina
 */
public class ControllerRiwayat {    

    public ControllerRiwayat(FormRiwayat frmRiwayat) {
        this.frmRiwayat = frmRiwayat;
        iPeminjaman = new DAOPeminjaman();
        lstPnjm = iPeminjaman.getAll();
        isiTabel();    }


    public void isiTabel() {
        lstPnjm = iPeminjaman.getAll();
        TabelModelRiwayat tabelRwyt = new TabelModelRiwayat(lstPnjm);
       frmRiwayat.getTabelData().setModel(tabelRwyt);    
    }
    
    FormRiwayat frmRiwayat;
    IDAOPeminjaman iPeminjaman;
    List<Peminjaman> lstPnjm;
}
