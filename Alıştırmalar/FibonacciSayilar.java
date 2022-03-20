/*
Java döngüler ile fibonacci serisi bulan program yazıyoruz. Fibonacci serisinin eleman sayısını kullanıcıdan alın.
 */
import java.util.Scanner;
public class FibonacciSayilar {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);

        System.out.print("Eleman sayısını giriniz: ");
        int elNum = inp.nextInt();

        int before=0, after=1 , sum=0;
        for (int i=0; i<=elNum ; i++){
            System.out.print(" "+before);
            sum=before+after;
            before=after;
            after=sum;
        }
    }
}