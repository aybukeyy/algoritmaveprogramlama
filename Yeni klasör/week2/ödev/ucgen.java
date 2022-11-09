/*Kenarları girilen üçgenin eş mi ikiz mi çeşitkenar mı olduğunu söyleyen program.
 adım1:başla
adım2:kullanıcıdan üçgenin üç kenarını al.
adım3:eğer kenar1==kenar2 ve kenar1!=kenar3 ise ikizkenardır
adım4:eğer kenar1==kenar3 ve kenar1!=kenar2 ise ikizkenarıdr
adım5:eğer kenar2==kenar3 ve kenar2!=kenar1 ise ikizkenardır
adım6:eğer kenar1!=kenar2!=kenar3 ise çeşitkenardır.
adım7:eğer kenar1==kenar2==kenar3 ise eşitkenardır
adım8:bitir
 */

/**
 *
 * @author asus
 */
import java.util.Scanner;

public class ucgen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("üçgenin 1. kenarını giriniz.");
        int kenar1 = input.nextInt();
        System.out.println("üçgenin 2. kenarını giriniz.");
        int kenar2 = input.nextInt();
        System.out.println("üçgenin 3. kenarını giriniz.");
        int kenar3 = input.nextInt();
        if (kenar1 == kenar2 && kenar1 == kenar3) {
            System.out.println("üçgen eşkenardır");

        } else if (kenar1 != kenar2 && kenar3 != kenar2 && kenar1 != kenar3) {

            System.out.println("üçgen çeşitkenardır");
        } else if (kenar1 == kenar2 && kenar1 != kenar3 && kenar2 != kenar3) {
            System.out.println("üçgen ikizkenardır");

        } else if (kenar1 == kenar3 && kenar1 != kenar2 && kenar2 != kenar3) {
            System.out.println("üçgen ikizkenardır");

        } else if (kenar2 == kenar3 && kenar2 != kenar1 && kenar3 != kenar1) {
            System.out.println("üçgen ikizkenardır");
        }
    }

}
