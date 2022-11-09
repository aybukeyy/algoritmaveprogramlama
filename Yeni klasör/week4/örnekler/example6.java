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

public class example6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bir satır değeri gir.");
        int row = input.nextInt();
        System.out.println();
        System.out.println("bir sütun değeri gir.");
        int col = input.nextInt();
        System.out.println();
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                System.out.print("*");
            }
            System.out.println();//alt satıra geçer.

        }

    }

}
