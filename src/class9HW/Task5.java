package class9HW;

public class Task5 {
    public static void main(String[] args) {
        //Create an array of animals and store 5 elements into it.
        // Using 2 different loops print all elements from the array.
        String[] animals={"Lion","Girafe","Elefant","Dog","Cat"};
        for (int i = 0; i < animals.length; i++) {
            System.out.print(animals[i]+" ");

        }
        System.out.println();

        for (String animal : animals) {
            System.out.print(animal+" ");

        }
    }
}
