package oop2;
// ABSTRACT CLASS: Ortak özellikleri tutar.
// Bu sınıftan doğrudan nesne oluşturulamaz.
abstract class Odeme {

    protected double tutar;
    // protected: Alt sınıflar bu değişkene erişebilir.

    public Odeme(double tutar) {
        // Constructor: Nesne oluşturulurken çalışır.
        // super(tutar) ile buraya gelen değer belirlenir.
        this.tutar = tutar;
        // this.tutar: Sınıfın değişkeni
        // tutar: Constructor'a gönderilen parametre
    }

    public void bilgiGoster() {
        // Normal metot: Bütün alt sınıflar bu metodu kullanabilir.
        System.out.println("Ödeme tutarı: " + tutar + " TL");
    }

    public abstract void odemeYap();
    // Abstract metot: Gövdesi yoktur.
    // Somut alt sınıflar bu metodu kendilerine göre yazmalıdır.
}