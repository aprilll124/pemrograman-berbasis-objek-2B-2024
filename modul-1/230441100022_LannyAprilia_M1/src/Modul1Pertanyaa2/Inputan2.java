/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul1Pertanyaa2;
import java.util.Scanner;
import java.math.BigInteger;
/**
 *
 * @author lanny aprilia
 */
class Mahasiswa {
    String Nama;
    BigInteger Nim;
    String Jurusan;
    String Alamat;
}

public class Inputan2 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        Mahasiswa mhs = new Mahasiswa();
        
//        Input
        System.out.print("Masukkan Nama   : ");
        mhs.Nama = Input.nextLine();
        System.out.print("Masukkan NIM    : ");
        mhs.Nim = new BigInteger(Input.nextLine());
        System.out.print("Masukkan Jurusan: ");
        mhs.Jurusan = Input.nextLine();
        System.out.print("Masukkan Alamat : ");
        mhs.Alamat = Input.nextLine();

//        Output
        System.out.println("\nBiodata Mahasiswa  :");
        System.out.println("Nama            : " + mhs.Nama);
        System.out.println("NIM             : " + mhs.Nim);
        System.out.println("Jurusan         : " + mhs.Jurusan);
        System.out.println("Alamat          : " + mhs.Alamat);
}
}