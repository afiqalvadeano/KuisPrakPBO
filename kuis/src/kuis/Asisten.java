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
public class Asisten extends Peserta implements Nilai{
    protected int tMTeaching;
    protected double nilai_rata;
    public Asisten(String nama,int nim,int tTulis,int tCoding,int tWawancara,int tMTeaching) {
        super(nama, nim, tTulis,tCoding, tWawancara);
        this.tMTeaching = tMTeaching;
        menghitungNilai();
    }

    @Override
    public void menghitungNilai() {
        nilai_rata = (super.tCoding + super.tTulis + super.tWawancara + tMTeaching)/4;
    }
}
