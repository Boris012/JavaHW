package class10HW;

public class Task3 {
    public static void main(String[] args) {
        //Using 2D array create a grocery list.
        //Inside you should have an array of veggies, fruits, dairy and sweets.
        // Retrieve all values from that array using 2 different loops
        String[][] grocery = {
                {"Potato", "Carrots", "Tomato", "Cucumber"},
                {"Apples", "Bananas", "Ananas", "Plums"},
                {"Milk", "Cheese", "Butter", "Eggs"},
                {"Chocolate", "Cookies", "Cake", "Candy",}
        };
        for (int i = 0; i < grocery.length; i++) {
            for (int j = 0; j < grocery.length; j++) {
                System.out.print(grocery[i][j]+" ");

            }
            System.out.println();

        }
        System.out.println(888888888);
        for (String[] shop:grocery){
            for(String list:shop){
                System.out.print(list+" ");
            }
            System.out.println();
        }
    }
}
