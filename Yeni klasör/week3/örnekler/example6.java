/*
adım1:başla
adım2:bir sayı giriniz
adım3:toplam=0
adım4:eğer n0 ise 
adım5:kalan=n%10
adım5:toplam=toplam+kalan 
adım6:n=n/10
adım7
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
        System.out.println("bir sayı giriniz.");
        int n = input.nextInt();
        int toplam = 0;
        while (n > 0) {
            int kalan = n % 10;
            toplam = toplam + kalan;
            n = n / 10;
        }

        System.out.println("basamaklar toplamı:" + toplam);
    }

}
