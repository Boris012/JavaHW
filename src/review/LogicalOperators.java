package review;

public class LogicalOperators {
    public static void main(String[] args) {
        boolean loginButtonDisplayed=true;
        boolean loginClickable=true;

        if(loginButtonDisplayed && loginClickable ) {
            System.out.println("Tast passed");
        }else {
            System.out.println("Test failed");
        }

        boolean pictureDisplayed=true;
        String accountName="Syntax";

        if (pictureDisplayed || accountName.equals("Syntax")){
            System.out.println("Login was sucessful");
        }else {
            System.out.println("User was not able to login");
        }


        boolean hungry=!true;
        System.out.println(hungry);

        boolean cold=false;
        System.out.println(!cold);

        String str="Hello";

        if(!str.equals("Hello")) {
            System.out.println("Value of the string is NOT hello");
        }

        boolean confirmSelected=false;

        if(!confirmSelected){
            System.out.println("Lets click on confirm checkbox");
        }
        System.out.println("Click on Pay button");






    }
}
