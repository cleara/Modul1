package Latihan_oop;

import java.io.PrintStream;
import java.util.Scanner;

public class TugasPraktikum1 {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        double phi =3.14;
      
        System.out.println("Nilai phi : "+phi);
        System.out.print("Nilai r   : ");
        int r = masukan.nextInt();
        System.out.println("Menghitung luas permukaan bola");
        System.out.println("Luas Permukaan Bola = "+((4*phi*r*r)));
             
        
        
    }
}
