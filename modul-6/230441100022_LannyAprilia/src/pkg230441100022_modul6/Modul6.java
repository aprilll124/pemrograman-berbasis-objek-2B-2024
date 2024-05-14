/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg230441100022_modul6;

/**
 *
 * @author lanny aprilia
 */
import java.util.Scanner;

public class Modul6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean lanjut = true;

    do {
        BangunRuang[] BangunRuang = new BangunRuang[4];

        System.out.println("============================");
        System.out.println("Silahkan Pilih Bangun Ruang");
        System.out.println("----------------------------");
        System.out.println("1. Balok");
        System.out.println("2. Kubus");
        System.out.println("3. Tabung");
        System.out.println("4. Kerucut");
        System.out.println("----------------------------");
        System.out.print("Masukkan Pilihan anda : ");
        int pilihan = scanner.nextInt();
        System.out.println("============================");

        switch (pilihan) {
            case 1:
                BangunRuang[0] = balok.balokInput();
                BangunRuang[0].info();
                break;
            case 2:
                BangunRuang[1] = kubus.kubusInput();
                BangunRuang[1].info();
                break;
            case 3:
                BangunRuang[2] = tabung.tabungInput();
                BangunRuang[2].info();
                break;
            case 4:
                BangunRuang[3] = kerucut.kerucutInput();
                BangunRuang[3].info();
                break;
            default:
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                break;
        }

        System.out.print("Apakah Anda ingin menghitung lagi? (ya/tidak): ");
        String jawaban = scanner.next();
        lanjut = jawaban.equalsIgnoreCase("ya");

        } while (lanjut);

        System.out.println("Terima kasih telah menggunakan program ini!");

        }
}
