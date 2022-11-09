/*
 adım1:başla
adım2:bir n sayısı al
adım3faktoriyel=1, S=1
adım4:eğer s>n ise adım 8 e git.
adım5:faktoriyel=faktoriyel*S
adım6:S=S+1
adım7:adım4 e git
adım8:faktoriyel yazdır.
adım9:bitir
 */

/**
 *
 * @author asus
 */
import java.util.Scanner;
public class example3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bir n sayısı giriniz.");
        int n = input.nextInt();
        int faktoriyel=1;
        int S=1;
        while(S<=n){
            faktoriyel *= S; //faktoriyel=faktoriyel*s;
            S += 1; 
        }
       System.out.println("faktoriyel " +  faktoriyel);
    }
    
}
