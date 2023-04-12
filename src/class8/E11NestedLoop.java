package class8;

public class E11NestedLoop {
    public static void main(String[] args) {

        /*

        2 4 6 8 10
        2 4 6 8 10
        2 4 6 8 10
        2 4 6 8 10

         */
        /*for (int i = 0; i < 4; i ++) {
           int j=2;
           while(j<=10){
               System.out.print(j+" ");
               j+=2;
           }

*/


         int counter=0;
                while(counter<4){
        for (int i = 2; i <=10 ; i=i+2) {
            System.out.print(i+" ");

                }
        System.out.println();
        counter++;

        }
    }
}