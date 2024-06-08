/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.DAOBukuPerpus;
import DAOInterface.IDAOBukuPerpus;
import Model.BukuPerpus;
import Model.TabelModelBukuPerpus;
import View.DaftarBukuUser;
import java.util.List;

/**
 *
 * @author Gina
 */
public class ControllerDaftarBukuUser {
    public ControllerDaftarBukuUser(DaftarBukuUser dftrBkuU) {
        this.dftrBkuU = dftrBkuU;
        iBukuPerpus = new DAOBukuPerpus();
        lstBkuP = iBukuPerpus.getAll();
        isiTabel();
     }

    public void isiTabel() {
        lstBkuP = iBukuPerpus.getAll();
        TabelModelBukuPerpus tabelBkuP = new TabelModelBukuPerpus(lstBkuP);
       dftrBkuU.getTabelData().setModel(tabelBkuP);     
    }
    
    public void cari()
    {
        lstBkuP = iBukuPerpus.getAllByName(dftrBkuU.gettxtCariBuku().getText());
        TabelModelBukuPerpus tabelBkuP = new TabelModelBukuPerpus(lstBkuP);
        dftrBkuU.getTabelData().setModel(tabelBkuP);
    }
    
    DaftarBukuUser dftrBkuU;
    IDAOBukuPerpus iBukuPerpus;
    List<BukuPerpus> lstBkuP;

    
}
