package Class9;

public class E3Arrays {
    public static void main(String[] args) {
        double [] numbers={10.5, 5.5, 6.4, 100.5, 80.3, 34.5, 554, 545, 323};
        /*
        int i=4;
        System.out.println(numbers[i]);
        System.out.println();
         */
        System.out.println(numbers.length);
        // numbers.lenght gives us the total count of elements in an array

        //for (int j=0; j<=4;j++){
        for (int j=0; j<numbers.length;j++){
            System.out.print(numbers[j]+ " ");  //[j]+" "}; for one line print
        }





    }
}
