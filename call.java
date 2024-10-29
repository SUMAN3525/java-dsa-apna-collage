import java.util.Scanner;
public class call {
    public static void main(String []a){
        Scanner sc=new Scanner(System.in);
        recall r=new recall();
        r.tiger();
      //r.animal();
    }
}
class recall{
    void animal(){
        System.out.println("animal");
    }
    void tiger(){
        System.out.println("tiger");
        animal();
    }
}
