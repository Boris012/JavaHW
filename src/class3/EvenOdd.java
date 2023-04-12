package class3;

public class EvenOdd {
    public static void main(String[] args) {

        int num = 23;
        int remainder=num%2;

        if (remainder==0) {
            System.out.println("Number "+num+" is even");
        } else {
            System.out.println("Number "+num+" is Odd");
        }
    }
}
