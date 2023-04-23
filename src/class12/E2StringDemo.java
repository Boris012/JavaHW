package class12;

import java.util.SortedMap;

public class E2StringDemo {
    public static void main(String[] args) {
        String userName="admin";
        String password="pas123";

        //write code to check the username and pasward if the userName and
        // passward ale less than 8 characters this msg "Signup successful"
        // otherwise print "UserName and password cant be more than 8 caracters

        if (userName.length()>8 && password.length()>8 ){
            System.out.println("UserName and password cant be more than 8 caracters");
        }else {
            System.out.println("Signup successful");

        }

    }
}
