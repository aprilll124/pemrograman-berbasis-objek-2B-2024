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

public class kubus extends BangunRuang implements info{
    private double sisi;

    public kubus(double sisi) {
        this.sisi = sisi;
    }

    public double hitungvolume() {
        return Math.pow(sisi, 3);
    }

    public void info() {
        System.out.println("----------------------------");
        System.out.println("Kubus dengan sisi = " + sisi);
        System.out.println("Volume : " + hitungvolume());
        System.out.println("============================");
    }
    public static kubus kubusInput() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masuk Penghitungan Kubus");
        System.out.println("----------------------------");
        System.out.print("Masukkan sisi kubus:");
        double sisi = scanner.nextDouble();
        return new kubus(sisi);
    }
}
