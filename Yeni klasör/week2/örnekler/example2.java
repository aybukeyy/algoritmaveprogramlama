/*
 adım1:başla
adım2:say1,sayı2,sayı3 al ve oku.
adım3:eğer sayı1>sayı2 
 */

/**
 *
 * @author asus
 */
import java.util.Scanner;
public class example2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz");
        int sayi1 = input.nextInt();
        System.out.println("lütfen bir sayı daha giriniz.");
        int sayi2= input.nextInt();
        System.out.println("lütfen bir sayı daha giriniz.");
        int sayi3 = input.nextInt();
        if (sayi1>sayi2 && sayi1>sayi3) {
            System.out.println(sayi1+" en büyüktür");
            
        }
        else if ( sayi2>sayi3 && sayi2>sayi1){
            System.out.println(sayi2+"en büyüktür.");
        }
        else if (sayi3>sayi1 && sayi3>sayi2){
            System.out.println(sayi3+"en büyüktür.");
        }
        else {
            System.out.println("sayıların birbirine üstünlüğü yok.");
        }
        
    }
    
}
