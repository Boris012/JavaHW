package review6;

public class ColdStone {
    public static void main(String[] args) {
        IceCream iCream=new IceCream();
        iCream.flavor="Vanilla";
        iCream.color="White";
        iCream.dairyFree=false;
        iCream.price=2.99;
        // iCream.brand - brand variable is not defined inside the class

        iCream.eat();
        iCream.buy();

        System.out.println("   Creating 2 IceCream object    ");

        IceCream iCream2=new IceCream();
        iCream2.flavor="Pistachio";
        iCream2.color="Rose";
        iCream2.dairyFree=true;
        iCream2.price=3.99;

        iCream2.eat();
        iCream2.buy();

        // new Car(); CE: because we do not have a Car Class
        // if there is no class- we cannot create an Object

    }
}
