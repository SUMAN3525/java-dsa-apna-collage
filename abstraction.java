public class abstraction {
    public static void main(String[] args) {
        Chicken c=new Chicken();
        c.walk();
        c.eat();
        Horse h=new Horse();
        h.walk();
        h.eat(); 
    }
}
 abstract class Animal{
    void eat(){
        System.out.println("eats anythings");
    }
    abstract void walk();
 }
 class Horse extends Animal{
     void walk(){
        System.out.println("walk in 4 legs");
     }
 }
 class Chicken extends Animal{
    void walk(){
        System.out.println("walk in 2 legs");
    }
 }