
public class practiceoops_1 {
    public static void main(String[] args){
        Student s=new Student();
        s.marks=25;
        System.out.println(s.marks);
        s.name="suman";
        System.out.println(s.name);
    }
}
class Student{
    String name;
    int marks;
    void name(String name){
      this.name=name;
      
    }
    void marks(int marks){
        this.marks=marks;
    }
}
