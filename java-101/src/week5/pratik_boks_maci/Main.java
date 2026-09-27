package week5.pratik_boks_maci;

/**
 * Main = programın giriş noktası (entry point).

 * Java uygulaması çalıştırıldığında JVM (Java Virtual Machine) önce bu sınıfı arar
 * ve "public static void main(String[] args)" metodunu çalıştırır.

 * static → metot sınıfa aittir, henüz Main'den nesne üretmeden çağrılabilir.
 * void   → main bir değer return etmez.
 * String[] args → komut satırından gelen argümanlar (bu projede kullanılmıyor).
 */
public class Main {

    public static void main(String[] args) {

        // --- NESNE OLUŞTURMA (instantiation) ---
        // "new Fighter(...)" → heap'te yeni bir Fighter nesnesi yaratılır,
        // constructor çalışır, referans (marc, alex) o nesneyi gösterir.

        // Marc: 15 hasar, 100 can, 90 kg, %0 savuşturma (dodge yok)
        Fighter Habib = new Fighter("Habib", 15, 100, 90, 0);

        // Alex: 10 hasar, 95 can, 100 kg, %0 savuşturma
        Fighter Islam = new Fighter("İslam", 10, 95, 100, 0);

        // Ring: iki boksör, min kilo 90, max kilo 100 → ikisi de aralıkta, maç oynanır
        Ring r = new Ring(Habib, Islam, 90, 100);

        // Maçı başlat: kilo kontrolü, while döngüsü, vuruşlar, kazanan mesajı
        r.run();
    }
}
