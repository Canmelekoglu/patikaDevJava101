/*
ATM'deki basit işlemleri yapabileceğimiz program..
 */
import java.util.Scanner;

public class AtmIslemleri {
    public static void main(String[] args) {
        String userName, password;
        Scanner inp = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;
        int price;
        while (right > 0) {
            System.out.print("Kullanıcı Adı :");
            userName = inp.nextLine();
            System.out.print("Parola : ");
            password = inp.nextLine();

            if (userName.equals("usrcan") && password.equals("dev123")) {
                System.out.println("Merhaba, CAN Bankasına Hoşgeldiniz!");
                do {
                    System.out.println("""
                            1-Para yatırma
                            2-Para Çekme
                            3-Bakiye Sorgula
                            4-Çıkış Yap""");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = inp.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Yatırılacak Para miktarı : ");
                            price = inp.nextInt();
                            balance += price;
                            System.out.println("Yeni Bakiye : " + balance); break;

                        case 2:
                            System.out.print("Para miktarı : ");
                            price = inp.nextInt();
                            if (price > balance) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                balance -= price;
                            }
                            System.out.println("Yeni Bakiye : " + balance);
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                        case 4:
                            System.out.println("Çıkış yapılıyor...");
                            break;
                        default:
                            System.out.println("Hatalı tuşlama. Tekrar Deneyiniz.");
                            break;
                    }
                } while (select != 4);
                System.out.println("Tekrar görüşmek üzere.");
                break;
            } else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + right);
                }
            }
        }
    }
}
