/*Üçgenin alanını bulduran program.
adım1: başla
adım2:kullanıcıdan kenar uzunluğu al.
adım3:girilen kenara ait yüksekliği gir.
adım4:üçgenin alanı = (kenar*yükseklik)/2
adım5:üçgenin alanını yazdır.
adım6:bitir.
 */

import java.util.Scanner;

public class ucgenalanı {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen üçgenin kenar uzunluğunu giriniz :");
        int kenar = input.nextInt();
        System.out.println("Lütfen girilen kenara ait yüksekliği giriniz :");
        int yukseklik = input.nextInt();
        int carpim = kenar * yukseklik;
        double alan = (double) carpim / 2;
        System.out.println("üçgenin alanı: " + alan);

    }

}
