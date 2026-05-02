package week2.kosullu_ifadeler;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class flight_ticket_calculator {
    public static void main() {
        //distence = mesafe
        double distance, age, total, price;
        int type;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Gidilecek mesafeyi giriniz : ");
        distance = scanner.nextInt();

        price = 0.1;
        total = distance * price;

        System.out.println("Yaşınızı giriniz : ");
        age = scanner.nextInt();

        System.out.println("Yolculuk tipini seçiniz : 1 - Tek Yön || 2 - Gidiş Dönüş: ");
        type = scanner.nextInt();

        switch (type) {
            case 1:
                if (age < 12) {
                    total -= total / 2;
                    System.out.println("İndirimli tutar : " + total);
                } else if (age > 12 && age < 24) {
                    total -= (total / 10);
                    System.out.println("İndirimli tutar : " + total);
                } else if (age > 65) {
                    total -= ((total * 30) / 100);
                    System.out.println("İndirimli tutar : " + total);
                } else {
                    System.out.println("Hatalı veri girdiniz");
                }
                break;
            case 2:
                total -= total / 5;
                if (age < 12) {
                    total -= total / 2;
                    System.out.println("İndirimli tutar : " + total);
                } else if (age > 12 && age < 24) {
                    total -= ((total * 10) / 100);
                    System.out.println("İndirimli tutar : " + total);
                } else if (age > 65) {
                    total -= ((total * 30) / 100);
                    System.out.println("İndirimli tutar : " + total);
                } else {
                    System.out.println("Hatalı veri girdiniz");
                }
                break;
            default:
                System.out.println("Hatalı veri girdiniz");
        }
    }
}
