/*Girilen n sayısına kadar tek ve çift sayıları toplayan program.
adım1:başla
adım2:kullanıcıdan bir n sayısı al.
adım3:tek toplam=0 çift toplam=0
adım4:s=1
adım5:eğer s>n ise adım9 git
adım6:eğer s%2==0 ise cift_toplam=cift_toplam + s
adım7:değilse tek_toplam=tek_tolam + s
adım8:s=s+1
adım9:bitir.
 */

/**
 *
 * @author asus
 */
import java.util.Scanner;

public class tekcifttop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bir n sayısı giriniz.");
        int n = input.nextInt();
        int tek_toplam = 0;
        int cift_toplam = 0;
        int S = 1;
        while (S <= n) {
            if (S % 2 == 0) {
                cift_toplam = cift_toplam + S;

            } else {
                tek_toplam = tek_toplam + S;
            }
            S = S + 1;
        }

        System.out.println("tek toplam:" + tek_toplam + "çift toplam" + cift_toplam);
    }

}
