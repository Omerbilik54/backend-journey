package week2.kosullu_ifadeler;

import java.util.Scanner;

public class heat {
    public static void main() {
        int heat;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sıcaklığı giriniz");
        heat = scanner.nextInt();
        if (heat < 5) {
            System.out.println("Kayak yapabilirsiniz.");
        } else if (heat >= 5 && heat <= 25) {
            if (heat >= 10 && heat <= 15) {
                System.out.println("Piknik yapabilirsiniz");
                System.out.println("Sinemaya gidebilirsiniz");
            } else if (heat >= 5 && heat <= 10) {
                System.out.println("Sinemaya gidebilirsiniz");
            } else {
                System.out.println("Piknik yapabilirsiniz");
            }
        } else
            System.out.println("Yüzmeye gidebilirsiniz");
    }
}
