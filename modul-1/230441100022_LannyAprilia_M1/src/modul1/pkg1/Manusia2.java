/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul1.pkg1;

/**
 *
 * @author lanny aprilia
 */
public class Manusia2 {
    public static void main(String[] args) {
        Manusia Orang1 = new Manusia() ;
        Manusia Orang2 = new Manusia() ;
        Manusia Orang3 = new Manusia() ;
        
        Orang1.Nama = " Lanny";
        Orang1.Umur = 19 ;
        Orang1.Alamat = "Kedungbanteng RT.05 RW.02";
        
        Orang2.Nama = " Nadia ";
        Orang2.Umur = 15 ;
        Orang2.Alamat = "Jl. Supratman No.03 ";  
        
        Orang3.Nama = " Aliando ";
        Orang3.Umur = 27 ;
        Orang3.Alamat = "Jl. Perum. Pattimura 01";
        
//        Method Berlari
        System.out.println("Output Untuk Method Berlari");
        Orang1.Berlari();
        Orang2.Berlari();
        Orang3.Berlari();
        
//        Method Berjalan
        System.out.println("Output Untuk Method Berjalan");
        Orang1.Berjalan();
        Orang2.Berjalan();
        Orang3.Berjalan();
    }
}
