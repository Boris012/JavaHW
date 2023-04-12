package class8;

import java.util.Scanner;

public class E2WhileLoop {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter number");
        int number=scanner.nextInt();

        while(number!=-1){
            System.out.println("try again");
            System.out.println("please enter number");  //moze i bez ovog
            number=scanner.nextInt();

        }
    }
}
