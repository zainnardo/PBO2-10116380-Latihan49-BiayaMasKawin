/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116380.latihan49.biayamaskawin;

/**
 * @author 
 * Nama  : Zain Achmad Rizqullah
 * Nim   : 10116380
 * Kelas : PBO2
 * Deskripsi Program : program ini tentang Menghitung biaya dari mas kawin
 */
public class PBO210116380Latihan49BiayaMasKawin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
          BiayaEmas bimas = new BiayaEmas();
        bimas.setEmasKawin(15.7);
        bimas.setHargaSatuGram(570000);
        
        System.out.println("Hendri membeli emas kawin : " + bimas.getEmasKawin() 
                + " gram");
        System.out.println("Harga 1 gram emas per bulan oktober ini : Rp. " 
                + bimas.getHargaSatuGram());
        System.out.println();
        
        double emas_kawin = bimas.getEmasKawin();
        double harga_satu_gram = bimas.getHargaSatuGram();
        
        System.out.println("Total pembayaran yang harus dikeluarkan : Rp. " 
                + bimas.hitungTotalPembayaran(emas_kawin, harga_satu_gram));
        
    }
    
}
