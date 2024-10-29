public class oops {
    public static void main(String []args){
       Pen p1=new Pen();
       p1.setColor("blue");
       System.out.println(p1.color);
       p1.setTip(5);
       System.out.println(p1.tip);
       p1.setColor("Yellow");
       System.out.println(p1.color);
       BankAccount myAcc=new BankAccount();
       myAcc.username="sumanrowl";
       myAcc.setpassword("aaadd");
       System.out.println(myAcc.username);
       //System.out.println(myAcc.password);
      pencil p2=new pencil();
      p2.setcolor("Red");
      System.out.println(p2.getcolor());
      p2.setcolor ("silver");
       System.out.println(p2.getcolor());
       p2.settip(5);
       System.out.println(p2.getTip());
    }
}
class BankAccount {
    public String username;
    private String password;
     void setpassword(String pwd){
        password=pwd;
    }
}
class Pen{
    String color;
    int tip;
    void setColor(String newColor){
        color= newColor;
    }
    void setTip(int newTip){
        tip= newTip;
    }
}
class Student{
    String name;
    int age;
    float percentage;
    void calcPercentage(int phy, int chem, int math){
        percentage =(phy + chem + math)/3;
    }
}

class pencil{
    private String color;
    private int tip;
    String getcolor(){
        return this.color;
    }
    int getTip(){
       return this.tip;
    }
    void setcolor( String newColor){
     this.color=newColor;
    }
    void settip(int newTip){
        this.tip=newTip;
    }
}