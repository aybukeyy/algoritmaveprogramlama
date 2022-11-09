/*Cismin kuvvetini hesaplayan program.
 adım1:başla
adım2:kullanıcıdan cismin kütlesini al
adım 3: kullanıcıdan cismin ivmesini al
adım 4:kuvvet = kütle * ivme 
adım5:kuvveti yazdır
adım6: bitir.
 */

/**
 *
 * @author asus
 */
import java.util.Scanner;

public class kuvvet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("lütfen cismin kütlesini giriniz :");
        int kutle = input.nextInt();
        System.out.println("lütfen cismin ivmesini giriniz :");
        int ivme = input.nextInt();
        int kuvvet = kutle * ivme;
        System.out.println("cismin kuvveti :" + kuvvet);

    }

}
