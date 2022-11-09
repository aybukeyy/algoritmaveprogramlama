/*
adım1:başla.
adım2:vize ve final notlarını kullanıcıdan al.(0 ve 100 arasında olmalı).
adım3:ortalama=(vize*0.4)+(final*0.6)
adım4:eğer ortalama 80-100 arasında ise A yazdır.
adım5:eğer ortalama 79-60 arasında ise B yazdır.
adım6:eğer ortalama 59-50 arasında ise C yazdır.
adım7:eğer ortalama 0-49 arasında ise D yazdır.
adım8:bitir.
 */

/**
 *
 * @author asus
 */
import java.util.Scanner;

public class example3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int vize;
        int finall;
        do {
            System.out.println("lütfen vize notunuzu giriniz.");
            vize = input.nextInt();
            System.out.println("lütfen final notunuzu giirniz.");
            finall = input.nextInt();
        } while ((vize < 0 || vize > 100) || (finall < 0 || finall > 100));
        double ortalama = (double) vize * 0.4 + finall * 0.6;
        if (ortalama >= 80 && ortalama <= 100) {
            System.out.println("ortalamanız: " + ortalama + "harf notunuz:A");

        } else if (ortalama <= 79 && ortalama >= 60) {
            System.out.println("ortalamanız: " + ortalama + "harf notunuz:B");

        } else if (ortalama <= 59 && ortalama >= 50) {
            System.out.println("ortalamanız:" + ortalama + "harf notunuz:C");
        } else if (ortalama <= 49 && ortalama >= 0) {
            System.out.println("ortalamanız: " + ortalama + "harf notunuZ:D");
        }
    }

}
