package class11;

public class E1D2Arrays {
    public static void main(String[] args) {
    int [][] arr= {
            {10, 20, 30, 40, 50,},
            {1, 2, 3, 4, 5},
            {5, 5, 5, 5, 5},
            {10, 8, 6, 4, 2}

    };
    /// print only odd numbers from this 2d array using loops

        // arr[i] => gives me the array at specific index by i
        // int [] innerArray=arr[i];=> innerArray.length
        for (int row = 0; row < arr.length; row++) {
            System.out.println();
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col]%2==1)
                System.out.print(arr[row][col]);

            }
               // for (int[] arr1D:arr2D) {
            //  for(int num:arr1D){
            // System.out.println(num);
            // }
        }

    }
}