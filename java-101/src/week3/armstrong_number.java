package week3;

import java.util.Scanner;

public class armstrong_number {

        public static void main() {
            Scanner input = new Scanner(System.in);
            System.out.println("Lütfen bir sayı giriniz :");
            int sayi = input.nextInt();
            int temp = sayi;
            int number = sayi;
            int counter = 1;
            while(temp/10!=0){
                temp = temp/10;
                counter++;
            }
            System.out.println("Basamak sayısı :" + counter);
            int basamak =0;
            int toplam = 0;
            int i = 1;
            while(i<=counter){
                basamak = number%10;
                number = number/10;
                int k = 1;
                for(int a = 1; a <= counter;a++){
                 k *= basamak;
                }
                toplam += k;
                i++;
            }
            System.out.println("toplam : " + toplam);
            if(toplam == sayi){
                System.out.println(sayi+" sayısı armstrong sayıdır.");
            }else{
                System.out.println(sayi + " sayısı armstrong sayı DEĞİLDİR.");
            }
    }
}
