package week5.pratik_boks_maci;

/**
 * Ring = Boks ringi / maç organizasyonu.

 * Fighter sadece "tek bir sporcu"yu modeller.
 * Ring ise iki sporcuyu bir araya getirir, kuralları (kilo sınırı) kontrol eder
 * ve round round maçı yönetir. Bu, OOP'de "sorumlulukları ayırma" örneğidir:
 * vuruş mantığı Fighter'da, maç akışı Ring'de.
 */
public class Ring {

    // Ring'in bildiği iki boksör referansı (aynı nesnelere Main'de oluşturulan Marc/Alex işaret eder)
    Fighter f1;  // birinci dövüşçü
    Fighter f2;  // ikinci dövüşçü

    // Bu maç için geçerli minimum ve maksimum kilo (her iki sporcu da bu aralıkta olmalı)
    int minWeight;
    int maxWeight;

    /**
     * Ring oluşturulurken maçın tarafları ve kilo limitleri verilir.
     * Referans ataması: f1 ve f2, dışarıdan gelen Fighter nesnelerinin adreslerini tutar;
     * Ring üzerinden f1.health değiştirince Main'deki marc'un canı da değişir (aynı nesne).
     */
    public Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    /**
     * run = maçı başlat ve round'lar halinde oynat.

     * void → geriye değer döndürmez; sadece ekrana yazar ve döngüyü yönetir.
     */
    public void run() {

        // Önce kilo uygunluğu; uygun değilse maç hiç başlamaz
        if (checkWeight()) {

            // Her iki sporcunun canı 0'dan büyük olduğu sürece round devam eder
            // && (VE) → iki koşul da true olmalı
            while (f1.health > 0 && f2.health > 0) {
                System.out.println("======== YENİ ROUND ===========");

                // --- Bu round'da kimin önce vuracağı: %50 / %50 ---
                // Math.random() → 0.0 ile 1.0 arası (1.0 dahil değil) rastgele sayı.
                // < 0.5 koşulu kabaca yarı yarıya true / false üretir → %50 ihtimal.
                boolean f1BuRoundOnceVurur = Math.random() < 0.5;

                // Round içinde "ilk vuran" ve "ikinci vuran" referansları;
                // f1/f2 alanları değişmez, sadece bu turdaki sırayı belirleriz.
                Fighter ilkVuran;
                Fighter ikinciVuran;
                if (f1BuRoundOnceVurur) {
                    ilkVuran = f1;
                    ikinciVuran = f2;
                } else {
                    ilkVuran = f2;
                    ikinciVuran = f1;
                }
                System.out.println("Bu round'a ilk vuruşu " + ilkVuran.name + " yapacak.");

                // İlk vuran rakibe vurur; dönen değer rakibin yeni canıdır
                ikinciVuran.health = ilkVuran.hit(ikinciVuran);

                // Biri elendiyse döngüden çık (gereksiz vuruş olmasın)
                if (isWin()) {
                    break; // break → en içteki while'dan hemen çıkar
                }

                // Sıra ikinci vuranda: karşı tarafın canını güncelle
                ilkVuran.health = ikinciVuran.hit(ilkVuran);

                if (isWin()) {
                    break;
                }

                // Round sonu skor tablosu
                printScore();
            }

        } else {
            System.out.println("Sporcuların ağırlıkları uyuşmuyor.");
        }
    }

    /**
     * checkWeight = kilo kontrolü

     * Her iki boksörün weight değeri [minWeight, maxWeight] kapalı aralığında mı?
     * && ile iki tarafın da uygun olması şart.
     *
     * @return true → maç yapılabilir, false → maç iptal
     */
    public boolean checkWeight() {
        return (f1.weight >= minWeight && f1.weight <= maxWeight)
                && (f2.weight >= minWeight && f2.weight <= maxWeight);
    }

    /**
     * isWin = maç bitti mi, kazanan kim?

     * Can 0 olan taraf kaybetmiştir. Kazananın adını yazdırır ve true döner
     * (Ring.run içinde break için). Kimse elenmediyse false.
     */
    public boolean isWin() {
        if (f1.health == 0) {
            // f1 öldü → kazanan f2
            System.out.println("Maçı Kazanan : " + f2.name);
            return true;
        } else if (f2.health == 0) {
            // f2 öldü → kazanan f1
            System.out.println("Maçı Kazanan : " + f1.name);
            return true;
        }

        return false; // maç devam ediyor
    }

    /**
     * printScore = round sonrası kalan canları ekrana bas.

     * \t → sekme (tab) karakteri; sütunları hizalamak için kullanılmış.
     */
    public void printScore() {
        System.out.println("------------");
        System.out.println(f1.name + " Kalan Can \t:" + f1.health);
        System.out.println(f2.name + " Kalan Can \t:" + f2.health);
    }
}
