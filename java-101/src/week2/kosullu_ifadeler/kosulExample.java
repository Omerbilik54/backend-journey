package week2.kosullu_ifadeler;

import java.util.Scanner;

public class kosulExample {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        int n1,n2,select;
        System.out.println("Kullanıcıdan bir değer giriniz : ");
        n1 = scanner.nextInt();
        System.out.println("Kullanıcıdan bir değer giriniz : ");
        n2 = scanner.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        select = scanner.nextInt();
        switch (select){
            case 1:
                System.out.println("Toplam : " + (n1+n2));
                break;
            case 2:
                System.out.println("Fark : " + (n1-n2));
                break;
            case 3:
                System.out.println("Çarpma : " + (n1*n2));
                break;
            case 4:
                if (n1!=0)
                    System.out.println("Bölme : " + (n1/n2));
                else
                    System.out.println("Bir sayı sıfıra bölünemez . Lütfen başka değer kullanınız .");
                break;
            default:
                System.out.println("İyi Günler.");
        }
    }
}