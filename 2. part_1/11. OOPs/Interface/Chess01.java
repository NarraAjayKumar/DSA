public class Chess01 {
    public static void main(String args[]) {
        Queen q = new Queen();
        q.moves();

    }
}
interface Chessplayer {
    void moves();  // by default final,public and static
}
    class Queen implements Chessplayer {
    public void moves() {
        System.out.println("Move left,Right,Up,Down,Diagonal (All sides)");
    }
    
    class Rook implements Chessplayer {
        public void moves() {
            System.out.println("Move UP,Down,Left,Right");
        }
    }
    class King implements Chessplayer {
        public void moves() {
            System.out.println("Move up,Down,Left,Right,Diagonal-(In one step)");
        }
    }
}