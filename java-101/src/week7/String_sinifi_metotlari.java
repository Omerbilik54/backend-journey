package week7;
public class String_sinifi_metotlari {

    public static void main(String[] args) {

        // String = Karakter dizisidir.
        // String metotları metinler üzerinde işlem yapmamızı sağlar.

        String metin = "Merhaba Java";
        String metin2 = "merhaba java";

        // length() -> String'in uzunluğunu verir.
        System.out.println("Uzunluk: " + metin.length());

        // charAt() -> Belirtilen indisteki karakteri verir.
        System.out.println("0. karakter: " + metin.charAt(0));

        // toUpperCase() -> Tüm harfleri büyütür.
        System.out.println("Büyük Harf: " + metin.toUpperCase());

        // toLowerCase() -> Tüm harfleri küçültür.
        System.out.println("Küçük Harf: " + metin.toLowerCase());

        // equals() -> İki String'in tamamen aynı olup olmadığını kontrol eder.
        System.out.println("Eşit mi?: " + metin.equals(metin2));

        // equalsIgnoreCase() -> Büyük/küçük harf duyarsız karşılaştırma yapar.
        System.out.println("Eşit mi? (IgnoreCase): "
                + metin.equalsIgnoreCase(metin2));

        // contains() -> Belirtilen ifadeyi içeriyor mu?
        System.out.println("Java içeriyor mu?: "
                + metin.contains("Java"));

        // startsWith() -> Belirtilen ifade ile başlıyor mu?
        System.out.println("Merhaba ile başlıyor mu?: "
                + metin.startsWith("Merhaba"));

        // endsWith() -> Belirtilen ifade ile bitiyor mu?
        System.out.println("Java ile bitiyor mu?: "
                + metin.endsWith("Java"));

        // indexOf() -> Karakterin ilk bulunduğu indeksi verir.
        System.out.println("a harfinin ilk indexi: "
                + metin.indexOf("a"));

        // lastIndexOf() -> Karakterin son bulunduğu indeksi verir.
        System.out.println("a harfinin son indexi: "
                + metin.lastIndexOf("a"));

        // substring() -> String'in belirli kısmını alır.
        System.out.println("Parça: "
                + metin.substring(8));

        // replace() -> Karakter veya kelime değiştirir.
        System.out.println("Değiştir: "
                + metin.replace("Java", "Python"));

        // trim() -> Baş ve sondaki boşlukları siler.
        String bosluklu = "   Java   ";
        System.out.println("Trim: '" + bosluklu.trim() + "'");

        // concat() -> String birleştirir.
        System.out.println("Concat: "
                + metin.concat(" Öğreniyorum"));

        // isEmpty() -> String boş mu?
        String bos = "";
        System.out.println("Boş mu?: "
                + bos.isEmpty());

        // split() -> String'i parçalar.
        String cumle = "Java,C#,Python";
        String[] diller = cumle.split(",");

        System.out.println("Split Sonucu:");
        for (String dil : diller) {
            System.out.println(dil);
        }

        // toCharArray() -> String'i karakter dizisine çevirir.
        char[] karakterler = metin.toCharArray();

        System.out.println("Karakterler:");
        for (char k : karakterler) {
            System.out.print(k + " ");
        }

        System.out.println();

        // valueOf() -> Farklı veri tiplerini String'e çevirir.
        int sayi = 100;
        String strSayi = String.valueOf(sayi);
        System.out.println("String Sayı: " + strSayi);

        // compareTo() -> Alfabetik karşılaştırma yapar.
        System.out.println("compareTo: "
                + "Ali".compareTo("Veli"));

        // matches() -> Regex kontrolü yapar.
        System.out.println("Regex Kontrolü: "
                + "12345".matches("[0-9]+"));
    }
}
