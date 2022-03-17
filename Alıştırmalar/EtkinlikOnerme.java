/*
Havanın derecesine basit bi etkinlik önerme pogramı.. 
 */
import java.util.Scanner;
public class EtkinlikOnerme {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double heat;

        System.out.print("Sıcaklık değerini giriniz: ");
        heat = inp.nextDouble();

        if (heat<=5) {
            System.out.println("Hava kayak yapmaya uygun..");
        } else if (heat>5 && heat<=15) {
            System.out.println("Dışarda tam arkadaşlarla sinema havası var..:)");
        } else if (heat>15 && heat<25) {
            System.out.println("Neden bu güzel havada piknik yapmıyorsun?");
        } else {
            System.out.println("Hava çok sıcak.. Bi yüzmeye mi gitsen ?? ");
        }

    }
}
