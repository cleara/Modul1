package Latihan_oop;

import java.util.Scanner;

public class Latihan10 {
    public static void main (String [] args) {
    Scanner masukan = new Scanner(System.in);
    System.out.println("Masukkan batas bilangan : ");
    int batas = masukan.nextInt();
    int hasil = 0;
    for(int i=1; i<=batas; i++)
    hasil += i;
    System.out.println("Total jumlahnya adalah : " +hasil);
     }
    
}
