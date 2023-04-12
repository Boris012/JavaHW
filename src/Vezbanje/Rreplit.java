package Vezbanje;

import java.util.Scanner;

public class Rreplit {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Are you thirsty?");
        boolean thirsty=scan.nextBoolean();

        System.out.println("Are you sleepy?");
        boolean sleepy=scan.nextBoolean();

        if (thirsty && !sleepy){
            System.out.println("drink water");
        }else if (thirsty && sleepy){
            System.out.println("drink coffe");
        }else if (!thirsty && !sleepy){
            System.out.println("drink tea");
        }else{
            System.out.println("nothing");
        }
    }
}
