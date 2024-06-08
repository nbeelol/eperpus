/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Gina
 */
public class BukuPerpus {

    /**
     * @return the id_buku
     */
    public Integer getId_buku() {
        return id_buku;
    }

    /**
     * @param id_buku the id_buku to set
     */
    public void setId_buku(Integer id_buku) {
        this.id_buku = id_buku;
    }

    /**
     * @return the judul
     */
    public String getJudul() {
        return judul;
    }

    /**
     * @param judul the judul to set
     */
    public void setJudul(String judul) {
        this.judul = judul;
    }

    /**
     * @return the penulis
     */
    public String getPenulis() {
        return penulis;
    }

    /**
     * @param penulis the penulis to set
     */
    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    /**
     * @return the genre
     */
    public String getGenre() {
        return genre;
    }

    /**
     * @param genre the genre to set
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    private Integer id_buku;
    private String judul;
    private String penulis;
    private String genre;
    private String status;
}
