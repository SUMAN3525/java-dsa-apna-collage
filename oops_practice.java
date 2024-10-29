import java.util.Scanner;
public class oops_practice {
      public static void main(String []args){
      teacher t1=new teacher();
      t1.setname("tiklu");
      System.out.println(t1.name);
      t1.setage(22);
      System.out.println(t1.age);
      Children c1=new Children();
      c1.name="suman";
      System.out.println(c1.name);
      c1.roll=15;
      System.out.println(c1.roll);
      // Children c2=new Children("suman");
       // Children c3=new Children(12);
      Children c2=new Children(c1);
      c2.password="SYF";
      System.out.println(c2.password);
      Scanner sc=new Scanner(System.in);
      for(int i=0; i<3; i++){
      c1.marks[i]=sc.nextInt();
      }
      
      for(int i=0; i<3; i++){
        System.out.println(c1.marks[i]);
      }
    }
          }
class teacher{
    public String name;
   public int age;
    void setname(String newname){
      name=newname;
    }
    void setage(int newage){
      age =newage;
    }
}
class Children{
  String name;
  int roll;
  String password;
  int marks[];
  Children(Children c1){
    marks=new int[3];
    this.name=c1.name;
    this.roll=c1.roll;
  }
  Children(){
    marks=new int[3];
    System.out.println("constructor is called");
  }
  Children(String name){
    marks=new int[3];
    this.name=name;
  }
  Children(int roll){
    marks=new int[3];
  this.roll=roll;
  }
}