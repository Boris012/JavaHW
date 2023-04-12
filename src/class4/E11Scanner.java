package class4;

import java.util.Scanner;

public class E11Scanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Napisi recenicu");

        /*
        if we want to take a complite line from the user we should use nextline method
         */
        String sentence=scanner.nextLine();
        System.out.println(sentence);
    }

}
