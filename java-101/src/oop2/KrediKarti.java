package oop2;
class KrediKarti extends Odeme implements IadeEdilebilir {

    public KrediKarti() {
        // this(1000): Aynı sınıftaki KrediKarti(double tutar)
        // constructor'ını çağırır.
        this(1000);
    }

    public KrediKarti(double tutar) {
        // Üst sınıfın constructor'ını çağırır.
        super(tutar);
    }

    @Override
    public void odemeYap() {
        System.out.println("Kredi kartıyla ödeme yapıldı.");
    }

    @Override
    public void iadeYap() {
        System.out.println("Kredi kartı ödemesi iade edildi.");
    }
}