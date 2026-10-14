package oop2;
class Havale extends Odeme {

    public Havale(double tutar) {
        super(tutar);
        // super(): Üst sınıfın constructor'ına gider.
        // Burada parametreli constructor çağrıldığı için
        // super(tutar) kullanılır.
    }

    @Override
    public void odemeYap() {
        System.out.println("Havale ile ödeme yapıldı.");
    }
}