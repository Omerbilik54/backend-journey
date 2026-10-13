/*
 * KALITIM (inheritance): DijitalKitap bir Kitap'tır (is-a).
 * extends ile üst sınıfın alan ve metotlarını miras alır.
 * Üstteki private alanlara doğrudan dokunamaz; getter/setter kullanır.
 *
 * super(...) = üst sınıfın constructor'ını çağırır. İlk satırda olmalıdır.
 */
class DijitalKitap extends  Kitap {

    private String format; // PDF, EPUB... sadece dijital kitaba özel alan

    DijitalKitap(String baslik, String yazar, double fiyat, String format) {
        super(baslik, yazar, fiyat); // önce Kitap kısmını kur
        this.format = format;
    }

    // OVERRIDE: aynı imza, farklı gövde. Üstteki bilgiYazdir yerine bu çalışır.
    @Override
    void bilgiYazdir() {
        System.out.println(
            "Dijital kitap: " + getBaslik()
                + " | Yazar: " + getYazar()
                + " | Fiyat: " + getFiyat()
                + " | Format: " + format
        );
    }
}
