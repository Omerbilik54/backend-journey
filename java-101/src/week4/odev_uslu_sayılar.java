package week4;

import java.util.Scanner;

public class odev_uslu_sayılar {
    static int power(int base,int exponent){

        if(exponent == 0){
            return 1;
        }
        int result = 1;
        result = base * power(base,exponent-1);
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Üssü gir: ");
        int base = scanner.nextInt();
        System.out.println("Tabanı gir: ");
        int exponent = scanner.nextInt();
        int sonuc = power(base,exponent);
        System.out.println(sonuc);
    }
}
