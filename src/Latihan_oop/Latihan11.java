package Latihan_oop;

import java.util.Scanner;

public class Latihan11 {
        public static void main (String [] args) {
        Scanner masukan = new Scanner(System.in);
        int a=0, total=0, bil=7 ;
        while (bil!=0){
            a++;
            System.out.println("Masukkan bilangan ke-"+a+" :");
            bil = masukan.nextInt();
            total += bil;
        }
        System.out.print("Total jumlah "+(a-1)+" bilangan : ");
        System.out.println(total);
        
        }

    
}
