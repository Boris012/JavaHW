package class12;

public class CarTester {
    public static void main(String[] args) {


        // beloww code will create an object of car class

        Car car = new Car();
        car.make = "Toyota";
        car.model = "Corolla";
        car.color = "Grey";
        car.mileage = 0;
        car.isAutomatic = true;
        car.stopCar();
        car.turn();
        car.playHorn();

        //Car car1=new Car();
        //car1.make="Tesla";



    }
}
