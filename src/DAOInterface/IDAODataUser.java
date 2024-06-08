/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAOInterface;

import Model.DataUser;
import java.util.List;

/**
 *
 * @author Gina
 */
public interface IDAODataUser {
    public List<DataUser> getAll();
    //insert data
    public boolean insert(DataUser b);
    //Update data
    public void update(DataUser b);
    //delete data
    public void delete(int id);
    //search data
    public List<DataUser> getAllByName(String nama);
}
