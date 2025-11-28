public class Multipleclass02 {
    public static void main(String args[]) {
        Bear b = new Bear();
        b.eat();

    }
}
interface Herbivore {
 default void eat() {
    System.out.println("eat grass");
  }
}
interface Carnivore {
    default void eat() {
        System.out.println("eat meet");
    }
}
class Bear implements Herbivore,Carnivore {
    public void eat() {
        System.out.println("Bear eat both");
    }
    

}