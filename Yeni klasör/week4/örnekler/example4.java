/*
 adım1:başla
adım2:kullanıcıdan bir b sayısı alınız.
adım3:a=1 a<99 a++
adım4:b=a^3-a^2

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
        Scanner input= new Scanner(System.in);
        System.out.println("bir b sayısı giriniz.");
        int b=input.nextInt();
        
        for ( int a = 1; a < 100; a++) {
            if (b==a*a*a-a*a) {
                System.out.println("a sayısı: " + a);
            }
 
           
        }
        
    }
    
}
