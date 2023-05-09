package class18;

public class A {

    static void printF(){
        System.out.println("printF.........");
    }

}
class B extends A{

}
class C extends B{
    public static void main(String[] args) {
        A.printF();
    }

}
