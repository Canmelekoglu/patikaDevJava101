/*
Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın.
Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
Kilo (kg) /( Boy(m) * Boy(m))
 */
import java.util.Scanner;

public class VucutKitleIndeksi {
    public static void main (String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Lütfen boyunuz metre cinsinden giriniz: ");
        double boy = inp.nextDouble();
        System.out.print("Lütfen kilonuzu kg cinsinden giriniz: ");
        double kg = inp.nextDouble();
        double vucutKitleIndeks = kg / (boy*boy);
        System.out.print("Vücut Kitle Indexiniz: "+vucutKitleIndeks);
    }
}
