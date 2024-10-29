public class method_overloding {
    public static void main(String[] args) {
        calculator calt=new calculator();
    calt.call(10,12);
   
    System.out.println( calt.sum(1.2, 1.5));
    goat g=new goat();
    g.eat();
    
    }
}
class calculator{
    int sum;
    void call(int a, int b){
         a=10;
         b=12;
    sum=a+b;
    System.out.println(sum);
    }
    double sum(double x, double y){
        return x + y;
    }
}
class animal{
    void eat(){
        System.out.println("eats anythings");
    }
}
class goat extends animal{
    void eat(){
        System.out.println("eats grass");
    }
}