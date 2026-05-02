package week2.kosullu_ifadeler;

import java.util.Scanner;

public class paswwords {
    public static void main() {
        String userName, password, select, newPassword, sifre = "12345", kullaniciAdi = "omer";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Şifrenizi giriniz : ");
        password = scanner.nextLine();
        System.out.println("Kullanıcı adınızı giriniz : ");
        userName = scanner.nextLine();

        if (userName.equals(kullaniciAdi) && password.equals(sifre)) {
            System.out.println("Kullanıcı adı ve şifre doğru . Hoşgeldiniz");
        } else
            System.out.println("Kullanıcı adınız veya şifreniz yanlış . Şifrenizi sıfırlamak ister misiniz ?");

        select = scanner.nextLine();
        if (select.equals("evet")) {
            System.out.println("Lütfen yeni şifrenizi giriniz: ");
            newPassword = scanner.nextLine();
            if (newPassword.equals(sifre)) {

                System.out.println("Yeni şifreniz eski şifrenizle aynı olamaz . Başka şifre deneyin .");
            } else {
                sifre = newPassword;
                System.out.println("Yeni şifreniz : " + sifre);
            }
        } else if (select.equals("hayır")) {
            System.out.println("Daha sonra şifre değiştirme işleminizi gerçekleştirmenizi bekliyoruz .");
        } else
            System.out.println("İyi Günler");
    }
}




