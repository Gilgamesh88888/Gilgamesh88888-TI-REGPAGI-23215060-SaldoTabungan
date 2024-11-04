/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class SaldoTabungan {
    public static void main(String[] args) {
        double saldoAwal = 2500000; // Saldo awal
        double bunga = 0.15; // Bunga per bulan (15%)
        int lama = 6; // Lama dalam bulan

        System.out.println("Saldo Awal: Rp. " + saldoAwal);
        for (int i = 1; i <= lama; i++) {
            saldoAwal += saldoAwal * bunga; // Menambah bunga ke saldo
            System.out.printf("Saldo di bulan ke-%d Rp.%,.0f%n", i, saldoAwal);
        }
    }
}
