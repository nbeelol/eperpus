/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAOInterface;


import Model.DaftarBukuUser;
import java.util.List;

/**
 *
 * @author Gina
 */
public interface IDAODaftarBukuUser {
    //read data
    public List<DaftarBukuUser> getAll();
    //search data
    public List<DaftarBukuUser> getAllByName(String judul);
}
