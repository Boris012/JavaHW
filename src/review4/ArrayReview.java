package review4;

public class ArrayReview {
    public static void main(String[] args) {
        //big counternier
        int i=10;
        int[] arr=new int[3];
        // we store elements based on indexes
        arr[0]=10;
        arr[1]=11;
        // arr[2]=12;


        for(int a:arr){

            System.out.println(a);
        }
        System.out.println();
        //acces also by indexes
        System.out.println(arr[2]);
        String[] planets={"Earth", "Mars", "Jupiter", "Saturn", "Neptun"};
        System.out.println("Enhanced for loop");   //advanced of loop
        // enhanceed for loop is used ONLY with arrays and (:) collections
        for(String planet:planets){
            System.out.println(planet);
        }

       // System.out.println(planets[0]);
        // System.out.println(planets[1]);
        // System.out.println(planets[2]);
        for (int j = 0; j < planets.length; j++) {
            System.out.print(planets[j]+" ");
        }




    }
}
