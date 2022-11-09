/*
adım1:başla
adım2:sayı gir.
adım3:
 */

/**
 *
 * @author asus
 */
import java.util.Scanner;
public class example7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input= new Scanner(System.in);
        System.out.println("bir sayı giriniz.");
         int n = input.nextInt();
         boolean asalmi=true; //varsayım
         for (int i = 2; i < n ; i++) {
             if(n%i==0){
                 asalmi=false;
             }
            
        }
         if (asalmi=true && n!=1) {
             System.out.println("sayı asaldır.");
            
        }
         else{
              System.out.println("sayı asal değilidir.");
             
         }
        
    }
    
}
