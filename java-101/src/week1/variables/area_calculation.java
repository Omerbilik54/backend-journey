package week1.variables;

import java.util.Scanner;

public class area_calculation {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double kenar1,kenar2,kenar3, alan,cevre,u;
        System.out.println("Lütfen üçgenin 1. kenarını giriniz : ");
        kenar1 = scanner.nextDouble();
        System.out.println("Lütfen üçgenin 2. kenarını giriniz : ");
        kenar2 = scanner.nextDouble();
        System.out.println("Lütfen üçgenin 3. kenarını giriniz : ");
        kenar3 = scanner.nextDouble();

        u = (kenar1+kenar2+kenar3)/2;
        cevre = 2*u;
        alan = Math.sqrt(u*(u-kenar1)*(u-kenar2)*(u-kenar3));

        System.out.println("Üçgenin Çevresi : " + cevre);
        System.out.println("Üçgenin Alanı : "+alan);

    }
}
