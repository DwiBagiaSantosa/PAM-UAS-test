package com.example.pinjambuku.Model;

public class DataModel {
    private int id;
    private String nama, nim, judul_buku, tgl_pinjam, tgl_kembalikan;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getJudul_buku() {
        return judul_buku;
    }

    public void setJudul_buku(String judul_buku) {
        this.judul_buku = judul_buku;
    }

    public String getTgl_pinjam() {
        return tgl_pinjam;
    }

    public void setTgl_pinjam(String tgl_pinjam) {
        this.tgl_pinjam = tgl_pinjam;
    }

    public String getTgl_kembalikan() {
        return tgl_kembalikan;
    }

    public void setTgl_kembalikan(String tgl_kembalikan) {
        this.tgl_kembalikan = tgl_kembalikan;
    }
}
