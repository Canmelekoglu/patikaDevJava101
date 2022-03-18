/*
Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. Kullanıcıdan Mesafe (KM), yaşı
ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın.
koşullara göre müşteriye indirimleri uygulayın
 */
import java.util.Scanner;
public class UcakBiletFiyati {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int age, typeTrip;  double km;
        double sale, price, perKm=0.10;
        String isError="false";

        System.out.print("Yaşınız: ");
        age = inp.nextInt();
        System.out.print("Gitmek istediğiniz mesafe(km): ");
        km = inp.nextDouble();
        System.out.print("Tek yön için 1 ; Gidiş-Dönüş için 2: ");
        typeTrip = inp.nextInt();
        price = km*perKm;

        if (km<=0 || age<=0) {
            isError = "true";
        } else if (age<=12) { //kullanıcı 12den küçükse %50 indirim
            price /= 2;
        } else if (age<=24) { //kullanıcı 12-24 arasındaysa %10 indirim
            sale = price*0.10;
            price -= sale;
        } else if (age>=65){ //kullanıcı 65ten büyükse %30 indirim
            sale = price*0.30;
            price -= sale;
        }
        if (isError.equals("true")){
            System.out.println("Hatalı değerler girdiniz. Kontrol ediniz..");
        } else {
            if (typeTrip==2) {   //kullanıcı gidiş-dönüş alıyorsa, ind.tutar üzerinden %20 indirim..
                sale = price*0.20;
                price -= sale;
                price *= 2;
                System.out.print("Bilet fiyatı "+price);
                System.out.println(" TL'dir.");
            } else if (typeTrip==1){
                System.out.print("Bilet fiyatı "+price);
                System.out.println(" TL'dir.");
            } else System.out.println("Hatalı değerler girdiniz. Kontrol ediniz..");
        }
    }
}