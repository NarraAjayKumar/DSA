public class One {
    public static void main(String[] args) {
        Fish f = new Fish();
        f.eat();

    }
}

class Animal {
    String color;
    void eat() {
        System.out.println("Eats");
    }
    void breath() {
        System.out.println("Breathing");
    }
}

class Fish extends Animal {
    int wings;
    void swim() {
        System.out.println("Swims in water");
    }
}
// Note - This is single level Inheritance
