package Fundamental_2;

import java.util.Scanner;

public class GajiAgent {

    public static void main(String[] args) {
        long gaji = 500000;
        long bonus = 0;
        int item = 50000;

        Scanner scan = new Scanner(System.in);
        System.out.print("Total Penjualan: ");
        int penjualan = scan.nextInt();
        scan.close();

        if (penjualan >= 80) {
            bonus = (long) ((penjualan * item) * 0.35);
            gaji = gaji + bonus;
        } else if (penjualan >= 40) {
            bonus = (long) ((penjualan * item) * 0.25);
            gaji = gaji + bonus;
        } else if (penjualan < 15) {
            bonus = (long) (((15 - penjualan) * item) * 0.15);
            gaji = gaji - bonus;
        } else {
            bonus = (long) ((penjualan * item) * 0.10);
            gaji = gaji + bonus;
        }
        
        System.out.println("Gaji yang diterima: " + gaji);
    }
}

