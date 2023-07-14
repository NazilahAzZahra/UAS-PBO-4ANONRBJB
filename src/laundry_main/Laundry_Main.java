/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laundry_main;

/**
 *
 * @author Dio
 */
import java.util.Scanner;

public class Laundry_Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Laundry l = new Laundry();

        int B, PP;
        String nama;
        System.out.println("Laundry Semakin Didepan");
        System.out.println("");
        System.out.print("Nama : ");
        nama = s.nextLine();
        System.out.println("");
        System.out.println("Pilih Pelayanan");
        System.out.println("1. Reguler 3 Hari");
        System.out.println("2. Ekspres 1 Hari");
        System.out.print("Masukkan Pilihan : ");
        int kategori = s.nextInt();

        if (kategori == 1) {
            System.out.println("Reguler 3 Hari");
            System.out.println("");
            System.out.println("Pilih Paket");
            System.out.println("1. Cuci Kering");
            System.out.println("2. Setrika");
            System.out.println("3. Cuci Kering, dan Setrika");
            System.out.print("Masukkan Pilihan : ");
            PP = s.nextInt();
            System.out.println("");
            System.out.print("Masukkan Berat : ");
            B = s.nextInt();
            System.out.println("");
            System.out.println("");
            l.Struk(nama, B);
            l.Reguler(B, PP);
        } else if (kategori == 2) {
            System.out.println("Ekspres 1 Hari");
            System.out.println("");
            System.out.println("Pilih Paket");
            System.out.println("1. Cuci Kering");
            System.out.println("2. Setrika");
            System.out.println("3. Cuci Kering, dan Setrika");
            System.out.print("Masukkan Pilihan : ");
            PP = s.nextInt();
            System.out.println("");
            System.out.print("Masukkan Berat : ");
            B = s.nextInt();
            System.out.println("");
            l.Struk(nama, B);
            l.Ekspres(B, PP);
        } else {
            System.out.println("Pilihan Tidak ada di Daftar");
        }

    }
}
