public class Creation01 {
    public static void main(String args[]) {
        Pen p1 = new Pen();// create obj
        p1.setcolor("Blue"); 
        p1.settip(5);
        System.out.println(p1.color +" " +"and" + " " +p1.tip);

    }
}
    class Pen {
        String color;
        int tip;
    
    void setcolor(String new_color) {
        color = new_color;
    }
    void settip(int new_tip) {
        tip = new_tip; 
    }
}


    
    

