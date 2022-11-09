/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
import java.util.Scanner;
public class example1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("bir n sayısı giriniz.");
        int n=input.nextInt();
        int toplam=0;
        int S=1;
        while(S<=n){
            if (S%2!=0) {
                toplam=toplam+S;
                
            }
            S=S+1;
        }
        System.out.println("toplam" + toplam);
    }
        
    
}
