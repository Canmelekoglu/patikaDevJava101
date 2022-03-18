/*
Java ile kullanıcıdan doğum tarihini alıp Çin Zodyağı değerini hesaplayan program yazınız.
 */
import java.util.Scanner;
public class CinZodyagiHesaplama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String burc = null;

        System.out.print("Doğum yılınız: ");
        int year = inp.nextInt();
        int zod = year%12;
        if (year>0) {
            switch (zod) {
                case 0 -> burc = "MAYMUN";
                case 1 -> burc = "HOROZ";
                case 2 -> burc = "KÖPEK";
                case 3 -> burc = "DOMUZ";
                case 4 -> burc = "FARE";
                case 5 -> burc = "ÖKÜZ";
                case 6 -> burc = "KAPLAN";
                case 7 -> burc = "TAVŞAN";
                case 8 -> burc = "EJDERHA";
                case 9 -> burc = "YILAN";
                case 10 -> burc = "AT";
                case 11 -> burc = "KOYUN";
            }
            System.out.println("Çin Zodyağı Burcunuz: " + burc);
        } else System.out.println("Hatalı değer ! ");
    }
}
