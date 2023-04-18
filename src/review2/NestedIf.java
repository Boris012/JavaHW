package review2;

public class NestedIf {
    public static void main(String[] args) {

        /*
        Declare 2 variables for dl an a car
        if you have dl then i will check if you have a car
         */
        boolean driverLicense=true;
        boolean car=false;

        if (driverLicense) {
            System.out.println("lets check if you have a car");
            if (car) {
                System.out.println("you can drive to work");
            } else{
                System.out.println("you will need to take bus or uber");
            }
        }else{
            System.out.println("you should get a DL");
        }
    }
}
