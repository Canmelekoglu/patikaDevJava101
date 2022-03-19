/*
Java ile kombinasyon hesaplayan program yazınız.
 */
import java.util.Scanner;
public class KombinasyonBulma {
    public  static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int facN=1, facR =1, facB =1;
        double comb;

        System.out.print("1.sayıyı giriniz: ");
        int n= inp.nextInt();
        System.out.print("2.sayıyı giriniz: ");
        int r= inp.nextInt();
        int b = n-r;

        //C(n,r) = n! / (r! * (n-r)!)

        for (int i=1 ; i<=n ; i++) {
            facN *= i;
        }
        for (int j=1 ; j<=r ; j++) {
            facR *= j;
        }
        for (int k=1 ; k<=b ; k++) {
            facB *= k;
        }
        comb = facN / (facR*facB);

        System.out.println(n+" sayısının "+r+"li kombinasyonu  "+comb);
    }
}