package week6.Tek_boyutlu_diziler;

public class Tek_Boyutlu_Diziler {

    public static void main(String[] args) {

        // ===== TEK BOYUTLU DİZİLER: ÖZET =====
        // Dizi = aynı türden elemanları tutan, boyutu SABİT bir yapı.

        // --- 1) Tanımlama ---
        // Köşeli parantez tür isminden sonra (tercih edilen) ya da değişkenden sonra yazılabilir.
        int[] a;        // tercih edilen yazım
        int b[];        // bu da geçerli, farkı yok

        // --- 2) Oluşturma (new ile, kapasite ZORUNLU) ---
        int[] numbers = new int[5];   // 5 int'lik yer ayrılır, indeksler 0-4

        // --- 3) Değer atama / okuma ---
        // İndeks 0'dan başlar, son indeks = kapasite - 1
        numbers[0] = 10;
        numbers[1] = 15;
        numbers[2] = 20;
        numbers[3] = 25;
        numbers[4] = 30;
        System.out.println(numbers[3]);   // 25

        // --- 4) Elemanları baştan verme ---
        // Kapasite verilmez, eleman sayısından otomatik belirlenir (burada 7).
        String[] weekDays = new String[] { "Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma", "Cumartesi", "Pazar" };

        // Kısa yol: new kullanmadan (sadece tanımlama satırında çalışır)
        String[] weekDays2 = { "Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma", "Cumartesi", "Pazar" };

        // --- 5) Kapasiteyi öğrenme ---
        // Dizide length (PARANTEZSİZ, özellik). String'de ise length() (parantezli, metot).
        int[] big = new int[100];
        System.out.println(big.length);   // 100

        // --- 6) Eleman değiştirme ---
        String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
        cars[0] = "Opel";
        cars[2] = "Toyota";
        System.out.println(cars[0]);      // Opel

        // --- 7) Dizi üzerinde dolaşma (denemek için) ---
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }

        // --- 8) DİKKAT: İndeks aralığı ---
        // Geçerli indeksler: 0 ile length - 1 arası.
        // Aralık dışına çıkarsan çalışma anında hata alırsın.
        // Metinde IndexOutOfBoundsException yazıyor, dizilerde fırlatılan tam hata
        // ArrayIndexOutOfBoundsException'dır (IndexOutOfBoundsException'ın alt sınıfı).
        // System.out.println(numbers[5]);              // HATA! (5 elemanlı dizi)
        // System.out.println(numbers[numbers.length]); // HATA! (aynı sebep)

        // --- 9) Boyut sabittir ---
        // Dizi oluşturulduktan sonra büyümez/küçülmez.
        // Esnek boyut gerekiyorsa ArrayList kullanılır.

        // ===== IDE'DE DENE =====
        // 1) Yukarıdaki yorumlu HATA satırlarından birini aç, hatayı gör.
        // 2) Kendi int[] dizini oluşturup for döngüsüyle yazdır.
        // 3) String[] dizisinde bir elemanı değiştirip tekrar yazdır.
    }
}
