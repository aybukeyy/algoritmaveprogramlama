/*




*/
import java.util.Scanner;

public class Example3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // TODO code application logic here
        System.out.println("Lütfen birinci sayı :");
        int a = input.nextInt();
        System.out.println("Lütfen ikinci sayı :");
        int b = input.nextInt();
        System.out.println("Lütfen üçüncü sayı :");
        int c = input.nextInt();
        int toplam = a + b + c;
        int carpim = a * b * c;
        double ort = (double) toplam / 3;
        System.out.println("ortalama: " + ort + " , Toplam: " + toplam + "ve Çarpım: " + carpim);

    }

}
