
/*
 * SINIF = nesnenin şablonu.
 * Alanlar (fields) = nesnenin durumu (state).
 * Metotlar = nesnenin davranışı (behavior).
 * Constructor = nesne new ile yaratılırken bir kez çalışan kurucu.
 */
public class Kitap {

    // private: dışarıdan doğrudan erişilemez. Bu KAPSülLEME'dir (encapsulation).
    // Veri sınıfta saklanır; dış dünya sadece izin verdiğin metotlarla konuşur.
    private String baslik;
    private String yazar;
    private double fiyat;

    // Constructor adı sınıf adıyla aynıdır, dönüş tipi YOKTUR.
    // this.alan = parametre  ->  nesnenin kendi alanına atama.
    Kitap(String baslik, String yazar, double fiyat) {
        this.baslik = baslik;
        this.yazar = yazar;
        setFiyat(fiyat); // fiyat kuralını tek yerde tutmak için setter kullanıyoruz
    }

    // Getter: okuma izni. Setter: kontrollü yazma izni.
    String getBaslik() {
        return baslik;
    }

    String getYazar() {
        return yazar;
    }

    double getFiyat() {
        return fiyat;
    }

    void setFiyat(double fiyat) {
        if (fiyat < 0) {
            System.out.println("Uyari: fiyat negatif olamaz. Atama yapilmadi.");
            return;
        }
        this.fiyat = fiyat;
    }

    // Alt sınıf bunu değiştirebilsin diye "override edilebilir" bırakıyoruz.
    void bilgiYazdir() {
        System.out.println("Kitap: " + baslik + " | Yazar: " + yazar + " | Fiyat: " + fiyat);
    }
}
