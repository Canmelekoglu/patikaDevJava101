/*
JAVA ile yıldızlarla ters ucgen yapımı..
 */
import java.util.Scanner;
public class TersUcgen {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Basamak sayısını giriniz: ");
        int basNum = inp.nextInt();
        int t=1;
        for (int i = basNum ; i>0 ; i--) {
            for (int j=1 ; j<t ; j++ ) {
                System.out.print(" ");
            } t++;
            for (int k=1 ; k<=((2*i)- 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}