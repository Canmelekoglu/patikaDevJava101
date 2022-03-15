/*
Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan
alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.Koşullu ifadeler kullanılarak,
eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.
Not : If ve Else kullanılmayacak
 */
import java.util.Scanner;

public class NotOrtalamasiHesaplama {
    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,tarih,muzik ; //değişkenler tanımlandı.
        Scanner inp = new Scanner(System.in);

        //kullanıcıdan degerleri alma vakti
        System.out.print("Matematik notunuzu girin: ");
        mat = inp.nextInt();
        System.out.print("Fizik notunuzu girin: ");
        fizik = inp.nextInt();
        System.out.print("Kimya notunuzu girin: ");
        kimya = inp.nextInt();
        System.out.print("Türkçe notunuzu girin: ");
        turkce = inp.nextInt();
        System.out.print("Tarih notunuzu girin: ");
        tarih = inp.nextInt();
        System.out.print("Müzik notunuzu girin: ");
        muzik = inp.nextInt();
        // Ortalamayı hesaplayalım.
        int toplam = mat+fizik+kimya+turkce+tarih+muzik;
        double ortalama= toplam/6.0 ;
        System.out.println("Ortalamanız: " +ortalama );

        // Sınıfı geçti mi ? Kaldı mı ?

        String durum = (ortalama>60)? "Sınıfı geçtiniz." : "Sınıfta kaldınız";
        System.out.println(durum);
    }
}
