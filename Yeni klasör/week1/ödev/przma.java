/*Prizmanın yüzey alanını hesaplayan program.
 adım1:başla
adım2:kullanıcıdan prizmanın taban alanıı alınız.
adım3:kullanıcıdan prizanın yanal alanını alınız
adım4: yüzey alanı = (2*taban alanı)+ yanal alanı
adım5 : yüzey alanını yazdır
adım6: bitir
 */

/**
 *
 * @author asus
 */
import java.util.Scanner;

public class przma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("lütfen prizmanın taban alanını giriniz :");
        int tabanalani = input.nextInt();
        System.out.println("lütfen prizmanın yanal alanını giriniz :");
        int yanalalani = input.nextInt();
        int yuzeyalani = (2 * tabanalani) + yanalalani;
        System.out.println("yüzey alanı :" + yuzeyalani);

    }

}
