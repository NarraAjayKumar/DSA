public class One {
    public static void main(String args[]) {
        Dog d = new Dog();
        d.walk();   

    }
}
class Animal {
    String color;
    void eat() {
        System.out.println("Eats");
    }
    void breath() {
        System.out.println("Breaths");
    }
}
class Dog extends Animal {
    void walk() {
        System.out.println("Walk");
    }
}
class Fish extends Animal {
    void swim() {
        System.out.println("Swim");
    }
}
class Bird extends Animal {
    void fly() {
        System.out.println("Fly");
    }
}