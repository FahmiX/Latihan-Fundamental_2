package Fundamental_2;

import java.util.Scanner;

public class Berhitung {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long hasil = 0;

        // Input
        System.out.print("Masukkan Operasi: ");
        String S_Input = scan.nextLine();
        scan.close();

        // Process
        String[] S = S_Input.split(" ");
        int A = Integer.parseInt(S[0]);
        int B = Integer.parseInt(S[2]);
        String operator = S[1];

        switch (operator) {
            case "+":
                hasil = A + B;
                break;
            case "-":
                hasil = A - B;
                break;
            case "*":
                hasil = A * B;
                break;
            case "/":
                hasil = A / B;
                break;
            case "%":
                hasil = A % B;
                break;
            default:
                System.out.println("Operasi Tidak Valid!");
                break;
        }

        System.out.println("Hasil Operasi Tersebut: " + hasil);
    }
}





