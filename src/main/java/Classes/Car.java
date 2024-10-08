package Classes;

public class Car {
    String mark;
    String model;
    String Color;
    int speed;

    void run(){
        System.out.println(mark + "running");
    }
    void stop(){
        System.out.println(mark + "stop");
    }
    void increaseSpeed(int increament){
        speed += increament;
        System.out.println(mark + "car is speed" + increament);
    }
}
