package class10HW;

public class Task5 {
    public static void main(String[] args) {
        //Create a 2D array or integer type where you will store odd and even numbers in 3 rows and 4 columns.
        // Develop a program which will identify/print the even numbers only.
        int[][] numbers = {
                {10, 21, 30, 45},
                {20, 50, 65, 20},
                {102, 54, 60,77}
        };
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if(numbers[i][j]%2==0)
                    System.out.print(numbers[i][j]+ " ");

            }

        }
    }
}
