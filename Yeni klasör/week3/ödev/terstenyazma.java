/*girilen sayıyı tersten yazan program.
adım1:başla.
adım2:pozitif bir n sayısı al.
adım3:n<=0 olduğunda adım6
adım4:n%10 yazdır.
adım5:n = n/10 
adım6:bitir.
 */

/**
 *
 * @author asus
 */
import java.util.Scanner;

public class terstenyazma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bir n sayısı giriniz.");
        int n = input.nextInt();

        while (n > 0) {
            System.out.print(n % 10);
            n = n / 10;
        }

    }
}
