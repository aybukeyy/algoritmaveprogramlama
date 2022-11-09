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

public class a2b2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("lütfen pozitif bir sayı giriniz.");
        int S = input.nextInt();
        for (int i = 1; i <= S; i++) {
            for (int j = 1; j <= S; j++) {
                if (S == i * i + j * j) {
                    System.out.println(i + "-" + j);
                }

            }

        }

    }

}
