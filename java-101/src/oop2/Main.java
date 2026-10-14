package oop2;
public class Main {
    public static void main(String[] args) {

        // POLYMORPHISM:
        // Referans türü Odeme, gerçek nesne KrediKarti.
        Odeme odeme1 = new KrediKarti(1500);

        // Gerçek nesne BankaKarti.
        Odeme odeme2 = new BankaKarti(750);

        // Gerçek nesne Havale.
        Odeme odeme3 = new Havale(2000);

        // Üst sınıftan miras alınan metot çağrılır.
        odeme1.bilgiGoster();

        // Gerçek nesnenin KrediKarti sürümü çalışır.
        odeme1.odemeYap();

        odeme2.bilgiGoster();
        odeme2.odemeYap();

        odeme3.bilgiGoster();
        odeme3.odemeYap();

        // Interface referansı üzerinden de metot çağrılabilir.
        IadeEdilebilir iade = new KrediKarti(1500);
        iade.iadeYap();
    }
}