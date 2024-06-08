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
public class TabelModelRiwayat extends AbstractTableModel{

    public TabelModelRiwayat(List<Peminjaman> lstPnjm){
        this.lstPnjm = lstPnjm;
    }
    @Override
    public int getRowCount() {
        return this.lstPnjm.size();
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
                return "nama";
            case 1:
                return "email";
            case 2:
                return "no_telp";
            case 3:
                return "judul_buku";
            case 4:
                return "tgl_peminjaman";
            case 5:
                return "tgl_pengambilan";
            default:
                return null;                
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex)
        {
            case 0:
                return lstPnjm.get(rowIndex).getNama();
            case 1:
                return lstPnjm.get(rowIndex).getEmail();
            case 2:
                return lstPnjm.get(rowIndex).getNo_telp();
            case 3:
                return lstPnjm.get(rowIndex).getJudul_buku();
            case 4:
                return lstPnjm.get(rowIndex).getTgl_peminjaman();
            case 5:
                return lstPnjm.get(rowIndex).getTgl_pengembalian();
            default:
                return null;                
        }
    }
    
    List<Peminjaman> lstPnjm;
}
