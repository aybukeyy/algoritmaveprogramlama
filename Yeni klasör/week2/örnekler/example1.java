/*
 adım1:başla
adım2:bir a sayısı alalım
adım3:eğer sayı %2 = 0 ise çift yazdır.
adım4:aksi takdirde "tek" yaz.
adım5:bitir.
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
        Scanner input = new Scanner (System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int sayi = input.nextInt ();
        if (sayi %2 == 0) {
            System.out.println(sayi+"çift sayıdır.");
            
        }
        else  {
            System.out.println(sayi+"tek sayıdır.");
        }

        
        // TODO code application logic here
   } 
    
}
