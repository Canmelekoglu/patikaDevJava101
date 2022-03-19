// Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.
import java.util.Scanner;
public class BasamakSayilarininToplami {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Sayi giriniz: ");
        int number = input.nextInt();
        int total = 0;

       if (number<0) {
            number *= -1;
        }
        while(number!=0) {
            int rakam=number%10;
            total=rakam+total;
            number=number/10;
        }
        System.out.println("Rakamlar toplamı: "+total);
    }
}
