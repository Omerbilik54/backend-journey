package week5.constructor_kurucu_metot;

public class Car {
    String type ;
    String model;
    String color;
    int speed;

    Car(String model, int speed, String color){
        this.model=model;
        this.speed = speed;
        this.color = color;
        this.type = "Sedan";//niteliklere birşey eklemek istediğimizde constructo içinde eklemek daha mantıklı .
        System.out.println("Parametreli kurucu metot oluşturuldu.");
    }
    void increaseSpeed(int increment){
        speed += increment;
    }

    void decreaseSpeed(int decrease){
        speed -= decrease;
    }

    void printInfo(){
        System.out.println("Modeli " + this.model + " olan aracınızın hızı : " + this.speed);
    }



    






















}

