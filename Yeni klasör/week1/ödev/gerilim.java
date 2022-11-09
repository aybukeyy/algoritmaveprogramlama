/*İletkenin gerilimini bulan program.
adım1:başla
adım2:kullanıcıdan iletkenin direncini al.
adım3:kullancıdan iletkenin akımını al.
adım4:iletkenin gerilimi= akım* direnç
adım5:gerilimi yazdır.
adım6:bitir.
 */

/**
 *
 * @author asus
 */
import java.util.Scanner;

public class gerilim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen iletkenin direncini giriniz :");
        int direnc = input.nextInt();
        System.out.println("lütfen iletkenin akımını giriniz :");
        int akim = input.nextInt();
        int gerilim = akim * direnc;
        System.out.println("iletkenin gerilimi :" + gerilim);

    }

}
