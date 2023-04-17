package class9HW;

public class Task7 {
    public static void main(String[] args) {
        //From an array of integer elements find the largest number.
        int[] numbers={101,204,23,77,300};

        int largest=numbers[3];
        for(int num:numbers){
            if (num>largest){
                largest=num;
            }
        }
        System.out.println(largest);
    }
}
