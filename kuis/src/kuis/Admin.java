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
public class Admin extends Peserta implements Nilai{
    protected int tPraktek;
    protected double nilai_rata;
    public Admin(String nama,int nim,int tTulis,int tCoding,int tWawancara,int tPraktek) {
        super(nama, nim, tTulis,tCoding, tWawancara);
        this.tPraktek = tPraktek;
        menghitungNilai();
    }

    @Override
    public void menghitungNilai() {
        nilai_rata = (super.tCoding + super.tTulis + super.tWawancara + tPraktek)/4;
    }
    
}
