package week2.kosullu_ifadeler;

import java.sql.SQLOutput;
import java.util.Scanner;

public class burc_hesaplama {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        boolean isError = false;
        String burc = "";
        int day, month;
        System.out.println("Burcunuzu öğrenmek için ay numarası giriniz : ");
        month = scanner.nextInt();
        System.out.println("Burcunuzu öğrenmek için günü giriniz : ");
        day = scanner.nextInt();
        switch (month) {
            case 1:
                if ((day >= 1) && (day <= 31)) {
                    if (day < 22) {
                        burc = "oğlak";
                    } else {
                        burc = "kova";
                    }
                } else {
                    isError = true;
                }
                break;
            case 2:
                if ((day >= 1) && (day <= 28)) {
                    if (day < 20) {
                        burc = "kova";
                    } else {
                        burc = "balık";
                    }
                } else {
                    isError = true;
                }
                break;
            case 3:
                if ((day >= 1) && (day <= 31)) {
                    if (day < 21) {
                        burc = "balık";
                    } else {
                        burc = "koç";
                    }
                } else {
                    isError = true;
                }
                break;
            default:
                isError = true;

                if (isError) {
                    System.out.println("Lütfen geçerli bir sayı giriniz");
                } else {
                    System.out.println("Burcunuz : " + burc);
                }
        }
    }
}
