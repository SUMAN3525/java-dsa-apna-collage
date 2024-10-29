public class inheritance {
    public static void main(String[] args) {
        Fish shark=new Fish();
        shark.eat();
        animal lion=new animal();
        lion.breath();
        int age=15;
        lion.breath();
       
    }
}
class animal{
    String color;
    int age;
    void eat(){
        System.out.println("eats");
    }
    void breath( ){
        
        System.out.println("breath");
        System.out.println(age);
    }
}
class Fish extends animal{
    void swin(){
        System.out.println("swin");
    }
}
