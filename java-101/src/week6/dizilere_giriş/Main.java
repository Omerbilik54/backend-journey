package week6.dizilere_giriş;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // 1) Tanımlama ve oluşturma
        int[] a = new int[5];              // 5 elemanlı, varsayılan değerler 0
        int dizi[] = new int[5];            //Bu da dizinin farklı bir yazımı . Ama daha çok üsttei kulllanılıyor .

        int[] b = {10, 20, 30, 40, 50};    // değerlerle birlikte tanımlama
        String[] isimler = new String[3];  // referans tipleri varsayılan null
        boolean[] flags = new boolean[2];  // varsayılan false

        // 2) Erişim (indeks 0'dan başlar, son indeks = length - 1)
        System.out.println(b[0]);          // 10
        b[1] = 25;                         // değer atama
        System.out.println(b.length);      // 5 (length bir alan, metot değil!)

        // 3) Döngülerle gezme
        for (int i = 0; i < b.length; i++) {   // indeks gerekiyorsa
            System.out.println(b[i]);
        }
        for (int x : b) {                      // sadece okuma için (for-each)
            System.out.println(x);
        }

        // 4) Çok boyutlu diziler
        int[][] matris = {
                {1, 2, 3},
                {4, 5, 6}
        };
        System.out.println(matris[1][2]);      // 6 (satır 1, sütun 2)
        int[][] duzensiz = new int[3][];       // jagged array: satır uzunlukları farklı olabilir
        duzensiz[0] = new int[2];

        // 5) Arrays sınıfı (java.util.Arrays)
        int[] c = {5, 3, 9, 1};
        Arrays.sort(c);                                // sıralar -> [1, 3, 5, 9]
        System.out.println(Arrays.toString(c));        // diziyi yazdırır
        System.out.println(Arrays.binarySearch(c, 5)); // sıralı dizide arama -> 2
        int[] kopya = Arrays.copyOf(c, 6);             // yeni boyutla kopyalar (fazlası 0)
        int[] aralik = Arrays.copyOfRange(c, 1, 3);    // [1, 3) aralığı -> [3, 5]
        Arrays.fill(a, 7);                             // hepsini 7 yapar
        System.out.println(Arrays.equals(b, c));       // içerik karşılaştırma
        System.out.println(Arrays.deepToString(matris)); // çok boyutlu yazdırma

        // 6) Dikkat edilecekler
        int[] d = b;                       // KOPYA DEĞİL, aynı diziye referans!
        d[0] = 99;                         // b[0] da 99 olur
        int[] e = b.clone();               // gerçek (yüzeysel) kopya
        // b == c        -> referans karşılaştırır, içerik için Arrays.equals kullan
        // b[5]          -> ArrayIndexOutOfBoundsException (runtime hatası)
        // Boyut sabittir; büyütmek için yeni dizi ya da ArrayList kullan

        // 7) Diziden listeye
        Integer[] boxed = {3, 1, 2};       // List için wrapper tip gerekir (int[] olmaz)
        java.util.List<Integer> liste = new java.util.ArrayList<>(Arrays.asList(boxed));
    }
}
