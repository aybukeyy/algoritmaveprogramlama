/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
import java.util.Scanner;
public class yildiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner input= new Scanner(System.in);
     System.out.print("satır sayısı giriniz.");
     int n=input.nextInt();
     
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("*");
                
            }
            System.out.println(" ");
        }
    }
    
}
