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

public class example1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi;
        do {
            System.out.print("lütfen pozitif bir tam sayı giriniz.");
            sayi = input.nextInt();

        } while (sayi <= 0);
        System.out.println("girilen sayı: " + sayi);

    }
    /*
    System.out.print("lütfen pozitif bir tam sayı giriniz.");
                    sayi=input.nextInt();
    while(sayi<=0)
    {
    System.out.println("lütfen pozitif bir tam sayı giriniz.é);
    sayi=input.nextInt();}
    
     */

}
