/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Gina
 */
public class Peminjaman {

    /**
     * @return the id_pengguna
     */

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the no_telp
     */
    public String getNo_telp() {
        return no_telp;
    }

    /**
     * @param no_telp the no_telp to set
     */
    public void setNo_telp(String no_telp) {
        this.no_telp = no_telp;
    }

    /**
     * @return the judul_buku
     */
    public String getJudul_buku() {
        return judul_buku;
    }

    /**
     * @param judul_buku the judul_buku to set
     */
    public void setJudul_buku(String judul_buku) {
        this.judul_buku = judul_buku;
    }

    /**
     * @return the tgl_peminjaman
     */
    public String getTgl_peminjaman() {
        return tgl_peminjaman;
    }

    /**
     * @param tgl_peminjaman the tgl_peminjaman to set
     */
    public void setTgl_peminjaman(String tgl_peminjaman) {
        this.tgl_peminjaman = tgl_peminjaman;
    }

    /**
     * @return the tgl_pengembalian
     */
    public String getTgl_pengembalian() {
        return tgl_pengembalian;
    }

    /**
     * @param tgl_pengembalian the tgl_pengembalian to set
     */
    public void setTgl_pengembalian(String tgl_pengembalian) {
        this.tgl_pengembalian = tgl_pengembalian;
    }
    
    private String nama;
    private String email;
    private String no_telp;
    private String judul_buku;
    private String tgl_peminjaman;   
    private String tgl_pengembalian;
}
