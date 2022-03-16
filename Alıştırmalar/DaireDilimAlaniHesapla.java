/*
Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
𝜋 sayısını = 3.14 alınız.
Formül : (𝜋 * (r*r) * 𝛼) / 360
 */
import java.util.Scanner;

public class DaireDilimAlaniHesapla {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Daire yarıçapı: ");
        int r = input.nextInt();
        double pi = 3.14;
        System.out.print("Hesaplamak istediğiniz açıyı girin: ");
        double a = input.nextDouble();
        double alan = pi*(r*r)*a /360;
        System.out.print("Daire diliminin alanı: "+alan);
    }
}
