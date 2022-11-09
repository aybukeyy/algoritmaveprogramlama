/*n sayısına kadar olan tek sayıların toplamını bulan program.
adım1:başla
adım2:kullanıcıdan bir n sayısı al
adım3: toplam = 0
adım4: S=1
adım5: eğer S>n ise adım9 a git
adım6:eğer S%2 !=0 ise toplam=toplam+S
adım7:s=s+1
adım8:adım 5 e git
adım8:toplamı yazdır
adım9:bitir
 */

/**
 *
 * @author asus
 */
import java.util.Scanner;

public class teksyıtoplam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("lütfen bir n sayısı giriniz: ");
        int n = input.nextInt();
        int toplam = 0;
        int S = 1;
        while (S <= n) {

            if (S % 2 != 0) {

                toplam = toplam + S;

            }
            S = S + 1;

        }
        System.out.println("toplam" + toplam);

    }

}
