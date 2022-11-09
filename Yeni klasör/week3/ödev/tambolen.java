/*girilen sayının pozitif tam bölenlerini bulan program.
adım1:başla
adım2:pozitif bir n sayısı al.
adım3:i>n olursa adım5  git
adım4:eğer n%i==0 ise i yazdır
adım5:bitir

 */

/**
 *
 * @author asus
 */
import java.util.Scanner;

public class tambolen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bir n sayısı giriniz.");
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println("tam sayı bölenleri");
                System.out.println(i);
            }

        }

    }

}
