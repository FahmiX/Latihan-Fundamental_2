package Fundamental_2;

import java.util.Scanner;

public class BukaTutupJalan {

    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);

        // Input
        System.out.print("Masukkan Nomor Kendaraan: ");
        String S_Input = scan.nextLine();

        // Process
        String[] S = S_Input.split(" ");
        String result = S[0] + S[1] + S[2] + S[3];
        double sum = Double.parseDouble(result);
        double hasil = (sum - 999999) % 5;

        if (hasil == 0) {
            System.out.println("Berhenti");
        } else {
            System.out.println("Jalan");
        }
    }
}


