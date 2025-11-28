public class Abstractionclass {
    public static void main(String args[]) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        Chicken c = new Chicken();
        c.eat();
        c.walk();
        System.out.println(h.color);
        Breed b = new Breed(); // Animal -> Horse -> Breed

    }
}
 abstract class Animal {
    String color;
    Animal() { // constructor
        System.out.println("Animal Constructors called:");
        color = "Brown";
    }
    void eat() {
        System.out.println("Eats Anything");
    }
    abstract void walk(); // Method of Abstract class
}
class Horse extends Animal {
    Horse() {
        System.out.println("Horse Constructors called:");
    }
    void chagecolor() {
        color = "Light Brown";
    }
    void walk() {
        System.out.println("Walk with four legs");
    }
}
class Breed extends Horse {
    Breed() {
    System.out.println("Horse Constructors called:");
    }
}
class Chicken extends Animal {
    void chagecolor() {
        color = "Yellow";
    }
    void walk() {
        System.out.println("Walk with two legs");
    }
}