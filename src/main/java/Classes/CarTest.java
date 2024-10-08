package Classes;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car();
        Car car2 = new Car();

        car.mark = "Toyota";
        car.model = "CHR" ;
        car.Color = "red" ;

        car2.mark = "Mercedes";
        car2.model = "A1" ;
        car2.Color = "black" ;

        car.run();
        car.increaseSpeed(100);
        car.stop();

        car2.run();
        car2.increaseSpeed(100);
        car2.stop();
    }
}
