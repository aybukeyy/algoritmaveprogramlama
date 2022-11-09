/*Girilen pozitif 2 sayının çarpma operatörü kullanmadan çarpan program.
adım1:başla
adım2:sayi1 al
adım3:sayi2 al
adım4: S=0 , sonuc=0
adım5:S<sayi2 S=S+1
adım6:sonuc=sonuc+sayi1
adım7:bitir.
 */

/**
 *
 * @author asus
 */
import java.util.Scanner;

public class carpma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("sayı1 giriniz.");
        int sayi1 = input.nextInt();
        System.out.println("sayı2 giriniz.");
        int sayi2 = input.nextInt();
        int S = 0;
        int sonuc = 0;

        while (S < sayi2) {
            S = S + 1;
            sonuc = sonuc + sayi1;

        }
        System.out.println("sayi1 ve sayi2 nin çarpımı:" + sonuc);
    }
}
