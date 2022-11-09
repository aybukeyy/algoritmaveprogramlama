/*Girilen sayının pozitif mi negatif mi sıfır mı olduğunu bulan program.
 adım1:başla
adım2:bir sayı al.
adım3:eğer sayı>0 ise pozitiftir.
adım4:eğer sayı<0 ise negatifitr.
adım5:aksi takdirde sayı sıfırdır.
adım6:bitir.
 */

/**
 *
 * @author asus
 */
import java.util.Scanner;

public class isaret {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz.");
        int a = input.nextInt();
        if (a > 0) {
            System.out.println(a + "pozitiftir.");

        } else if (a < 0) {
            System.out.println(a + "negatiftir.");
        } else {
            System.out.println(a + "sıfırdır.");
        }
    }
}
