/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang_10116584_latihan52_siapakamu;

/**
 *
 * @author
 * NIM : 10116584
 * Nama : Muhammad Syahrun Dalu
 */
public class PBOUlang_10116584_Latihan52_SiapaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Manusia x = new Manusia();
        Dosen y = new Dosen();
        Mahasiswa z = new Mahasiswa();
        
        y.setNip("41227829930");
        System.out.println("NIP DOSEN : "+y.getNip());
        y.siapaKamu();
        y.mengajarApa();        
        System.out.println("");
        z.setNim("10110269");
        z.siapaKamu();
        z.kelasApa();
        
        
        
    }
    
}
