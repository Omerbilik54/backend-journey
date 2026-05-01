package week1.variables;

import java.util.Scanner;

public class VariablesExample {
    public static void  main(String[] args){


            //Değişkenleri oluşturdum

            int mat, fiz, kim, tur, tarih, muzik;

            Scanner scanner = new Scanner(System.in);

            System.out.println("Matematik Notunuzu Giriniz: ");

            mat = scanner.nextInt();



            System.out.println("Fizik Notunuzu Giriniz: ");

            fiz = scanner.nextInt();



            System.out.println("Kimya Notunuzu Giriniz: ");

            kim = scanner.nextInt();



            System.out.println("Türkçe Notunuzu Giriniz: ");

            tur = scanner.nextInt();



            System.out.println("Tarih Notunuzu Giriniz: ");

            tarih = scanner.nextInt();



            System.out.println("Müzik Notunuzu Giriniz: ");

            muzik = scanner.nextInt();



            double ortalama = (mat + fiz + kim + tur + tarih + muzik) / 6;

            System.out.println("Ortalamanız : " + ortalama);

            String str = (ortalama >= 60) ? "Geçti" : "Kaldı";

            System.out.println(str);




    }
}
