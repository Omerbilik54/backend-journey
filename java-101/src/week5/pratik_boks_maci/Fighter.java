package week5.pratik_boks_maci;

/**
 * Fighter = Boksör (dövüşçü) sınıfı.
 *
 * OOP'de her boksör gerçek hayattaki bir sporcunun yazılımdaki karşılığıdır.
 * Bu sınıf bir "şablon"tur (class): Marc, Alex gibi somut kişiler bu şablondan
 * üretilen nesnelerdir (object / instance).
 */
public class Fighter {

    // --- ALANLAR (fields / attributes / özellikler) ---
    // Her Fighter nesnesinin kendi kopyası olan değişkenler.
    // "String name" → bu boksörün adı (Marc, Alex vb.)

    String name;   // Boksörün ismi
    int damage;    // Her vuruşta rakibe vereceği hasar miktarı
    int health;    // Can puanı; 0 olunca elenir
    int weight;    // Kilogram cinsinden ağırlık (ring kurallarına uygunluk için)
    double dodge;  // Savuşturma şansı: 0–100 arası; örn. 90 = %90 ihtimalle hasarı bloklar

    /**
     * CONSTRUCTOR (yapıcı metot)
     *
     * "new Fighter(...)" dediğinde Java otomatik olarak bu metodu çalıştırır.
     * Görevi: yeni oluşan nesnenin tüm alanlarını başlangıç değerleriyle doldurmak.
     *Görseldeki @param etiketi, Java'da metot veya kurucu metodun (constructor) aldığı parametreleri açıklamak için kullanılan özel bir Javadoc (dokümantasyon) etiketidir.
     *Kodun çalışmasına veya işleyişine doğrudan etki etmez; sadece geliştiricilerin kodu anlamasını kolaylaştırır.
     *
     * @param name   boksör adı
     * @param damage vuruş hasarı
     * @param health başlangıç canı
     * @param weight kilo
     * @param dodge  savuşturma yüzdesi (0–100)
     *
     * "this" anahtar kelimesi: şu an oluşturulan nesneyi işaret eder.
     * this.name = name → parametre adı ile alan adı aynı olduğu için
     * sol taraf nesnenin alanı, sağ taraf metoda gelen değerdir.
     */
    public Fighter(String name, int damage, int health, int weight, double dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
    }

    /**
     * hit = "vurmak"
     *
     * Bu boksör (this), parametre olarak verilen rakibe (foe = foe/enemy) saldırır.
     * Dönüş tipi int: vuruştan sonra rakibin KALAN canını döndürür;
     * Ring sınıfı bu değeri rakibin health alanına yazar.
     *
     * @param foe saldırılan rakip Fighter nesnesi
     * @return rakibin yeni can değeri (0 ile health arasında)
     */
    public int hit(Fighter foe) {
        System.out.println("------------");
        // this.name → vuran; foe.name → vurulan; this.damage → verilen hasar
        System.out.println(this.name + " => " + foe.name + " " + this.damage + " hasar vurdu.");

        // Rakip savuşturmayı denerse hasar işlenmez; can aynı kalır
        if (foe.dodge()) {
            System.out.println(foe.name + " gelen hasarı savurdu.");
            return foe.health; // değişiklik yok
        }

        // Can hasardan küçük kalacaksa 0'a sabitle (negatif can olmasın)
        if (foe.health - this.damage < 0)
            return 0;

        // Normal durum: eski can − hasar
        return foe.health - this.damage;
    }

    /**
     * dodge = "savuşturmak / kaçınmak"
     *
     * Rastgele sayı üretilir; boksörün dodge değerinden küçük veya eşitse
     * savuşturma başarılı sayılır (true).
     *
     * Math.random() → 0.0 dahil, 1.0 hariç rastgele ondalık sayı.
     * * 100 ile çarpınca yaklaşık 0.0–99.9 aralığı elde edilir.
     *
     * @return true = hasar bloklandı, false = hasar yedi
     */
    public boolean dodge() {
        double randomValue = Math.random() * 100; // 0.0 ile 99.9 arası
        return randomValue <= this.dodge;
    }
}
