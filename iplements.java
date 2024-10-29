public class iplements {
    public static void main(String[] args) {
        queen q=new queen();
        q.moves();
        q.call();
    }
}
interface chessplayer{
    void moves();
    }
}
class queen implements chessplayer{
    public void moves(){
 System.out.println("move a queen");
    }
    public void call(){
        System.out.println("call");
    }
}
class horse implements chessplayer{
    public void moves(){
        System.out.println("horse move");
    }
}
