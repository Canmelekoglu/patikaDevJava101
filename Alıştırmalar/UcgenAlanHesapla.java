/*
Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.
Formül;  u = (a+b+c)/2
alan^2 = u*(u-a)*(u-b)*(u-c)
 */
import java.util.Scanner;

public class UcgenAlanHesapla {
public static void main (String[] args) {
    Scanner inp = new Scanner(System.in);
    System.out.print("Üçgen 1. kenar uzunluğunu giriniz: ");  //kullanıcıdan dik kenarların uzunlugu alınır
    int  a = inp.nextInt();
    System.out.print("Üçgen 2. kenar uzunluğunu giriniz: ");
    int  b = inp.nextInt();
    System.out.print("Üçgen 3. kenar uzunluğunu giriniz: ");
    int c = inp.nextInt();
    int u =  (a+b+c)/2;
    double alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
    System.out.print("Üçgenin alanı: "+ alan);
}
}