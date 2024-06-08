/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import Model.Dokter;
/**
 *
 * @author ASUS Vivobook
 */
public class Pasien {

    /**
     * @return the id_pasien
     */
    public Integer getId_pasien() {
        return id_pasien;
    }

    /**
     * @param id_pasien the id_pasien to set
     */
    public void setId_pasien(Integer id_pasien) {
        this.id_pasien = id_pasien;
    }

    /**
     * @return the NIK
     */
    public Integer getNIK() {
        return NIK;
    }

    /**
     * @param NIK the NIK to set
     */
    public void setNIK(Integer NIK) {
        this.NIK = NIK;
    }

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
     * @return the tgl_lahir
     */
    public String getTgl_lahir() {
        return tgl_lahir;
    }

    /**
     * @param tgl_lahir the tgl_lahir to set
     */
    public void setTgl_lahir(String tgl_lahir) {
        this.tgl_lahir = tgl_lahir;
    }

    /**
     * @return the no_hp
     */
    public Integer getNo_hp() {
        return no_hp;
    }

    /**
     * @param no_hp the no_hp to set
     */
    public void setNo_hp(Integer no_hp) {
        this.no_hp = no_hp;
    }

    /**
     * @return the tinggi_badan
     */
    public Integer getTinggi_badan() {
        return tinggi_badan;
    }

    /**
     * @param tinggi_badan the tinggi_badan to set
     */
    public void setTinggi_badan(Integer tinggi_badan) {
        this.tinggi_badan = tinggi_badan;
    }

    /**
     * @return the berat_badan
     */
    public Integer getBerat_badan() {
        return berat_badan;
    }

    /**
     * @param berat_badan the berat_badan to set
     */
    public void setBerat_badan(Integer berat_badan) {
        this.berat_badan = berat_badan;
    }

    /**
     * @return the gol_darah
     */
    public String getGol_darah() {
        return gol_darah;
    }

    /**
     * @param gol_darah the gol_darah to set
     */
    public void setGol_darah(String gol_darah) {
        this.gol_darah = gol_darah;
    }

    /**
     * @return the jk
     */
    public String getJk() {
        return jk;
    }

    /**
     * @param jk the jk to set
     */
    public void setJk(String jk) {
        this.jk = jk;
    }

    /**
     * @return the jadwal_dokter
     */
    public String getJadwal_dokter() {
        return jadwal_dokter;
    }

    /**
     * @param jadwal_dokter the jadwal_dokter to set
     */
    public void setJadwal_dokter(String jadwal_dokter) {
        this.jadwal_dokter = jadwal_dokter;
    }
    
    /**
     * @return the alamat
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * @param alamat the alamat to set
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    /**
     * @return the riwayat_penyakit
     */
    public String getRiwayat_penyakit() {
        return riwayat_penyakit;
    }

    /**
     * @param riwayat_penyakit the riwayat_penyakit to set
     */
    public void setRiwayat_penyakit(String riwayat_penyakit) {
        this.riwayat_penyakit = riwayat_penyakit;
    }

    /**
     * @return the keluhan
     */
    public String getKeluhan() {
        return keluhan;
    }

    /**
     * @param keluhan the keluhan to set
     */
    public void setKeluhan(String keluhan) {
        this.keluhan = keluhan;
    }
    
    private Integer id_pasien;
    private Integer NIK;
    private String nama;
    private String tgl_lahir;
    private Integer no_hp;
    private Integer tinggi_badan;
    private Integer berat_badan;
    private String gol_darah;
    private String jk;
    private String jadwal_dokter;
    private String alamat;
    private String riwayat_penyakit;
    private String keluhan;

}
