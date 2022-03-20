/*
Java ile klavyeden girilen N tane sayma sayısından 
en büyük ve en küçük sayıları bulan ve bu sayıları ekrana yazan programı yazın.
 */
import java.util.Scanner;
public class MaxMinSayilar {
    public static void main (String[] args) {
        Scanner inp = new Scanner(System.in);
        int max=0, min=0;
        System.out.print("KAç adet sayı gireeceksiniz: ");
        int val = inp.nextInt();
        for (int i=1 ; i<=val ; i++) {
            System.out.print("Lütfen "+i+". sayıyı giriniz: ");
            int num = inp.nextInt();

            if (num > max ) {
                if (min==0) {
                    min=num;
                }
                max = num;
            }
            if (num < min) {
                if (max==0){
                    max=num;
                }
                min = num;
            }
        }
        System.out.println("En büyük sayi: "+max);
        System.out.println("En küçük sayı: "+min);
    }
}