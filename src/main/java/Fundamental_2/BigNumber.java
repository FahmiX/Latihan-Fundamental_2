package Fundamental_2;

import java.math.BigInteger;
import java.util.Scanner;

public class BigNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Nilai a: ");
        BigInteger a  = scan.nextBigInteger();
        System.out.print("Nilai b: ");
        BigInteger b = scan.nextBigInteger();
        System.out.print("\n");
        scan.close();
        
        
        
        System.out.println("Hasil Penjumlahan: " + a.add(b));
        System.out.println("Hasil Perkalian: " + a.multiply(b));
    }
}




