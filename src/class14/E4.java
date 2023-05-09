package class14;

public class E4 {
    /*
    create method to add two int numbers and it should return the results back
    when called name of the method should be add
     */
    /*
    return type=> int
    name of the method =>add
    parameters=>(int a,int b)
    body of the method=>{
    int sum=a+b;
    return sum;
    }
     */
    int add (int a, int b){
        int sum=a+b;
        return sum;
    }

    public static void main(String[] args) {
        E4 obj=new E4();
        /*
        we are calling the "add" method on "obj" object passing two arguments
         one is 10 other is 20 and storing the results from method call into the sum variable
         */
        obj.add(10,20);                // int sum=obj.add(10,20)
        System.out.println(obj.add(10,20));     //(sum)
    }
}
