public class static_keyword {
    public static void main(String []a){
      students s1=new students();
     s1.name="kv";
    
     students s2=new students();
     System.out.println(s2.name);
     students s3=new students();
     s3.name="abc";
    
    }
}
class students{
    String name;
    int roll;
    static String Schoolname;
    void setname(String name){
        this.name=name;
    }
    String getname(){
        return this.name;
    }
    }

