package review4;

public class NestedLoops {
    public static void main(String[] args) {
        //  loop inside another loop
        for (int i = 1; i <= 3; i++) {   //outer loop controls number of complete iterations of

            System.out.print(i);

            for (int j = 0; j <= 1; j++) { //inner loop- ALWAYS depends on outer loop
                System.out.print(j);

            }

        }
        System.out.println("----------------------");

        for (int i = 1; i >= 3; i++) {

            System.out.print(i);

            for (int j = 0; j <= 1; j++) {
                System.out.print(j);
            }
        }
    }
}