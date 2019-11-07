/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang_10116584_latihan52_siapakamu;

/**
 *
 * @author syhar
 */
public class Dosen extends Manusia{
    
    private String nip;
    private String mataKuliah;

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }
    
    public void mengajarApa(){
        System.out.println("Saya Rizki Adam Kurniawan umur 27tahun sedang mengajar mata kuliah PBO");
    }

    @Override
    public void siapaKamu() {
        System.out.println("Saya Dosen");
    }
    
    
    
}
