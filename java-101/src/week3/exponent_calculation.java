package week3;

import java.util.Scanner;

public class exponent_calculation {
    public static void main() {
        int n, k;
        Scanner input = new Scanner(System.in);
        System.out.println("Üssü alınacak sayıyı giriniz :");
        n = input.nextInt();
        System.out.println("Üs olacak sayıyı giriniz :");
        k = input.nextInt();
        int total = 1;
        /*
        int i = 1;
        while (i <= k) {
            total *= n;
            i++;
        }
        */
        for (int i = 1; i <= k; i++) {
            total *= n;
        }
        System.out.println(total);
    }
}
