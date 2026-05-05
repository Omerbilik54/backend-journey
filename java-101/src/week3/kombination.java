package week3;

import java.util.Scanner;

public class kombination {
    public static void main() {

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen kümenizin büyüklüğünü giriniz : ");
        long kume = input.nextInt();
        System.out.println("Lütfen kümenizin gruplandırma sayısını giriniz : ");
        long grup = input.nextInt();
        long combination = 1;
        int total1 = 1;
        int total2 = 1;
        int total3 = 1;
        long kume_factoriyal = 1;
        long grup_factoriyal = 1;
        long kume_grup_factoriyal = 1;
        for (int i = 1; i <= kume; i++) {
            kume_factoriyal *= i;
        }
        for (int i = 1; i <= grup; i++) {
            grup_factoriyal *= i;
        }
        for (int i = 1; i <= (kume - grup); i++) {
            kume_grup_factoriyal *= i;
        }
        combination = kume_factoriyal / (grup_factoriyal * kume_grup_factoriyal);
        System.out.println(combination);
    }
}
