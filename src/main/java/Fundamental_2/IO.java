package Fundamental_2;

import java.util.Scanner;

public class IO {

    public static void main(String[] args) {
        // Input
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Kalimat: ");
        String s = scan.nextLine();
        scan.close();

        // Process
        // Memisahkan String dan Memasukannya ke dalam Array 
        String[] splitString = (s.replaceAll("^\\W+", "").split("[\\s!,?._'@]+")); 

        // Output
        System.out.print("\nJumlah Token:  ");
        System.out.println(splitString.length);
        System.out.println("\nIsi Token:  ");
        for (String string : splitString) {
            System.out.println("- " + string);
        }
    }
}



