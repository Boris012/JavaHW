package review5;

public class TwoDArray {
    public static void main(String[] args) {
        String [][] cars={
                {"Ford"," Lincoln", "Dodge"},// index 0
                {"BMW"," Audi", "Mercedes","VW", "Fiat"},// index 1
                {"Honda"," Toyota", "Subaru", "Nissan"}// index 2
        };
        System.out.println(cars[1][1]);
        for(String[]  garage:cars){
            for(String car:garage){
                System.out.print(car +" ");
            }
        }
    }
}
