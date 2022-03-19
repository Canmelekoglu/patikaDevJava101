/*
Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden
çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
 */
import java.util.Scanner;

public class DordunKatlariToplami {
    public static void main (String[] args) {
        Scanner inp = new Scanner(System.in);
        int n, sum=0;
        do {
            System.out.print("Sayı giriniz: ");
            n = inp.nextInt();
            if (n%4==0) {
                sum+=n;
            }

        } while (n%2==0);
        System.out.println("Çift ve 4'ün katları olan sayıların toplamı: "+sum);
    }
}