package week4;

import java.util.Scanner;

public class recursive_desen {
    static int sıra(int number, int result){
        System.out.print(result + " ");

        if (result <= 0){
            while (result!=number){
                result += 5;
                System.out.print(result + " ");
            }
            return result;
        }
        return  sıra(number,result-5);

    }
    public static void main(String[] args) {
        System.out.print("Çıktısı : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int result = number;
        int sonuc = sıra(number,result);

    }
}
