package week2.kosullu_ifadeler;

import java.util.Scanner;

public class leap_year_calculator {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hesaplamak istediğiniz yılı giriniz : ");
        int tarih = scanner.nextInt();

        switch (tarih%4){
            case 0:
                if(tarih%400==0){
                    System.out.println(tarih + " bir artık yıldır !");
                }else{
                    System.out.println(tarih + " bir artık yıl değildir");
                }
                break;
            default:
                System.out.println(tarih + " bir artık yıl değildir.");
        }
    }

}
