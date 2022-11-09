
import java.util.Scanner;

public class ucvebeskat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        do{
        System.out.println("yediden büyük pozitif bir tam sayı giriniz");
         n = input.nextInt();
        
        }
        while(n<=7);
          for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (n == 3 * i + 5 * j) {
                    System.out.println(n + " sayısı " + i + " sayısının 3 katı ve  " + j + " sayısının 5 katı şeklidne yazılabilir");
                }

            }

        }

        // TODO code application logic here
    }

}
