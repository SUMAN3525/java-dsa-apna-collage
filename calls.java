public class calls {
    public static void main(String[] args) {
        Cat c=new Cat();
        c.meow();
        c.eat();
        Dog se= new Dog();
        se.bark();
    }
}
class Animal{
    void eat(){
        System.out.println("eating");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("barking");
    }
}
class Cat extends Animal{
    void meow(){
        System.out.println("meowing");
    }
}
