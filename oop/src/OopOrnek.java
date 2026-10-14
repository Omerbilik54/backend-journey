/*
 * OOP (Object-Oriented Programming) = nesne yönelimli programlama.
 *
 * Temel fikir: Gerçek dünyadaki varlıkları "sınıf" (şablon) ve "nesne"
 * (o şablondan üretilmiş somut örnek) olarak kodlamak.
 *
 * Java'da sen .java yazarsın. Derleyici (javac) her sınıf için bir .class
 * dosyası üretir. .class, JVM'in çalıştırdığı bytecode'dur; elle yazılmaz.
 *
 * Bu dosyada 3 sınıf var (hepsi aynı .java içinde):
 *   1) OopOrnek      -> programın giriş noktası (main)
 *   2) Kitap         -> temel sınıf (alan, constructor, kapsülleme)
 *   3) DijitalKitap  -> Kitap'tan türeyen alt sınıf (kalıtım + override)
 *
 * Derleme:    javac -encoding UTF-8 OopOrnek.java
 * Çalıştırma: java OopOrnek
 *
 * javac her sınıf için ayrı .class üretir (OopOrnek.class, Kitap.class,
 * DijitalKitap.class). Bunları sen yazmazsın; derleyici oluşturur.
 * Kaynak = .java  |  çalıştırılan bytecode = .class
 */

public class OopOrnek {

    public static void main(String[] args) {
        // new = şablondan NESNE üretmek. Bellekte ayrı bir Kitap örneği doğar.
        Kitap k1 = new Kitap("Sefiller", "Victor Hugo", 150);
        Kitap k2 = new Kitap("1984", "George Orwell", 200);

        // Aynı sınıftan iki nesne: şablon aynı, VERİLER farklı.
        k1.bilgiYazdir();
        k2.bilgiYazdir();

        // private alana doğrudan k1.fiyat = -10; yazamazsın (kapsülleme).
        k1.setFiyat(180);          // geçerli
        k1.setFiyat(-50);          // geçersiz -> sınıf kendi kuralını uygular
        System.out.println("k1 yeni fiyat: " + k1.getFiyat());

        // POLİMORFİZM: Değişken tipi Kitap, gerçek nesne DijitalKitap.
        // Çalışma anında override edilmiş metot çağrılır.
        Kitap dijital = new DijitalKitap("Clean Code", "Robert C. Martin", 250, "PDF");
        dijital.bilgiYazdir();

        Urun urun = new Urun();

        urun.fiyatBelirle(32432);
        urun.bilgiYazdirdim();


    }
}


