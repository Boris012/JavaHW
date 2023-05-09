package class14;

/*
    Write code that will take in a String input and check to see if it is a palindrome or not.

    A palindrome means that the characters are the same forwards and backwards, ignoring spaces.
     */
// examples :level madam kayak ana

public class Task1 {

    //car => rac Madam => madaM
    boolean isPalindrome(String str){
        //String lowerCaseStr=str.toLowerCase();

        String reversedStr="";
        for (int i = str.length()-1 ; i >=0 ; i--) {
            reversedStr=reversedStr+str.charAt(i);

        }
        boolean isStrPalindrome=false;
        if(str.equalsIgnoreCase(reversedStr)){
            isStrPalindrome=true;

        }
        return isStrPalindrome;
    }

    //boolean isPalindromeSB(String str){
        //return new StringBuilder(str).reverse().toString().equalsIgnoreCase(str);

    public static void main(String[] args) {
        Task1 task1=new Task1();
        boolean result=task1.isPalindrome("Madam");
        System.out.println(result);
    }
}
