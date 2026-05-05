package week3;

import java.util.Scanner;

public class odd_double {
    public static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayı1 giriniz : ");
        int ortalama = 0;
        int sayac = 0;
        int sayi = input.nextInt();
        for (int i = 0; i <= sayi; i++) {

            if (i % 3 == 0 && i % 4 == 0) {
                if (i != 0) {
                    sayac++;
                    ortalama = (ortalama + i) / sayac;
                    System.out.println(ortalama);
                }
            }
        }
    }
}
