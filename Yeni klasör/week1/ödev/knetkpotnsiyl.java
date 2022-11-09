/*Kinetik enerji ve potansiyel enerjiyi hesaplayan program
 adım1:başla
adım2:kullanıcıdan cismin kütlesini al
adım3:kullanıcıdan cismin hızını al.
adım4:kullanıcıdan cismin yerden yüksekliğini al.
adım5:kinetik enerji= (1/2)*kütle*(hız^2)
adım6:potansiyel enerji = kütle*yer çekim ivmesi*yükseklik
adım7:kinetik enerjiyi ve ptansiyel enerjiyi yazdır
adım8:bitir.

 */

import java.util.Scanner;

public class knetkpotnsiyl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen cismin kütlesini giriniz :");
        int kutle = input.nextInt();
        System.out.println("Lütfen cismin yerden yüksekliğini giriniz :");
        int yukseklik = input.nextInt();
        System.out.println("Lütfen cismin hızını giriniz :");
        int hiz = input.nextInt();
        int ke = (kutle / 2) * (hiz * hiz);
        System.out.println("Lütfen yerçekim ivmesini giriniz :");
        int ivme = input.nextInt();
        int pe = kutle * ivme * yukseklik;
        System.out.println("cismin kinetik enerjisi :" + ke + "cismin potansiyel enerjisi :" + pe);

        
    }

}
