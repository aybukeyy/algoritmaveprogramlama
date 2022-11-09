/*Girilen dereceyi radyana çeviren program.
 adım1:başla
adım2:kullancıdan açının derecesini al.
adım3:dereceyi radyana çevir. (derece * pi)/180
adım4:radyanı yazdır.
adım5:bitir.
 */

/**
 *
 * @author asus
 */
import java.util.Scanner;

public class radyan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen açının derecesini yazınız :");
        int derece = input.nextInt();
        double radyan = (double) (derece / 180);
        System.out.println("radyanı :" + radyan + "pi");

    }

}
