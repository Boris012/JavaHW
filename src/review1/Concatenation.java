package review1;

public class Concatenation {
    public static void main(String[] args) {

        int date=23;
        String month ="March";

        /*
        = -> assignment operator
        + -> concatenation operator
         */
        System.out.println(month+" "+date);

        String domain="syntax";

        //Hello from syntax
        System.out.println("Hello from "+domain);

        String fruit="apple";
        double price=2.99;
        char sign='$';
        // the price of an apple is $2.99
        System.out.println("The price of an "+fruit+" is "+sign+price);

        String num="10";
        String num2="20";
        // just added number 1020, its not 30, becouse we need int

        System.out.println(num+num2);

    }
}
