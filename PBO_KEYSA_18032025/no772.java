/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LABSIKOMP03
 */
import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class no772 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[10];

        for (int i = 0; i < 10; i++) {
            try {
                String input = JOptionPane.showInputDialog("Masukkan nomor ke-" + (i + 1) + ":");
                numbers[i] = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Input tidak valid. Silakan masukkan angka.");
                i--; 
            }
        }
        int maxNumber = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }
        }
        JOptionPane.showMessageDialog(null, "Nomor terbesar yang Anda masukkan adalah: " + maxNumber);
    }
}
