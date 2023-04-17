package class9HW;

public class Task6 {
    public static void main(String[] args) {
        //Create an array on integers and calculate the sum of all elements in an array
        int sum = 0;
        int[] numbers = {1, 23, 43, 44, 54, 6};

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];


        }
        System.out.println(sum);
    }

}