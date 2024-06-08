/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.DAODataUser;
import DAOInterface.IDAODataUser;
import Model.DataUser;
import Model.TabelModelDataUser;
import View.FormDataUser;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Gina
 */
public class ControllerDataUser {
    public ControllerDataUser(FormDataUser frmDataUser) {
        this.frmDtaU = frmDataUser;
        iDataUser = new DAODataUser();
    }
    
    public void isiTabel() {
    lstDtaU = iDataUser.getAll();
        TabelModelDataUser tabelDtaU = new TabelModelDataUser(lstDtaU);
        frmDtaU.getTabelData().setModel(tabelDtaU);   
    }
    
    public void update() {
        DataUser b = new DataUser();
        b.setNama(frmDtaU.gettxtNama().getText());
        b.setEmail(frmDtaU.gettxtEmail().getText());
        b.setNohp(frmDtaU.gettxtNohp().getText());
        b.setUsername(frmDtaU.gettxtUsername().getText());
        String password = new String(frmDtaU.setPassword().getPassword());
        b.setPassword(password);
        b.setId(Integer.parseInt(frmDtaU.gettxtID().getText()));
        iDataUser.update(b);
        JOptionPane.showMessageDialog(null, "Update data berhasil");
    }
    
    public void reset() {
        if(frmDtaU.gettxtID().isEnabled())
        frmDtaU.gettxtID().setEnabled(true);
        frmDtaU.gettxtID().setText("");
        frmDtaU.gettxtNama().setText("");
        frmDtaU.gettxtEmail().setText("");
        frmDtaU.gettxtNohp().setText("");
        frmDtaU.gettxtUsername().setText("");
        frmDtaU.setPassword().setText("");
    }

    public void isiField(int row) {
        frmDtaU.gettxtID().setEnabled(false);
        frmDtaU.gettxtID().setText(Integer.toString(lstDtaU.get(row).getId()));
        frmDtaU.gettxtNama().setText(lstDtaU.get(row).getNama());
        frmDtaU.gettxtEmail().setText(lstDtaU.get(row).getEmail());
        frmDtaU.gettxtNohp().setText(lstDtaU.get(row).getNohp());
        frmDtaU.gettxtUsername().setText(lstDtaU.get(row).getUsername()); 
        frmDtaU.setPassword().setText(lstDtaU.get(row).getPassword());
    }

    public void delete() {
        DataUser b = new DataUser();
        iDataUser.delete(Integer.parseInt(frmDtaU.gettxtID().getText()));
        JOptionPane.showMessageDialog(null, "Delete data berhasil");
    }
    
    
    FormDataUser frmDtaU;
    IDAODataUser iDataUser;
    List<DataUser> lstDtaU;

}
