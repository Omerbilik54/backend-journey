package week6;

public class Harmonik_hesaplama {
    public static void main(String[] args) {
        int[] dizi = new int[]{2, 34, 2, 1, 4, 6};
        double sum = 0;
        double avarage = 0;
        for (double i : dizi) {
            sum += 1 / i;
        }
        avarage = dizi.length / sum;
        System.out.println(avarage);
    }
}
