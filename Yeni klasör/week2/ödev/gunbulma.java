/*1 ve 7 arasında girilen sayının haftanın hangi gün olduğunu söyleyen program.
 adım1:başla
adım2:klavyeden 1 ve 7 arasında bir sayı al.
adım3:eğer sayı 1 ise pazartesi yazdır
adım4:eğer sayı 2 ise salı yazdır.
adım5:eğer sayı 3 ise çarşamba yazdır.
adım6:eğer sayı 4 ise perşembe yazdır.
adım7:eğer sayı 5 ise cuma yazdır.
adım8:eğer sayı 6 ise cumartesi yazdır.
adım9:aksi takdirde pazar yazdır.
 */

/**
 *
 * @author asus
 */
import java.util.Scanner;

public class gunbulma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("lütfen 1 ve 7 arasında bir sayı giriniz.");
        int sayi = input.nextInt();

        if (sayi == 1) {
            System.out.println("pazartesi.");

        } else if (sayi == 2) {
            System.out.println("salı.");
        } else if (sayi == 3) {

            System.out.println("çarşamba.");
        } else if (sayi == 4) {
            System.out.println("perşembe");

        } else if (sayi == 5) {
            System.out.println("cuma.");

        } else if (sayi == 6) {

            System.out.println("cumartesi.");
        } else if (sayi == 7) {
            System.out.println("pazar.");

        }

    }

}
