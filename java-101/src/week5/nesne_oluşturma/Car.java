package week5.nesne_oluşturma;

public class Car {
    String type ;
    String model;
    String color;
    int speed;

    void increaseSpeed(int increment){
        speed += increment;
    }

    void decreaseSpeed(int decrease){
        speed -= decrease;
    }

    void printSpeed(){
        System.out.println(model + " aracınızın hızı : " + speed);
    }
}
