/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laundry_main;

/**
 *
 * @author Dio
 */
public class Laundry {

    int h;
    double total;

    public void Reguler(float i, int a) {
        if (a == 1) {
            h = 3000;
            total = h * i;

        } else if (a == 2) {
            h = 2000;
            total = h * i;

        } else if (a == 3) {
            h = 5000;
            total = h * i;

        } else {
            System.out.println("Pilihan Tidak ada di Daftar");
        }
        System.out.println("Jumlah yan harus dibayar : " + total);
    }

    public void Ekspres(float i, int a) {
        if (a == 1) {
            h = 5000;
            total = h * i;

        } else if (a == 2) {
            h = 4000;
            total = h * i;

        } else if (a == 3) {
            h = 8000;
            total = h * i;

        } else {
            System.out.println("Pilihan Tidak ada di Daftar");
        }
        System.out.println("Jumlah yan harus dibayar : " + total);
    }

    public void Struk(String n, float ber) {
        System.out.println("Terimakasih Telah Menggunakan Jasa Laundry Semakin Didepan");
        System.out.println("Nama : " + n);
        System.out.println("Berat :" + ber + " Kg");
    }

}
