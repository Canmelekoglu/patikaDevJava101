/*
Java dilinde "Recursive" metot kullanarak, kullanıcıdan alınan sayının
"Asal" sayı olup olmadığını bulan programı yazın.
 */
import java.util.Scanner;
public class AsalSayiRecMetot {
    static boolean asalSayi(int n1,int i) {
        if (n1==0 || n1==1) {
            return false;
        }
        else if (n1==2) {
            return true;
        }
        else {
            if (n1%i==0) {
                return false;
            }
            else if (i*i>n1) {
                return true;
            }
        }
        return asalSayi(n1,i+1);
    }

    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int num = scan.nextInt();
        if (asalSayi(num,2)) {
            System.out.println(num+" asal sayıdır.");
        } else System.out.println(num+" asal sayı değildir");
    }
}
