import java.util.Scanner;

public class BurcSorgula {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int day, month;
        String burc = "";
        boolean isError = false;

        System.out.print("Kaçıncı ayda doğdunuz: ");
        month = inp.nextInt();
        System.out.print("Kaçıncı gün: ");
        day = inp.nextInt();
        if (month > 0 && month <= 12) {
            if (month == 1) {
                if (day >= 21 && day <= 31) {
                    burc = "KOVA";
                } else if (day < 21 && day >= 1) {
                    burc = "OĞLAK";
                } else isError = true;
            }
            if (month == 2) {
                if (day >= 20 && day <= 28) {
                    burc = "BALIK";
                } else if (day < 19 && day >= 1) {
                    burc = "KOVA";
                } else isError = true;
            }
            if (month == 3) {
                if (day > 20 && day <= 31) {
                    burc = "KOÇ";
                } else if (day <= 20 && day >= 1) {
                    burc = "BALIK";
                } else isError = true;
            }
            if (month == 4) {
                if (day > 21 && day <= 30) {
                    burc = "BOĞA";
                } else if (day <= 21 && day >= 1) {
                    burc = "KOÇ";
                } else isError = true;
            }
            if (month == 5) {
                if (day > 21 && day <= 31) {
                    burc = "İKİZLER";
                } else if (day <= 21 && day >= 1) {
                    burc = "BOĞA";
                } else isError = true;
            }
            if (month == 6) {
                if (day > 21 && day <= 30) {
                    burc = "YENGEÇ";
                } else if (day <= 21 && day >= 1) {
                    burc = "İKİZLER";
                } else isError = true;
            }
            if (month == 7) {
                if (day > 23 && day <= 31) {
                    burc = "ASLAN";
                } else if (day <= 23 && day >= 1) {
                    burc = "YENGEÇ";
                } else isError = true;
            }
            if (month == 8) {
                if (day > 23 && day <= 31) {
                    burc = "BAŞAK";
                } else if (day <= 23 && day >= 1) {
                    burc = "ASLAN";
                } else isError = true;
            }
            if (month == 9) {
                if (day > 23 && day <= 30) {
                    burc = "TERAZİ";
                } else if (day <= 23 && day >= 1) {
                    burc = "BAŞAK";
                } else isError = true;
            }
            if (month == 10) {
                if (day > 23 && day <= 31) {
                    burc = "AKREP";
                } else if (day <= 23 && day >= 1) {
                    burc = "TERAZİ";
                } else isError = true;
            }
            if (month == 11) {
                if (day > 20 && day <= 30) {
                    burc = "YAY";
                } else if (day <= 22 && day >= 1) {
                    burc = "AKREP";
                } else isError = true;
            }
            if (month == 12) {
                if (day > 21 && day <= 31) {
                    burc = "OĞLAK";
                } else if (day <= 21 && day >= 1) {
                    burc = "YAY";
                } else isError = true;
            }
        } else {
            isError = true;
        }
    if (isError){
        System.out.println("HATALI DEĞERLER GİRDİNİZ.TEKRAR DENEYİN..");
    } else System.out.println("Burcunuz "+burc);
    }
}