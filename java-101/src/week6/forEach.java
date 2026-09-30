package week6;

public class forEach {
    public static void main(String[] args) {

        //ForEach döngüsünün yapısı
        //for(veritipi degisken: diziAdi){
        //      kod blogu
        //{


        String[] arabalar = {"BMW","MERCEDES", "FORD" , "FERRARİ"};
        for(String i: arabalar){
            System.out.println(i);
        }

        int[][] matris = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
                {10,11,12}
        };

        for (int[] i : matris){
            for (int j : i){

                System.out.println(j);
            }
        }

    }
}
