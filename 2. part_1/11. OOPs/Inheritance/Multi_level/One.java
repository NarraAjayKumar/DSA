public class One {
    public static void main(String args[]) {
        Dog b = new Dog();
        b.eat();
        b.legs = 12;
        System.out.println(b.legs);

    }
}
class Animal {
    String eat;
    void eat() {
        System.out.println("I am eating");
    }
    void breath() {
        System.out.println("I am breathing");
    }
}
class Mammal extends Animal {
    int legs;

} 
class Dog extends Mammal {
    String breed;
}