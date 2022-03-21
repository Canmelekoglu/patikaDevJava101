/*
Java ile bir sayının "Palindrom Sayı" olup olmadığını metotları kullanrak bulan program.
Palindrom sayı: ki taraftan okunduğu zaman okunuş yönüyle aynı olan sayılardır.(99,11,101,8)
 */
import java.util.Scanner;
public class PalindromSayi {

    static boolean palindrom(int n){
        int temp , reverseNum=0, newNum;
        temp=n;
        while(temp!=0) {
            newNum = temp%10;
            reverseNum=(reverseNum*10)+newNum;
            temp/=10;
        }
        return reverseNum == n;
    }

    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = inp.nextInt();
        if (palindrom(num)) {
            System.out.println(num+" palindrom sayıdır.");
        }
        else {
            System.out.println(num+" poindrom sayı değildir.");
        }
    }
}