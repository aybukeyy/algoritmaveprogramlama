/*Maddenin kütlesini yazdıran program.
 adım1:başla
adım2:kullanıcıdan maddenin molünü al
adım3:kullanıcıdan maddenin mol kütlesini al
adım4:kütle = mol kütlesi * mol 
adım5:maddenin kütlesini yazdır
adım6:bitir.
 */

/**
 *
 * @author asus
 */
import java.util.Scanner;

public class mol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("lütfen maddenin molünü giriniz :");
        double mol = input.nextInt();
        System.out.println("lütfen maddenin mol kütlesini giriniz :");
        int molkutlesi = input.nextInt();
        double kutle = (double) molkutlesi * mol;
        System.out.println("maddenin kutlesi :" + kutle);

    }

}
