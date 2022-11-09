/*girilen metreyi istenilen birime çeviren program.
adım1:başla
adım2:klavyeden metre cinsinden bir n uzunluğu al.
adım3:mm cm dm km seçtir.
adım4:eğer mm seçtiyse n*1000
adım5:eğer cm seçtiyse n*100
adım6:eğer dm setiyse n*10
adım7:eğer km seçtiyse n/1000
adım8:bitir.
 */

/**
 *
 * @author asus
 */
import java.util.Scanner;

public class uzunluk {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("metre cinsinden bir uzunluk giriniz.");
        double n = input.nextInt();
        System.out.println("çevirmek istediğin birimi seç.\n"
                + "1-km\n"
                + "2-dm\n"
                + "3-cm\n"
                + "4-mm");
        int secim = input.nextInt();
        if (secim == 1) {
            n = n / 1000;
            System.out.println(n);
        } else if (secim == 2) {
            n = n * 10;
            System.out.println(n);
        } else if (secim == 3) {
            n = n * 100;
            System.out.println(n);
        } else if (secim == 4) {
            n = n * 1000;
            System.out.println(n);
        }
    }

}
