package week6.Arrays_sınıfı;

import java.util.Arrays;

public class Helper_Arrays {
    public static void main(String[] args) {

//      Arrays.toString(dizi);         // Diziyi yazdır
//      Arrays.fill(dizi, deger);      // Doldur
//      Arrays.sort(dizi);             // Sırala
//      Arrays.binarySearch(dizi, x);  // İndis bul (dizi sıralı olmalı)
//      Arrays.copyOf(dizi, n);        // İlk n elemanı kopyala
//      Arrays.copyOfRange(dizi,a,b);  // a-b aralığını kopyala
//      Arrays.equals(d1, d2);         // Diziler eşit mi?
        // Örnek dizi
        int[] dizi = {3, 5, 79, 12, 25, -3, 66, 82, -49, 152};

        // ==============================
        // Arrays.toString()
        // Diziyi okunabilir şekilde ekrana yazdırır.
        // ==============================
        System.out.println("toString : " + Arrays.toString(dizi));


        // ==============================
        // Arrays.fill()
        // Dizinin tüm elemanlarını belirtilen değerle doldurur.
        // ==============================
        int[] fillDizi = {1, 2, 3, 4, 5};
        Arrays.fill(fillDizi, 10);
        System.out.println("fill : " + Arrays.toString(fillDizi));

        // Belirli aralığı doldurma (başlangıç dahil, bitiş hariç)
        int[] fillDizi2 = {1, 2, 3, 4, 5};
        Arrays.fill(fillDizi2, 1, 4, 7);
        System.out.println("fill(aralik) : " + Arrays.toString(fillDizi2));


        // ==============================
        // Arrays.sort()
        // Diziyi küçükten büyüğe sıralar.
        // ==============================
        int[] sirala = {6, 1, 55, 21, 33, -321, -21, 2, -11, 27};
        Arrays.sort(sirala);
        System.out.println("sort : " + Arrays.toString(sirala));


        // ==============================
        // Arrays.binarySearch()
        // Sıralı dizide elemanın indeksini bulur.
        // Önce sort() kullanılmalıdır.
        // ==============================
        int index = Arrays.binarySearch(sirala, 33);
        System.out.println("33'un indeksi : " + index);


        // ==============================
        // Arrays.copyOf()
        // Dizinin belirtilen uzunlukta kopyasını oluşturur.
        // ==============================
        int[] copyDizi = Arrays.copyOf(dizi, 3);
        System.out.println("copyOf : " + Arrays.toString(copyDizi));


        // ==============================
        // Arrays.copyOfRange()
        // Belirtilen aralığı yeni diziye kopyalar.
        // Başlangıç dahil, bitiş hariç.
        // ==============================
        int[] rangeDizi = Arrays.copyOfRange(dizi, 0, 5);
        System.out.println("copyOfRange : " + Arrays.toString(rangeDizi));


        // ==============================
        // Arrays.equals()
        // İki dizi aynı elemanlara sahipse true döndürür.
        // ==============================
        int[] list1 = {1, 2, 3};
        int[] list2 = {1, 2, 3};
        int[] list3 = {1, 2, 10};

        System.out.println("list1 == list2 : " + Arrays.equals(list1, list2)); // true
        System.out.println("list2 == list3 : " + Arrays.equals(list2, list3)); // false
    }
}
