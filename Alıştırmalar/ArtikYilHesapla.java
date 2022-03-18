/*
Java ile kullanıcının girdiği yılın artık olup olmadığını bulan program. Artık yıl
belirli koşullara göre hesaplanır.
++artık yıllar 4 rakamının katı olan yıllardır.
+++100'ün katı olan yıllardan sadece 400'e kalansız olarak bölünebilenler artık yıldır..
 */
import java.util.Scanner;

public class ArtikYilHesapla {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year ;
        double  leap;
        String isError="false";

        System.out.print("Yıl giriniz: ");
        year = in.nextInt();
        leap = year%4;

        if(leap==0) {
            if (year%100==0) {
                if (year%400==0) {
                    isError="false";
                }
                else isError="true";
            }
        }
        else isError="true";

        if (isError.equals("true")) {
            System.out.println(year+" yılı artık yıl değildir!");
        }
        else System.out.println(year+" yılı artık yıldır.");
    }
}