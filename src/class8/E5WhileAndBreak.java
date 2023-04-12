package class8;

public class E5WhileAndBreak {
    public static void main(String[] args) {
        /* create a boolea variable summer store true in it then write a loop
         that runs as long as it is summer create a temp variable store 85
        inside the loop check the temp if it is less than 100 print "its good i enjoy summer"
        as soon as temperature exceeds 100 print "its very hot" and break the loop with break keyword

        */
        boolean summer=true;
        int temp=85;
        while(summer){
            if (temp<100){
                System.out.println("its good i enjoy summer");
            }else {
                System.out.println("its very hot");
                break;
            }
            temp=temp+3;

        }
    }
}
