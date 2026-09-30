package week6;

import java.util.Arrays;
import java.util.Scanner;

public class pratik_yakin_deger_bulma {
    public static void main(String[] args) {
        int[] dizi = {2, 7, 5, 2, 9, 4, 6};

        System.out.println(Arrays.toString(dizi));

        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayı girin: ");
        int sayi = scanner.nextInt();

        int enYakinKucuk = Integer.MIN_VALUE;
        int enYakinBuyuk = Integer.MAX_VALUE;

        for (int i : dizi) {

            if (i < sayi && i > enYakinKucuk) {
                enYakinKucuk = i;
            }

            if (i > sayi && i < enYakinBuyuk) {
                enYakinBuyuk = i;
            }
        }
        System.out.println("Girilen sayıdan küçük en yakın sayı : " + enYakinKucuk);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + enYakinBuyuk);
    }
}
