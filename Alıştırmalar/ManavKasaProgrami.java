/*
Manav Kasa Programı
Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine
göre toplam tutarını ekrana yazdıran programı yazın.
Meyveler ve KG Fiyatları
Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL
 */
import java.util.Scanner ;
public class ManavKasaProgrami {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Armut kilo: ");
        // kullanıcıdan kg bilgisi alınır.
        double armt = inp.nextDouble();
        System.out.print("Elma kilo: ");
        double elma = inp.nextDouble();
        System.out.print("Muz kilo: ");
        double muz = inp.nextDouble();
        System.out.print("Domates kilo: ");
        double dom = inp.nextDouble();
        System.out.print("Patlican kilo: ");
        double patl = inp.nextDouble();
        // kg bilgisi alınan ürünlerin fiyatları hesaplanır.
        double armtKilo = armt*2.14;
        double elmaKilo = elma*3.67;
        double muzKilo = muz*0.95;
        double domKilo = dom*1.11;
        double patlKilo = patl*5.00;
        double topTutar = armtKilo+elmaKilo+muzKilo+domKilo+patlKilo; // toplam tutar belirlenir.
        System.out.print("Toplam tutar: "+topTutar);
    }
}
