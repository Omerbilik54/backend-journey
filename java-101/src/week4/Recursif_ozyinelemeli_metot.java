package week4;

public class Recursif_ozyinelemeli_metot {

    static int f(int n) {
        System.out.println("Fonksiyona girildi | n = " + n);

        if (n == 1) {
            System.out.println("--> Son nokta (Base Case)    n = 1 için 1 dönülüyor.\n");
            return 1;
        }

        int result = f(n - 1) + n;
        System.out.println("Hesaplandı | f(" + n + ") sonucu = " + result);
        return result;
    }


    public static void main(String[] args) {
        int nihaiSonuc = f(3);
        System.out.println("================================");
        System.out.println("SONUÇ: " + nihaiSonuc);}
}



//**Recursive (özyinelemeli) metot**, kendi kendisini tekrar çağıran metottur.

//Bir problemi doğrudan tek seferde çözmek yerine, problemi **daha küçük parçalara bölerek** aynı metodu tekrar çalıştırır.

//Bir recursive metodun mutlaka iki temel kısmı vardır:

//        * **Base Case (Temel durum):** Metodun artık kendisini çağırmayı bırakacağı nokta.Önemli . Base Case olmazsa sonsuza kadar devam eder.
//* **Recursive Case (Özyinelemeli durum):** Metodun kendisini, problemi biraz daha küçülterek tekrar çağırdığı kısım.

//        **Kısaca:** Recursive metot = **Kendini çağıran ve bir durma koşuluna ulaştığında sona eren metot.**
