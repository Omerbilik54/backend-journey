package week4;

public class metot_overloading_asırı_yukleme {

    static void print(){
        System.out.println("Parametresiz metot");
    }

    static void print(int a){
        System.out.println("Parametreler :" + a);
    }

    static void print (double a){
        System.out.println("Parametreler double : " + a);

    }

    static int print(int a , int b){
        return a + b;
    }

    static int print(int a , int b , int c){
        return a + b + c;
    }

    static void kodluyoruz(String y) {
        String x = "Java101";
        y = "Kodluyoruz";
    }
    public static void main(String[] args){
        
        print();
        print(5);
        print(5.5);
        System.out.println("The sum is : " + print(5, 10));
        System.out.println("The sum is : " + print(5, 10, 15));

        String x = "Patika.dev";
        kodluyoruz(x);
        System.out.println(x);
    }
}
//Aklında şöyle tut

//Overloading = aynı isim + farklı parametre listesi

//Parametreler;

//farklı sayıda olabilir,
//farklı veri tiplerinde olabilir,
//farklı sırada olabilir.


//---------------------------LOKAL DEĞİŞKENLER---------------------------
//Lokal değişken, Java’da sadece tanımlandığı metodun veya bloğun içinde kullanılabilen geçici değişkendir.
//Yani:
//Metodun içinde oluşturulur.
//Sadece o metodun/blokun içinde geçerlidir.
//Metot bittiğinde kullanım alanı da biter.
//Başka metotlar doğrudan erişemez.

//Kısaca: Lokal değişken = kapsamı bulunduğu metot veya blokla sınırlı olan değişken.