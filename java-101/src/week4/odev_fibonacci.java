package week4;

public class odev_fibonacci {

    static int fib(int n ){
        if(n==1 || n==2){
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }


    public static void main(String[] args) {
        System.out.println(fib(5));
    }
}
//        Fibonacci dizisi, her sayının kendisinden önceki iki sayının toplanmasıyla elde edildiği özel bir sayı dizisidir.
//
//Dizi genellikle 0 ve 1 ile başlar ve sonsuza kadar şu şekilde devam eder:
//
//        0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144...