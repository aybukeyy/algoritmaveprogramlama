/*n e kadar olan sayıların karelerinin toplamını hesaplayan program.
 adım1:başla
adım2:klavyeden bir n sayısı al.
adım3:toplam=0
adım4: S=1
adım5: eğer S>n ise adım9 a git
adım6:S=S+1
adım7: toplam= toplam + S^2
adım8:adım 5 git
adım9:toplamı yazdır.
adım10:bitir.
 */

/**
 *
 * @author asus
 */
import java.util.Scanner;

public class karetoplam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("lütfen bir n sayısı giriniiz.");
        int n = input.nextInt();
        int toplam = 0;
        int S = 1;
        while (S <= n) {

            toplam = toplam + S * S;
            S = S + 1;

        }
        System.out.println("karelerinin toplamı: " + toplam);

    }

}
