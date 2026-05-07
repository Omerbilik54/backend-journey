package week3;

import java.util.Scanner;

public class sum_of_digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz :");
        int sayi = scanner.nextInt();
        int temp = sayi;
        int total = 0;
        while(sayi%10!=0){
            temp = sayi%10;
            sayi = sayi/10;
            total = total + temp;
        }
        System.out.println("total : "+total);

    }
}
