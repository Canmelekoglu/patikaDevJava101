/*
Java dilinde kullanıcıdan alınan değere göre aşağıdaki kurala uyan döngü kullanmadan bir "Recursive" metot yazın.
  Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın. Her çıkarma işlemi
  sırasında ekrana son değeri yazdırın. Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin. Yine her ekleme
  işleminde sayının son değerini ekrana yazdırın.
 */
import java.util.Scanner;
public class DesenOlusturmaRec {
    static void pattern(int num) {
        if (num <= 0) {
            System.out.print(num + " ");
            return;
        }
        System.out.print(num + " ");
        pattern(num - 5);
        System.out.print(num + " ");
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int patternNum;

        System.out.print("Enter a number to create pattern: ");
        patternNum = scan.nextInt();
        pattern(patternNum);
    }
}