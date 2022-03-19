/*
Java ile iki sayının EBOB ve EKOK değerlerini "While Döngüsü" kullanarak yazınız.
 */
import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("1.sayıyı giriniz : ");
        int num1 = inp.nextInt();
        System.out.print("2. sayıyı giriniz : ");
        int num2 = inp.nextInt();
        int ebob = 0,ekok = 0;
        int k=num1;
        int i =1;
        while (k>=1) {
            if(num1%k==0 && num2%k==0) {
                ebob = k;
                break;
            }
            k--;
        }
        System.out.println("Sayıların EBOB'u: "+ebob);
        while (i<=(num1*num2)) {
            if (i%num1==0 && i%num2==0) {
                ekok = i;
                break;
            }
            i++;
        }
        System.out.println("Sayıların EKOK'u: "+ekok);
    }
}
