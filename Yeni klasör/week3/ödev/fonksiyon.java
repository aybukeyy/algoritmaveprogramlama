/*Girilen x sayısına göre fonksiyonun aralığını bulan program.
adım1:başla
adım2:bir x sayısı al.
adım3:y=x^2-5*x+3
adım4:eğer y<0 ise -1 yazdır.
adım5:eğer y==0 ise 0 yazdır
adım6:eğer y>0 ise 1 yazdır.
adım7:bitir.
 */

/**
 *
 * @author asus
 */
import java.util.Scanner;
import java.lang.Math;

public class fonksiyon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bir x sayısı giriniz.");
        int x = input.nextInt();
        int y = x ^ 2 - 5 * x + 3;
        if (y < 0) {
            System.out.println(-1);

        } else if (y == 0) {
            System.out.println(0);

        } else if (y > 0) {
            System.out.println(1);

        }

    }

}
