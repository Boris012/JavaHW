package review5;

public class Task6 {
    public static void main(String[] args) {
        int num=6;   // -6 is prime number
        boolean isPrime=true;

        if(num>1){
            for(int i=2; i<num; i++){
                if (num%i==0){
                    isPrime=false;
                    break;
                }
            }
        }
        if(isPrime){
            System.out.println(num+" is a prime number");
        } else {
            System.out.println(num+" is a not prime number");
        }

    }
}
