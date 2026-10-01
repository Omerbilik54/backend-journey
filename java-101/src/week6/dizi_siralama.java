
package week6;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class dizi_siralama {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen dizinin büyüklüğü için bir değer girin :");
        int n = scan.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i<n;i++){
            System.out.println("Dizinin " + i + ". elemanını giriniz :");
            arr[i] = scan.nextInt();
        }

        int count = 0;
        for(int i = 0; i < n ;i++){
            int sum = 0;
            for(int j = i;j<n;j++){
                sum += arr[j];
                if(sum<0){
                    count++;
                }
            }
        }
        System.out.println(count);


    }




}
