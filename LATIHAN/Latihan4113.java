/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LATIHAN;

/**
 *
 * @author LAB-MM
 */
public class Latihan4113 {
    public static void main( String[] args ){
         double angka1 = 10;
         System.out.println("Number1 = 10");
  
         double angka2 = 23;
          System.out.println("Number2 = 23");
         
         double angka3 = 5;
          System.out.println("Number3 = 5");
         double terbesar = (angka1 > angka2)
                 ? (angka1 >angka3 ? angka1 : angka3)
                 : (angka2 >angka3 ? angka2 : angka3);
         
         System.out.println("Angka terbesar adalah ="+ terbesar);
    }
}
