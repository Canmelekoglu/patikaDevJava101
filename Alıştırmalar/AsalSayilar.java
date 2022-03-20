/*
Java ile 1 - 100 arasındaki asal sayıları ekrana yazdıran programı yazınız.
 */
public class AsalSayilar {
    public static void main(String[] args) {
        int boun=100;
        int i;
        int sum=0;
        for (i=2; i<=boun; i++ ) {
            for (int j=2 ; j<=i ; j++){
                if (i%j==0) {
                    sum+=j;
                }
            }
            if (sum == i) {
                System.out.print(" "+i);
            }
            sum = 0;
        }
    }
}