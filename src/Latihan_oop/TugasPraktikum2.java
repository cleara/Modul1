import java.io.*;
public class TugasPraktikum2
{
 public static void main(String[] args) throws IOException
 {
  BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
  int celcius;
  double hasilfahrenheit, hasilkelvin, hasilreamur;
  
  celcius = 78;
 
  System.out.println("");
  System.out.println("1. Fahrenheit");
  System.out.println("2. Kelvin");
  System.out.println("3. Reamur");

  System.out.println("");
  
 
   hasilfahrenheit = (celcius*9/5)+32;
   System.out.println(celcius + " Celcius = " + hasilfahrenheit +" Fahrenheit");
 
   hasilkelvin = celcius+273.15;
   System.out.println(celcius + " Celcius = " + hasilkelvin +" Kelvin");

   hasilreamur = celcius*4/5;
   System.out.println(celcius + " Celcius = " + hasilreamur +" Reamur");
 
  
  }
 }
