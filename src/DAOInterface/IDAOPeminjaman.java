/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAOInterface;

import Model.Peminjaman;
import java.util.List;

/**
 *
 * @author Gina
 */
public interface IDAOPeminjaman {
    //read data
    public List<Peminjaman> getAll();
    //insert data
    public void insert(Peminjaman b);
    
    
}
