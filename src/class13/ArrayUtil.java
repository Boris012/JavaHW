package class13;

public class ArrayUtil {
    public static void main(String[] args) {
        // write logic to search if the number is present in the array or not
        int[] arr={10,20,45,89};
        int[] arr1={102,203,445,889};
        int[] arr2={2,3,44,88};

        int number=89;
        int number1=10;
        int number2=20;
        //for (int i = 0; i < arr.length; i++) {
            //if (arr[i] == number) {
               // System.out.println("Yes");

        ArrayUtil ivana=new ArrayUtil();
        ivana.searchArray(arr, number);
        ivana.searchArray(arr1, number1);
        ivana.searchArray(arr2, number2);


            }
            void searchArray(int[] arr, int number){
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] == number) {
                        System.out.println("Yes");
                        break;

                    }


                }
    }
}
