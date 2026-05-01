package week1.variables;

import java.util.Scanner;

public class TAX_CALCULATİON {
    static void main(String[] args) {
        System.out.println("Hoşgeldiniz");
        System.out.println("Lütfen para değerini giriniz : ");
        Scanner scanner = new Scanner(System.in);
        double para,kdv;
        para = scanner.nextDouble();
        System.out.println("Ürünün KDV'siz fiyatı : " + para);
        kdv = para*18/100;
        para+=kdv;
        System.out.println("Ürünün KDV'li fiyatı : " + para);
        System.out.println("Ürünün KDV tutarı : " + kdv);
    }
}
