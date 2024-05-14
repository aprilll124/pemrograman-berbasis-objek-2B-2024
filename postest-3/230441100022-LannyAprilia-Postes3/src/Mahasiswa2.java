import java.util.ArrayList;
import java.util.Scanner;

public class Mahasiswa2 { 

    private static ArrayList<Orang> mahasiswaList = new ArrayList<>(); 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) { 
            System.out.println("Menu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Lihat Daftar Mahasiswa");
            System.out.println("3. Keluar");

            System.out.print("Masukkan pilihan Anda (1-3): ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    tambahMahasiswa(scanner);
                    break;
                case 2:
                    lihatDaftarMahasiswa();
                    break;
                case 3:
                    System.out.println("Terima kasih telah menggunakan program Universitas!");
                    scanner.close();
                    System.exit(0); 
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }

    private static void tambahMahasiswa(Scanner scanner) {
        System.out.print("Masukkan nama mahasiswa: ");
        String nama = scanner.nextLine();
        scanner.nextLine(); 

        System.out.print("Masukkan NIM mahasiswa : ");
        int nim = scanner.nextInt();

        System.out.print("Masukkan IPK mahasiswa : ");
        double ipk = scanner.nextDouble();

        Orang orang;
        if (nim != 0 && ipk != 0.0) {
            orang = new Mahasiswa(nama, nim, ipk);
        } else {
            orang = new NonMahasiswa(nama);
        }

        mahasiswaList.add(orang);
        System.out.println("Mahasiswa berhasil ditambahkan.");
    }

    private static void lihatDaftarMahasiswa() {
        if (mahasiswaList.isEmpty()) {
            System.out.println("Belum ada mahasiswa yang terdaftar.");
            return;
        }

        System.out.println("Daftar Mahasiswa:");
        for (Orang orang : mahasiswaList) {
            System.out.println(orang);
        }
    }
}


interface Orang {
}

class Mahasiswa implements Orang { 

    private String nama;
    private int nim;
    private double ipk;

    public Mahasiswa(String nama, int nim, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.ipk = ipk;
    }

    public String getNama() { 
        return nama;
    }

    @Override 
    public String toString() {
        return "Nama: " + nama + ", NIM: " + nim + ", IPK: " + ipk;
    }
}

class NonMahasiswa implements Orang { 

    private String nama;

    public NonMahasiswa(String nama) {
        this.nama = nama;
    }

    public String getNama() { 
        return nama;
    }

    @Override 
    public String toString() {
        return "Nama: " + nama + ", Non-Mahasiswa";
    }
}
