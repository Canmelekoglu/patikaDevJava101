/*
Basit bir sınıfı geçme durumu programı. Var olan derslerin notu istenir ve ortalama hesaplanır. Geçme notu:55..
Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.
 */
import java.util.Scanner;
public class SinifiGecmeDurumu {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        double mat,fizik,turk,kimya,muzik;
        double totalPuan=0.0;
        int totDers=0;

        System.out.print("Matematik notunuzu giriniz: ");
        mat = inp.nextDouble();
        if (mat>=0 && mat<=100) {
            totalPuan += mat;
            totDers += 1;
        }
        System.out.print("Fizik notunuzu giriniz: ");
        fizik = inp.nextDouble();
        if (fizik>=0 && fizik<=100) {
            totalPuan += fizik;
            totDers += 1;
        }
        System.out.print("Türkçe notunuzu giriniz: ");
        turk = inp.nextDouble();
        if (turk>=0 && turk<=100) {
            totalPuan += turk;
            totDers += 1;
        }
        System.out.print("Kimya notunuzu giriniz: ");
        kimya = inp.nextDouble();
        if (kimya>=0 && kimya<=100) {
            totalPuan += kimya;
            totDers += 1;
        }
        System.out.print("Müzik notunuzu giriniz: ");
        muzik = inp.nextDouble();
        if (muzik>=0 && muzik<=100) {
            totalPuan += muzik;
            totDers += 1;
        }
        double ortalama = totalPuan / totDers;
        System.out.print("Notunuz: "+ortalama);
        if (ortalama>=55) {
            System.out.print(" **Sınıfta geçtiniz!**");
        } else if (ortalama<55) {
            System.out.print(" **Sınıfta kaldınız!..**");
        }
        else {         //eğer tüm değerler 0dan küçük veya 100den büyükse değerler geçersizdir..
            System.out.print(" **Değerler geçersiz olabilir...**");
        }
    }
}
