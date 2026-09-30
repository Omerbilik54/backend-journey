package week6;

import java.util.Arrays;
import java.util.Scanner;

public class pratik_dizi_siralama {
     static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dizinin boyutunu giriniz : ");
        int n = scanner.nextInt();
        System.out.println("Dizinin elemanlarını giriniz : ");
        int[] dizi = new int[n];
        for (int i = 0, j = 1; i < n && j <= n; i++, j++) {
            dizi[i] = scanner.nextInt();
            System.out.println(j + ". eleman : " + dizi[i]);
        }
        System.out.println(Arrays.toString(dizi));
        System.out.print("Sıralama : ");
        Arrays.sort(dizi);
        System.out.println(Arrays.toString(dizi));
    }
}
