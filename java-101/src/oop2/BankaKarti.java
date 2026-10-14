package oop2;
class BankaKarti extends Odeme {

    public BankaKarti(double tutar) {
        // Üst sınıfın constructor'ına tutarı gönderir.
        super(tutar);
    }

    @Override
    // Aynı metot, bu sınıfta farklı bir işlem yapar.
    public void odemeYap() {
        System.out.println("Banka kartıyla ödeme yapıldı.");
    }
}