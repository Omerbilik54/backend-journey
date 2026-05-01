package week1.variables;

import java.util.Scanner;

public class HIPOTENUS {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        double u_kenar , k_kenar , hipotenus;
        System.out.println("Uzun kenarı giriniz : ");
        u_kenar = scanner.nextDouble();
        System.out.println("Kısa kenarı giriniz");
        k_kenar = scanner.nextDouble();

        hipotenus = Math.sqrt(u_kenar*u_kenar+k_kenar*k_kenar) ;

        System.out.println("Hipotenüs'ün uzunluğu : " + hipotenus);
    }
}
