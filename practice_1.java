import java.util.Scanner;
public class practice_1 {
    public static void main(String []args){
     Scanner sc=new Scanner(System.in);
     int r1=sc.nextInt();
     int r2=sc.nextInt();
     int i1=sc.nextInt();
     int i2=sc.nextInt();
     Sum c=new Sum();
     c.real(r1,r2);
     c.img(i1,i2);
     Multiply m=new Multiply();
     m.realim(r1,r2,i1,i2);
     m.imgim(r1,r2,i1,i2);
     Diff d= new Diff();
     d.realdip(r1,i1);
     d.imgdip(r2,i2);
    }
}
class Sum{
   void real(int r1, int r2){
     System.out.print(r1+r2+" ");
   }
  
   void img(int i1, int i2){
    System.out.print((i1+i2)+"i");
    System.out.println();
   }
    }
class Multiply {
    void realim(int r1, int r2, int i1, int i2){
        System.out.print((r1*r2)-(i1*i2)+" ");
    }
    void imgim(int r1, int r2, int i1, int i2){
        System.out.print(((r1*i2)+(r2*i1))+"i");
        System.out.println();
    }
}
 class Diff{
    void realdip(int r1, int i1 ){
        System.out.print((r1-i1)+" ");
    }
    void imgdip(int r2, int i2){
     System.out.println((r2-i2)+"i");
    }
 }