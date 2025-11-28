public class Substring07 {
    public static String substring(String str, int st, int ei) {
        String substring = "";
        for(int i = st; i<ei; i++) {
            substring+=str.charAt(i);
        }
        return substring;
    }
    public static void main(String args[]) {
        String str = "Hello World";
        String result = substring(str,0,5);
        System.out.println(result);
    }
}