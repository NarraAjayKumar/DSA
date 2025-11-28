public class One {
    public static void main(String args[]) {
        Fish f = new Fish();
        f.swim();
        Tuna t = new Tuna();
        t.swim();

    }
}
class Animal {
    String color;
    void eat() {
        System.out.println("Eating");
    }
    void breath() {
        System.out.println("Breathing");
    }
}
class Fish extends Animal {
    void swim() {
        System.out.println("Swim");
    }
}
class Tuna extends Fish {
    void breed() {
        System.out.println("This is the breed");
    }
    
}
class Sharp extends Fish {
    void sharp() {
        System.out.println("Sharpness");
    }
}
class Bird extends Animal {
    void fly() {
        System.out.println("Bird is Flying");
    }
}
class Peacock extends Bird {
    void fly() {
        System.out.println("Small height Flying");
    }
}
class Mammal extends Animal {
    void parts() {
        System.out.println("Body inside parts");
    }
}
class Dog extends Mammal {
    void walk() {
        System.out.println("Dog can Walk");
    }
}
class Cat extends Mammal {
    void speak() {
        System.out.println("meow");
    }
}
class Cow extends Mammal {
    void milk() {
        System.out.println("Gives Milk");
    }
}