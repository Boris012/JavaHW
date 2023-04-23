package review5;

public class Task4 {
    public static void main(String[] args) {
        int[][] array = {{12, -12, 67, 57}, {45, 2, 4}, {56, 2}, {67, 43, 11, 13}};
        int sumOdd = 0;
        int sumEven = 0;
        int number;

        for (int r = 0; r < array.length; r++) {
            for (int c = 0; c < array[r].length; c++) {
                if (array[r][c] % 2 == 0) {
                    number = array[r][c];
                    if(number%2==0){
                        sumEven+=number;
                    }else {
                        sumOdd+=number;
                    }
                }
            }


        }System.out.println("Sum of even = "+sumEven);
        System.out.println("Sum of odd = "+sumOdd);
    }
}
