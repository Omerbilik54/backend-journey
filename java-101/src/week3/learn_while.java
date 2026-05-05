package week3;

import java.util.Scanner;

public class learn_while {
    public static void main() {
        int i = 1;
        while (i<=5){
            System.out.println(i);
            i++;
        }

        //-----------------------------------


        int left = 100, rigth = 200;
        while (++left < --rigth) {
            System.out.println("100 ile 200'ün ortası " + left);
        }

        //------------------------------------


        Scanner scanner = new Scanner(System.in);
        String customerPassword = "12345";
        boolean passwordSuccesful = false;

        while (!passwordSuccesful) {
            System.out.println("Hesap şifrenizi giriniz : ");
            String typePassword = scanner.next();

            if (customerPassword.contentEquals(typePassword)) {
                passwordSuccesful = true;
                System.out.println("Sisteme başarılı giriş yaptınız!");
            }
        }


        //------------------------------------


        Scanner scanner1= new Scanner(System.in);
        int sayi;

        for(boolean run = true ; run;){
            System.out.println("Sayı giriniz : ");
            sayi = scanner1.nextInt();
            if(sayi < 0){
                run = false;
            }
        }

        //-----------------------------------
        //Üstteki for'un aynısı


        do {
            System.out.println("Sayı giriniz : ");
            sayi=scanner1.nextInt();
        }while (sayi<0);


        //-----------------------------------
        //Üstteki for'un aynısı

        System.out.println("Sayı giriniz : ");
        sayi = scanner1.nextInt();

        while (sayi>0){
            System.out.println("Sayı giriniz : ");
            sayi = scanner1.nextInt();
        }

        //-----------------------------------

        int a = 1;
        while (a<=10){
            i++;
            if (a%2==0) {
                continue;
            }
            System.out.println(a);
        }




























    }
}
