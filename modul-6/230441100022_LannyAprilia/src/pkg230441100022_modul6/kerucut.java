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

public class kerucut extends BangunRuang implements info {
    private double jariJari;
    private double tinggi;

    public kerucut(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    public double hitungvolume() {
        return (1.0 / 3.0) * Math.PI * Math.pow(jariJari, 2) * tinggi;
    }

    public void info() {
        System.out.println("----------------------------");
        System.out.println("Kerucut dengan jari-jari = " + jariJari + " dan tinggi = " + tinggi);
        System.out.println("Volume : " + hitungvolume());
        System.out.println("============================");
    }
    
    public static kerucut kerucutInput() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masuk Penghitungan Kerucut");
        System.out.println("----------------------------");
        System.out.print("Masukkan jari jari Kerucut:");
        double jarijari = scanner.nextDouble();
        System.out.print("Masukkan tinggi Kerucut:");
        double tinggi = scanner.nextDouble();
        return new kerucut(jarijari,tinggi);
    }
    
}

