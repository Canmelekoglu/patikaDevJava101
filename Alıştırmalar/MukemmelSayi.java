/*
Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını bulan program.
 */
import java.util.Scanner;
public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int sum = 0;
        int num;
        do {
            System.out.print("Kontrol edilmesini istediğiniz sayı: ");
            num = inp.nextInt();
            if (num==0) break;  // 0 çıkış tuşu olarak kullanıldı.
            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    sum += i;
                }
            }
            System.out.println(num+sum);
            if (num == sum) {
                System.out.println(num + " mükemmel sayıdır.");
            } else {
                System.out.println(num + " mükemmel sayı değildir.");
            }
            sum = 0;
        } while (num>0); //0dan küçük sayı girene kadar sorgu yapılır.
    }
}