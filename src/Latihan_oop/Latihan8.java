package Latihan_oop;

import java.util.Scanner;

public class Latihan8 {
public static void main(String[] args) {
Scanner masukan = new Scanner(System.in);
System.out.print("Masukkan nilsi TPA");
int TPA = masukan.nextInt();
System.out.print("Masukkan nilai Bahasa Inggris : ");
int BahasaInggris = masukan.nextInt();
if ((TPA > 85)&& (BahasaInggris > 80 ))
    System.out.println("Siswa dapat Beasiswa");
else
    System.out.println("Siswa tidak dapat Beasiswa");
}
}
