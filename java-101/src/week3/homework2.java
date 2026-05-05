package week3;

import java.util.Scanner;

public class homework2 {
    public static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz : ");
        int sayi = input.nextInt();
        int four = 1, five = 1;

        while (four <= sayi && five <= sayi) {
            System.out.println(four + " " + five);
            four *= 4;
            five *= 5;

        }
    }
}
