/*
Switch case ile Basit hesap makinası programı
 */
import java.util.Scanner;
public class HesapMakinasi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("1.sayıyı giriniz: ");
        double a = inp.nextDouble();
        System.out.print("2.sayıyı giriniz: ");
        double b = inp.nextDouble();
        System.out.print("Yapmak istediğiniz işlemi seçiniz. \n1-Toplam \n2-Çıkarma \n3-Çarpma \n4-Bölme. \nNo:");
        int no = inp.nextInt();
        double sonuc = 0;

        switch (no) {
            case 1: sonuc += a+b;
                System.out.print("Sonuc: "+ sonuc);
                break;
            case 2: sonuc += a-b;
                System.out.print("Sonuc: "+ sonuc);
                break;
            case 3: sonuc += a*b;
                System.out.print("Sonuc: "+ sonuc);
                break;
            case 4:
                if (b!=0) {
                    sonuc += a/b;
                    System.out.print("Sonuc: "+ sonuc);
                }
                else {
                    System.out.println("Bir sayı 0'a bölünemez.");
                }
                break;
            default: System.out.print("Geçersiz bir seçim yaptınız.");
        }
    }
}
