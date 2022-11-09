/*

 */

/**
 *
 * @author asus
 */
import java.util.Scanner;

public class example5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("lüten alt sayıyı yazımız.");
        int alt_sinir = input.nextInt();
        System.out.println("lüten üst sayıyı yazımız.");
        int üst_sinir = input.nextInt();
        for (int i = alt_sinir; i < üst_sinir; i++) {
            if (i % 3 == 0 || i % 4 == 0) {
                System.out.println(i);

            }
        }

    }

}
