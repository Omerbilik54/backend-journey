public class Urun {

    private double fiyat;

    public double getFiyat() {
        return fiyat;
    }

    public boolean fiyatBelirle(double yeniFiyat) {
        if (yeniFiyat<=0) {
            System.out.println("Girilen değer pozitif olmalı.");
            return false;
        }

        this.fiyat = yeniFiyat;
        return true;
    }
    void bilgiYazdirdim() {
        System.out.println("Yeni fiyat: " + getFiyat());
    }
}
