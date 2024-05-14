/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg230441100022_modul6;

/**
 *
 * @author lanny aprilia
 */
import java.util.Scanner;

public class balok extends BangunRuang implements info{
    private double panjang;
    private double lebar;
    private double tinggi;
    
    public balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    
    public double hitungvolume() {
        return panjang * lebar * tinggi;
    }
    
    public static balok balokInput() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masuk Penghitungan Balok");
        System.out.println("----------------------------");
        System.out.print("Masukkan panjang balok:");
        double panjang = scanner.nextDouble();
        System.out.print("Masukkan lebar balok:");
        double lebar = scanner.nextDouble();
        System.out.print("Masukkan tinggi balok:");
        double tinggi = scanner.nextDouble();
        return new balok(panjang,lebar,tinggi);
    }
    
    public void info() {
        System.out.println("----------------------------");
        System.out.println("Balok dengan panjang = " + panjang + ", lebar = " + lebar + ", tinggi = " + tinggi);
        System.out.println("Volume : " + hitungvolume());
        System.out.println("============================");
    }
}
