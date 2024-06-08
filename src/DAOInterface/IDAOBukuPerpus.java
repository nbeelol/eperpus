/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAOInterface;

import Model.BukuPerpus;
import java.util.List;

/**
 *
 * @author Gina
 */
public interface IDAOBukuPerpus {
    //read data
    public List<BukuPerpus> getAll();
    //insert data
    public void insert(BukuPerpus b);
    //Update data
    public void update(BukuPerpus b);
    //delete data
    public void delete(int id);
    //search data
    public List<BukuPerpus> getAllByName(String judul);
}
