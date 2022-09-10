package Fundamental_2;

import java.util.Scanner;

public class IO_2 {

    public static void main(String[] args) {
        // Deklarasi Variabel
        Scanner scan = new Scanner(System.in);
        String[] s_array = new String[3];
        int[] i_array = new int[3];

        // Input
        System.out.println("Masukkan String: ");
        for (int i = 0; i < 3; i++) {
            System.out.print("- String " + (i+1) + ": ");
            s_array[i] = scan.next();
           i_array[i] = scan.nextInt();
        }
        scan.close();
        
        // Output
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            System.out.printf( "%-15s%03d \n", s_array[i], i_array[i]);
        }
        System.out.println("================================");
    }
}



