package class13;

public class Math {
    void add(int num1, int num2 ){
        System.out.println(num1+num2);
    }
    // defining a method
    void multiply(int num1, int num2 ) {
        System.out.println(num1 * num2);
    }

    public static void main(String[] args) {
        // creating the object of Math class calling it math/a

        Math a=new Math();
        // calling the method add and passing two values
        a.add(10,10);
        a.multiply(5,5);
    }
}
