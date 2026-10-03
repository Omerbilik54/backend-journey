package week7;
public class Math_sinifi_metotlari {

    public static void main(String[] args) {

        // Math sınıfı Java'da matematiksel işlemler yapmak için kullanılır.
        // Kullanım şekli:
        // Math.metotAdi(parametreler);

        // abs() -> Sayının mutlak değerini alır.
        System.out.println("Mutlak Değer: " + Math.abs(-25));

        // max() -> İki sayıdan büyük olanı döndürür.
        System.out.println("En Büyük Sayı: " + Math.max(10, 20));

        // min() -> İki sayıdan küçük olanı döndürür.
        System.out.println("En Küçük Sayı: " + Math.min(10, 20));

        // sqrt() -> Sayının karekökünü alır.
        System.out.println("Karekök: " + Math.sqrt(81));

        // pow() -> Bir sayının üssünü hesaplar.
        // 2 üzeri 5 = 32
        System.out.println("Üs Alma: " + Math.pow(2, 5));

        // round() -> Ondalıklı sayıyı en yakın tam sayıya yuvarlar.
        System.out.println("Yuvarlama: " + Math.round(4.7));

        // ceil() -> Sayıyı yukarı yuvarlar.
        System.out.println("Yukarı Yuvarlama: " + Math.ceil(4.1));

        // floor() -> Sayıyı aşağı yuvarlar.
        System.out.println("Aşağı Yuvarlama: " + Math.floor(4.9));

        // random() -> 0 ile 1 arasında rastgele sayı üretir.
        System.out.println("Rastgele Sayı: " + Math.random());

        // 1 ile 100 arasında rastgele tam sayı üretme örneği
        int rastgele = (int) (Math.random() * 100) + 1;
        System.out.println("1-100 Arası Rastgele Sayı: " + rastgele);
//
//        Math.abs(sayi);      // Mutlak değer
//        Math.max(a, b);      // Büyük olan sayı
//        Math.min(a, b);      // Küçük olan sayı
//        Math.sqrt(sayi);     // Karekök
//        Math.pow(a, b);      // Üs alma
//        Math.round(sayi);    // Yuvarlama
//        Math.ceil(sayi);     // Yukarı yuvarlama
//        Math.floor(sayi);    // Aşağı yuvarlama
//        Math.random();       // Rastgele sayı
    }
}
