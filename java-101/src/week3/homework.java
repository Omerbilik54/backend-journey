package week3;

import java.util.Scanner;

public class homework {
    public static void main() {
        Scanner input = new Scanner(System.in);
        int sayi;
        int toplam = 0;
        do {
            System.out.println("Lütfen bir sayı giriniz : ");
            sayi = input.nextInt();
            if (sayi % 2 == 0 && sayi % 4 == 0) {
                toplam += sayi;

            }
        } while (sayi % 2 == 0);
        System.out.println(toplam);
    }
}
