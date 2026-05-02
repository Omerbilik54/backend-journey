package week1.variables;

import java.util.Scanner;

public class grocery_store_cash_register {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double armutkil, armut = 2.14 , elma= 3.67 , elmakil , domat=1.11 , domatkil=0 ,muz=0.95 ,muzkil , patlı=5 ,patlıkil,total;
        System.out.println("Armut kaç kilo : ");
        armutkil = scanner.nextDouble();
        System.out.println("Elma kaç kilo : ");
        elmakil= scanner.nextDouble();
        System.out.println("Domates kaç kilo : ");
        domatkil = scanner.nextDouble();
        System.out.println("Muz kaç kilo : ");
        muzkil = scanner.nextDouble();
        System.out.println("Patlıcan kaç kilo : ");
        patlıkil = scanner.nextDouble();
        total=armut*armutkil + elmakil*elma + domatkil*domat + muz*muzkil + patlı*patlıkil;
        System.out.println("Toplam : " + total);

    }
}





