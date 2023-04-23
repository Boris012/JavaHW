package class13;

public class Task2 {
    public static void main(String[] args) {
        String str123= "Asghar is the best teacher ever. but his classes are so hard.    we need more time ";
        System.out.println(str123.replace(" ",""));
        /*
        Create a String that should be combination of letters,
        numbers and special characters. Find out how many Alphabetic(abd AZ)
        characters are there in the String.
         */

        String str="mksdmsnKNKNNKNKLn124432&*%$^%";
        //System.out.println(str.replaceAll("[^a-zA-Z]","").length());
        String str1=str.replaceAll("[^a-zA-Z]","");
        System.out.println(str1);
        System.out.println(str1.length());

    }
}
