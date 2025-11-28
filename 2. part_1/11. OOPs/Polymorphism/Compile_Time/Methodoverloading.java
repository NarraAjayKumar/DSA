public class Methodoverloading {
    public static void main(String arg[]) {
        Calculator cal = new Calculator();
    System.out.println(cal.sum(12,12));
    System.out.println(cal.sum((float)12.5,(float)12.5)); // actually it double so that's why we converted to float
    System.out.println(cal.sum(12, 12, 12));   
    }
}
class Calculator {
    int sum(int a, int b) {
        return a + b;
    }
    float sum(float a, float b) {
        return a + b;
    }
    int sum(int a, int b, int c) {
        return a + b + c;
    }
}