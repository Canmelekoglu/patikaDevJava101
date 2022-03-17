/*
Java ile girilen 3 sayıyı küçükten büyüğe doğru eşitlikleri kontrol edilerek sıralama.. 
 */
import java.util.Scanner;
public class SayiSiralama {
    public static void main(String[] args) {
        int a,b,c;
        Scanner inp = new Scanner(System.in);
        System.out.print("1. tam sayı değerini giriniz: ");
        a = inp.nextInt();
        System.out.print("2. tam sayı değerini giriniz: ");
        b = inp.nextInt();
        System.out.print("3. tam sayı değerini giriniz: ");
        c= inp.nextInt();

        if (a<b && a<c) {
            if (b<c) {
                System.out.println("a < b < c");
            } else if (c<b) {
                System.out.println("a < c < b ");
            } else {
                System.out.println("a < b = c ");
            }
        } else if (b<a && b<c) {
            if (a<c) {
                System.out.println("b < a < c");
            } else if (c<a) {
                System.out.println("b < c < a ");
            } else {
                System.out.println("b < a = c ");
            }

        } else if (c<a && c<b) {
            if (a < b) {
                System.out.println("c < a < b");
            } else if (b < a) {
                System.out.println("c < b < a ");
            } else {
                System.out.println("c < a = b ");
            }

        } else if(a==b && a<c){
            System.out.println("a=b<c");

        } else if (b==c && b<a){
            System.out.println("b=c<a");

        } else if (a<b){
            System.out.println("a=c<b");

        } else{
            System.out.println("a=b=c");
        }

    }
}