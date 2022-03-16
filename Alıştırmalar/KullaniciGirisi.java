/* Kullanıcı girişi yapılan bir porgram...
Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve
unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip ,
şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz."
sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
 */
import java.util.Scanner;
public class KullaniciGirisi {
    public static void main (String[] args) {
        Scanner inp = new Scanner(System.in);
        String newPassword;
        System.out.print("Kullanıcı adı: ");
        String userName = inp.nextLine();
        System.out.print("Şifre: ");
        String password = inp.nextLine();    //kullanıcıdan bilgiler alınır. kontrol edilir.

        if (userName.equals("admin") && password.equals("java")) {
            System.out.print("Giriş Başarılı...");
        }
        else if ( !(userName.equals("admin")) && password.equals("java")) {
            System.out.print("Kullanıcı adınız hatalı !");
        }
        else if (userName.equals("admin") && !(password.equals("java"))) {
            System.out.println("Şifre yanlış!! Şifre değiştirmek (1) \n Cıkış(2)");
            int a = inp.nextInt();

            switch (a) {
                case 1:
                    System.out.print("Yeni şifre: "+inp.nextLine());
                    newPassword = inp.nextLine();
                    if (newPassword.equals("java")) {
                        System.out.print("Yeni şifre ile eski şifre aynı olamaz, lütfen başka şifre giriniz!");
                    }
                    else {
                        System.out.print("Şifre oluşturuldu...");
                    }
                    break;
                case 2:
                    System.out.print("Bilgileri kontrol ediniz...");
                    break;
                default:
                    System.out.print("Hatalı işlem...");
                    break;
            }
        }
        else {
            System.out.print("Bilgileri kontrol ediniz...");
        }
    }
}