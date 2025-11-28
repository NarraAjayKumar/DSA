public class Gettersandsetters03 {
    public static void main(String args[]) {
        Pen p1 = new Pen();
        p1.setcolor("Red");
        p1.settip(5);
        System.out.println(p1.getcolor());
        //System.out.println(p1.tip); // not give output why because it private
        System.out.println(p1.gettip());
    }
}
    class Pen {
       private String color;
       private int tip;
    
    String getcolor() {
        return this.color; // this is - current object
    }
    int gettip() {
        return this.tip;
    }
    void setcolor(String new_color) {
        this.color = new_color;
    }
    void settip(int tip) {
        this.tip = tip;
    }

}