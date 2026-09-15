package week4;

import java.util.Scanner;

public class asal_sayı_bulma {

    static int asal(int number,int count){
        int result = 1;
        if (number < 2 ){
            return 0;
        }
        if (count == number){
            return 1;
        }
        if(number%count ==0)
            return 0;
        result = asal(number,count+1);
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayıyı gir: ");
        int number = scanner.nextInt();
        int count = 2;
        int sonuc = asal(number,count);
        if(sonuc == 1)
            System.out.println("Asaldır");
        else
            System.out.println("Asal değildir");
    }
}
