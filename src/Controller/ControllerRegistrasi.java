/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.DAODataUser;
import DAOInterface.IDAODataUser;
import Model.DataUser;
import View.FormRegistrasi;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Gina
 */
public class ControllerRegistrasi {
    public ControllerRegistrasi (FormRegistrasi frmRegistrasi) {
        this.frmRegistrasi = frmRegistrasi;
        iDataUser = new DAODataUser();
    }
    
    public void insert() {
        {
        DataUser b = new DataUser();
        b.setId(Integer.parseInt(frmRegistrasi.gettxtID().getText()));
        b.setNama(frmRegistrasi.gettxtNama().getText());
        b.setEmail(frmRegistrasi.gettxtEmail().getText());
        b.setNohp(frmRegistrasi.gettxtNohp().getText());
        b.setUsername(frmRegistrasi.gettxtUsername().getText());
        b.setPassword(frmRegistrasi.gettxtPasword().getText());
        boolean res = iDataUser.insert(b);
        if(res)
        JOptionPane.showMessageDialog(null, "Registrasi berhasil");
        else JOptionPane.showMessageDialog(null, "gagal / data duplikat");

         }
    }
    
    public void reset() {
        if(frmRegistrasi.gettxtID().isEnabled())
        frmRegistrasi.gettxtID().setEnabled(true);
        frmRegistrasi.gettxtID().setText("");
        frmRegistrasi.gettxtNama().setText("");
        frmRegistrasi.gettxtEmail().setText("");
        frmRegistrasi.gettxtNohp().setText("");
        frmRegistrasi.gettxtUsername().setText("");
        frmRegistrasi.setPassword().setText("");
    }
    
    
    FormRegistrasi frmRegistrasi;
    IDAODataUser iDataUser;
    List<DataUser> lstDtaU;
}
