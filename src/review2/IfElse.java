package review2;

public class IfElse {
    public static void main(String[] args) {
        int age=18;

        if (age>=18) {
            System.out.println("you can get dl");
        }else {
            System.out.println("you cant get dl");
        }

        System.out.println(".......");


        String expected="Best sellers";
        if(expected.equals("Best Sellers")) {
            System.out.println("Test Passes");
        }else {
            System.out.println("Test falls");
        }

    }
}
