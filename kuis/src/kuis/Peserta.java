/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis;

/**
 *
 * @author User
 */
public class Peserta {
    protected String nama;
    protected int nim;
    protected int tTulis;
    protected int tCoding;
    protected int tWawancara;

    public Peserta(String nama,int nim,int tTulis,int tCoding,int tWawancara) {
        this.nama = nama;
        this.nim = nim;
        this.tTulis = tTulis;
        this.tCoding = tCoding;
        this.tWawancara = tWawancara;
    }
}
