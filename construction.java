public class construction {
    public static void main(String []args){
   student s1 = new student("suman");
   System.out.println(s1.name);
  // System.out.println(s1.roll);
    }
}
class student{
    String name;
    int roll;
    student( String name){
        this.name=name;
       // this.roll=roll;
    }
}