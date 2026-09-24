package week5.nesne_oluşturma;

public class Main {

    public static void main(String[] args) {
        Car audi = new Car();//<--<-<-< Car() parçası aslında constructer . Yani sınıfın içine oluşturduğumuz constructer bu .
        audi.model = "Audi";
        audi.speed = 10;
        audi.increaseSpeed(23);
        audi.increaseSpeed(21);
        audi.printSpeed();

        Car togg = new Car();
        togg.model = "Togg";
        togg.speed = 45;
        togg.increaseSpeed(21);
        togg.increaseSpeed(43);
        togg.decreaseSpeed(12);
        togg.printSpeed();

    }
}
