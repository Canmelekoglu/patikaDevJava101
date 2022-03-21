/*
Java dilinde, taban ve üs değerleri kullanıcıdan alınan üs alma işlemini
"Recursive" metot kullanarak yapan programı yazınız.
 */

import java.util.Scanner;
public class UsluSayiRec {
    static int usAlma(int n1,int n2) {
        if (n1==0) {
            return 0;
        } else if (n2==0 || n1==1) {
            return 1;
        } else if (n2==1) {
            return n1;
        } else {
            int result;
            result = usAlma(n1,n2-1)*n1;

            return result;
        }

    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Taban değeri: ");
        int a = in.nextInt();
        System.out.print("Üs değeri: ");
        int b = in.nextInt();

        System.out.println("Sonuç: "+ usAlma(a,b));
    }
}
