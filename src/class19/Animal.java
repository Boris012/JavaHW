package class19;

public class Animal {

    // create 3 class like Dog Cat Horse define 5 properties(use default access level) in each class
    //you can use inheritance to avoid code duplication
    // and one printinfo method that will print the values of these variables.
    //create constructors as well in each child class to initialize those
    // properties create one object of each class and call the printInfo method
    String name;
    String color;
    String bread;
    int age;
    double weight;
    public Animal(String name, String color, String bread, int age, double weight) {
        this.name = name;
        this.color = color;
        this.bread = bread;
        this.age = age;
        this.weight = weight;
    }
    void printInfo(){
        System.out.println(name+" "+color+" "+bread+" "+age+" "+weight);
    }



}

class Dog extends Animal {
    double price;
    public Dog(String name, String color, String bread, int age, double weight, double price) {
        super(name, color, bread, age, weight);
        this.price=price; // assigning the price
    }
    void printInfo(){
        super.printInfo();
        System.out.println(price);
    }
}
class Cat extends Animal {
    public Cat(String name, String color, String bread, int age, double weight) {
        super(name, color, bread, age, weight);
    }
}
class Horse extends Animal {

    public Horse(String name, String color, String bread, int age, double weight) {
        super(name, color, bread, age, weight);
    }
}
class AnimalTester {
    public static void main(String[] args) {
        Dog dog = new Dog("Tom", "Black", "persian", 10, 20, 2000);
        dog.printInfo();
}
}