package class5;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class E2If {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("is it time for break true/false");
        boolean isBreak=input.nextBoolean();


        if (isBreak){
            System.out.println("lets have a break");

        }else {
            System.out.println("Lets study");
        }
    }
}
