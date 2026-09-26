package week5.sınıf_tanımları;

class Car {
    // Nitelikler
    String type;
    String model;
    String color;
    int speed;
    int speedLimit = 180;

    void increaseSpeed(int increment) {
        int a = 5;
        if ((speed + increment) < speedLimit) {
            speed += increment;
        }
    }

    void decreaseSpeed(int decrease) {
        if (speed > 0) {
            speed -= decrease;
        }
    }

    void printSpeed(){
        System.out.println("Hızınız : " + speed);
    }

}