/*
adım1:başla
adım2:klavyeden n sayısı al
adım3:tek toplam=0 çift toplam=0 s=1
adım4:eğer s>n ise adım8 e git.
adım5:eğer s%2==0 ise çift toplam= çift toplam+s
adım6:değilse tek toplam=tek toplam+0
adım7:s=s+1
adım8 çift ve tek toplam yazdır,
adım9:bitir.
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
        System.out.println("tek toplam:" + tek_toplam + "çift toplam" + cift_toplam );
    }

}
