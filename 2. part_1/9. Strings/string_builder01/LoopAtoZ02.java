public class LoopAtoZ02 {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder();
        for(char ch = 'A'; ch<='Z'; ch++) {
            sb.append(ch).append(" ");
        }
        System.out.println(sb);
    }

}