/*
Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların
ortalamasını hesaplayan programı yazınız. */
import java.util.Scanner;

public class DongulerSayiOrtalamasi {
    public static void main (String[] args) {
        Scanner inp = new Scanner(System.in);
        double sum = 0, result;
        int counter=0;
        System.out.print("HAngi sayıya kadar işlem yapmak istiyorsanız giriniz: ");
        int k = inp.nextInt();

        for (int i=1 ; i<=k ; i++) {
            if (i%3==0 && i%4==0) {
                sum += i;
                counter++;
            }
        }
        result = sum/counter;
        System.out.println("3 ve 4'e bölünen sayıların ortalaması: "+result);
    }
}