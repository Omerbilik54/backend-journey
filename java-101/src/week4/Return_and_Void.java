package week4;

public class Return_and_Void {
static int sum(int a, int b) {
    return a + b;
}


static void show() { 
    System.out.println("Show metodu.."); 
    return; }

static void eksi(int a, int b) {
    System.out.println("The difference is: " + (a - b));
}

public static void main(String[] args) {
    int result = sum(5, 10);
    System.out.println("The sum is: " + result);

    eksi(10, 5);

    show();
}
}

//void: Metot herhangi bir değer döndürmeyecekse kullanılır.
//void de parametre alabilir . Ama bir tane . Çünkü hesaplama işlerini return yapıyor . Void ne istersen anında onu veriyor. Yani bir değer üretmiyor . 
//return: Metodun ürettiği değeri metodu çağıran yere geri göndermek için kullanılır.

//Bazen void içinde de return kullanılır . Bu, metodu o noktada sonlandırmak istediği için .