/*
adım1:başla
adım2:S=1;
adım3:S>99,adım7 ye git.
adım4:eğer S%5==0 ise S yazdır.
adım5:S=S+1
adım6:adım3 e git
adım7: bitir.
 */

/**
 *
 * @author asus
 */
import java.util.Scanner;

public class example4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new java.util.Scanner(System.in);

        for (int S = 1; S < 99; S++) {
            if (S % 5 == 0) {
                System.out.println(S);

            }
        }
    }

}
