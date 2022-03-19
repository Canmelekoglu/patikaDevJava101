/*
Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.
 */
import java.util.Scanner;
public class UsluSayiHesapla {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int total=1;
        System.out.print("Üssü alınacak sayı: ");
        int a = inp.nextInt();
        System.out.print("Üs olacak sayı: ");
        int b = inp.nextInt();

        for (int i = 1 ; i<=b ; i++) {
            total *= a;
        }
        System.out.println(a+" sayısının "+b+" üssü : "+total);
    }
}
