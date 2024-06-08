/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Gina
 */
public class TabelModelDataUser extends AbstractTableModel{

    public TabelModelDataUser(List<DataUser> lstDU){
        this.lstDU = lstDU;
    }
    
    @Override
    public int getRowCount() {
        return this.lstDU.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public String getColumnName(int coloumn)
    {
        switch(coloumn)
        {
            case 0:
                return "ID User";
            case 1:
                return "Nama Lengkap";
            case 2:
                return "Username";
            case 3:
                return "Email";
            case 4:
                return "Nomor HP";
            case 5:
                return "Password";
            default:
                return null;
        }
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex)
        {
            case 0:
                return lstDU.get(rowIndex).getId();
            case 1:
                return lstDU.get(rowIndex).getNama();
            case 2:
                 return lstDU.get(rowIndex).getUsername();
            case 3:
                 return lstDU.get(rowIndex).getEmail();
            case 4:
                return lstDU.get(rowIndex).getNohp();
            case 5:
                return lstDU.get(rowIndex).getPassword();
            default:
                return null;
        }    
    }
    
    List<DataUser> lstDU;
}
