package pemlanModul3Bab8;

import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Input Objek Pertama ===");
        System.out.print("Masukkan nama: ");
        String nama1 = input.nextLine();

        System.out.print("Masukkan umur: ");
        int umur1 = input.nextInt();
        input.nextLine(); 

        System.out.print("Masukkan hobi: ");
        String hobi1 = input.nextLine();

        Manusia m1 = new Manusia(nama1, umur1, hobi1);

        System.out.println("\n=== Input Objek Kedua ===");
        System.out.print("Masukkan nama: ");
        String nama2 = input.nextLine();

        System.out.print("Masukkan umur: ");
        int umur2 = input.nextInt();
        input.nextLine();

        System.out.print("Masukkan hobi: ");
        String hobi2 = input.nextLine();

        Manusia m2 = new Manusia(nama2, umur2, hobi2);

        System.out.println("\n=== Objek Pertama ===");
        m1.TampilkanNama();
        m1.TampilkanUmur();
        m1.TampilkanHobi();
        m1.makan();
        m1.berjalan();
        m1.bersuara();

        System.out.println("\n=== Objek Kedua ===");
        m2.makan(); // method berbeda (perilaku dulu)
        m2.berjalan();
        m2.bersuara();
        m2.bernapas();
        m2.TampilkanNama();
        m2.TampilkanUmur();
        m2.TampilkanHobi();

        input.close();
    }
}