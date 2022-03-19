/*
Java ile girilen sayının harmonik serisini bulan program yazacağız.
*/
import java.util.Scanner;

public class HarmonikSeri {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("HArmonik seri için bir sayı giriniz: ");
        int n = inp.nextInt();
        double result = 0;

        for (double i=1 ; i<=n ; i++) {
            result += (1/i);
        }
        System.out.println(n+ " sayısının harmonik seri toplamı: "+result);
    }
}
