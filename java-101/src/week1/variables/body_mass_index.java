package week1.variables;

import java.util.Scanner;

public class body_mass_index {
    public static void main(String[] args) {
        double kilo,boy,result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu metre cinsinde giriniz : ");
        boy = scanner.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz : ");
        kilo = scanner.nextDouble();
        result = kilo/(boy*boy);
        System.out.println("Vücut Kitle İndexiniz : " + result);

    }
}
