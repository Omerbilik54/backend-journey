package week6;

import java.util.Arrays;

public class pratik_tekrar_edilen_eleman {
     static void main(String[] args) {
        int[] dizi = new int[]{5, 5, 4, 43, 6, 6, 6, 6, 6};
        System.out.print("Dizi : ");
        System.out.println(Arrays.toString(dizi));
        System.out.println("Tekrar sayıları :");

        for (int i = 0; i < dizi.length; i++) {
            int temp = 0;
            for (int a : dizi) {
                if (dizi[i] == a) {
                    temp += 1;
                }
            }
            boolean tekrar_var = false;
            for (int j = 0; j < i; j++) {
                if (dizi[i] == dizi[j]) {
                    tekrar_var = true;
                    break;
                }
            }
            if (!tekrar_var) {
                System.out.println(dizi[i] + " sayısı " + temp + " kere tekrar edildi");
            }
        }
    }
}