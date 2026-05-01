package week1.variables;

import java.util.Scanner;

public class area_of_the_circle {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        double r , merkez_olcu ,alan , pi=3.14;
        System.out.println("Dairenin yarıçapını giriniz : ");
        r = scanner.nextDouble();
        System.out.println("Dairenin merkez açı ölçüsünü giriniz : ");
        merkez_olcu = scanner.nextDouble();
        alan = (pi*(r*r)*merkez_olcu)/360;
        System.out.println("Dairenin alanı : " + alan);
    }
}
