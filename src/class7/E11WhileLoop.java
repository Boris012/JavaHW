package class7;

public class E11WhileLoop {
    public static void main(String[] args) {

        /*
        numbers 100 to 1
        even 20 to 10
        add 100 to 1
        */


        int a=100;
        while(a>0) {
            System.out.print(a+ " ");
            a--;

        }
        // assingnig a new value to the counter for next loop
        a=20;
        System.out.println();
        while(a<=100) {

            System.out.print(a+ " ");
            a+=2;
        }
        a=100;
        System.out.println();
        while(a>=1) {
            if(a%2==1) {  //its as as a%2!=0
                System.out.print(a+ " ");
            }
            a--;
        }


    }
}
