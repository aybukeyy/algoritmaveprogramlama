/*Kürenin hacmini ve alanını yazdıran program.
 adım1:başla
adım2:kullanıcıdan kürenin yarıçapını al
adım3:kürenin hacmi=(4*pi*yarıçap*yarıçap*yarıçap)/3
adım4:kürenin alanı= 4*pi*yarıçap*yarıçap
adım5:kürenin hacmini ve alanını yazdır.
adım6:bitir.
 */

/**
 *
 * @author asus
 */
import java.util.Scanner;

public class kure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen kürenin yarıçapını giriniz :");
        int yaricap = input.nextInt();
        double hacim = (double) (4 * yaricap * yaricap * yaricap) / 3;
        int alan = (4 * yaricap * yaricap);
        System.out.println("kürenin hacmi :" + hacim + "π" + "kürenin alanı :" + alan + "π");

    }

}
