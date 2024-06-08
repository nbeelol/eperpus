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
public class TabelModelBukuPerpus extends AbstractTableModel{

    public TabelModelBukuPerpus(List<BukuPerpus> lstBkuP){
        this.lstBkuP = lstBkuP;
    }
    
    @Override
    public int getRowCount() {
        return this.lstBkuP.size();  
    }

    @Override
    public int getColumnCount() {
        return 5;
        }

    @Override
    public String getColumnName(int coloumn)
    {
        switch(coloumn)
        {
            case 0:
                return "Id Buku";
            case 1:
                return "Judul";
            case 2:
                return "Penulis";
            case 3:
                return "Genre";
            case 4:
                return "Status";
            default:
                return null;
        }
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex)
        {
            case 0:
                return lstBkuP.get(rowIndex).getId_buku();
            case 1:
                return lstBkuP.get(rowIndex).getJudul();
            case 2:
                return lstBkuP.get(rowIndex).getPenulis();
            case 3:
                return lstBkuP.get(rowIndex).getGenre();
            case 4:
                return lstBkuP.get(rowIndex).getStatus();
            default:
                return null;
        }    }
    
    List<BukuPerpus> lstBkuP;
}
