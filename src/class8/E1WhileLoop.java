package class8;

import java.util.Scanner;

public class E1WhileLoop {
    public static void main(String[] args) {

        // to print all whole numbers from 15 to 30
        /* int a=15;
        while(a<=30) {
            System.out.println(a);
            a++;
        } */

        // write code top print all the numbers from starting point to an ending point
        //ask the user for starting , ending , and step
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the starting point, ending point and the step");
        int start=scanner.nextInt();
        int end=scanner.nextInt();
        int step=scanner.nextInt();
        int number=start;
        while(number<=end){
            System.out.print(number+" ");
            number=number+step;  //number+=step;
        }
    }
}
