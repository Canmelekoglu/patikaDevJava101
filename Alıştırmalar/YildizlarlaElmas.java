/*
Yıldızlar Elmas yapımı
 */
import java.util.Scanner;
public class YildizlarlaElmas {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int number = inp.nextInt();
        number /= 2;
        number++;

        for(int i = 0; i< number; i++){

            for(int j = number; j> (i+1); j--)
                System.out.print(" ");

            for(int k = 0; k< (i*2)+1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        int t = 1;
        for(int i = number -1; i> 0; i--){

            for(int j = 0; j< t; j++)
                System.out.print(" ");
            t++;

            for(int k=0; k< (i*2)-1; k++)
                System.out.print("*");
            System.out.println();
        }
    }
}