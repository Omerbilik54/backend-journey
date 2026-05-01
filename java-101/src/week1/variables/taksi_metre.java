package week1.variables;

import java.util.Scanner;

public class taksi_metre {
    public static void main(String[] args) {
        double mesafe , taksimetre=2.20,acilis_ucreti=10 ,ucret;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gidilecek mesafeyi yazınız : ");
        mesafe = scanner.nextDouble();

        ucret = ((mesafe*taksimetre+acilis_ucreti)<20) ? 20 : (taksimetre*mesafe+acilis_ucreti);
        System.out.println("Taksimetre ücretiniz : " + ucret);

    }
}
