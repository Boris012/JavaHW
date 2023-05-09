package class14;

public class E7 {

    //prvi zadatak
    void printLarger(int num1, int num2){
        if(num1>num2){
            System.out.println(num1);
        }else{
            System.out.println(num2);
        }
        //System.out.println(Math.max(a, b));
    }

    public static void main(String[] args) {
        E7 e7=new E7();
        e7.printLarger(10,30);
    }
}
