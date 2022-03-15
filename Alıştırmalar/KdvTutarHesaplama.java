/*
kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.
KDV %18
alıştırma: Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 ,
tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
 */

import java.util.Scanner;

public class KdvTutarHesaplama {
    public static void main (String[] args) {
        Scanner inp = new Scanner(System.in);
        double tutar, kdvOran ;
        System.out.print("Ürün tutarını giriniz: ");    //kullanıcıdan fiyat bilgisi alınır.
        tutar = inp.nextDouble();
        kdvOran = (tutar>=1000)? 0.08 : 0.18;           // KDV oranı fiyat bilgisine göre belirlenir.
        double kdv = tutar*kdvOran;                     // KDV tutarı hesaplanır.
        System.out.println("Ürünün KDV tutarı: " +kdv);
        double kdvliTutar = kdv + tutar;                // KDV'li tutar hesaplanır.
        System.out.println("Ürünün KDV'li tutarı: " +kdvliTutar);
    }
}
