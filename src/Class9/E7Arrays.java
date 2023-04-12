package Class9;

public class E7Arrays {
    public static void main(String[] args) {

        int[] nums = {10, 50, 60, 45, 100};
        {
            for (int i = 0; i < nums.length; i++) {    // i+=2
                if (i % 2 == 1) //i%2!=0
                {
                    System.out.println(nums[i]);
                }

            }
        }
    }

}