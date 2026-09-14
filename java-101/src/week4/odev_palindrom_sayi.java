package week4;

public class odev_palindrom_sayi {

    static boolean isPalindrom(int number){
        int temp = number , reverseNumber = 0 , lastNumber = 0;
        while(temp!=0){
            //System.out.println("==========");
            //System.out.println("Sayı => " + temp);
            lastNumber = temp % 10;
            //System.out.println("Son basamak => " + lastNumber);;
            reverseNumber = (reverseNumber*10) + lastNumber;
            //System.out.println("Yeni Sayı => " + reverseNumber);
            temp /= 10;
            //System.out.println("Yeni Temp => " + temp);
        }
        if(number == reverseNumber)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrom(6333336));
    }
}






//        Palindrom sayı, baştan ve sondan okunuşu aynı olan sayılara denir.
//
//        Örnekler:
//
//        121 (Tersi de 121)
//
//        55 (Tersi de 55)
//
//        4004 (Tersi de 4004)
//
//        98789 (Tersi de 98789)
//
//Sayıyı ters çevirdiğinizde değeri değişmiyorsa, o sayı bir palindromdur.