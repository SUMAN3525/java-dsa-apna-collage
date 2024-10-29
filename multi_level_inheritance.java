public class multi_level_inheritance {
    public static void main(String[] args) {
        dogs d1=new dogs();
    d1.color();
        d1.legs=12;
        System.out.println(d1.legs);
    }
}
class animal{
    void sound(){
        System.out.println("sound");
    }
    void color(){
        System.out.println("color");
    }
}
class mammal extends animal{
    int legs;
}
class dogs extends mammal{
    String breat;
}
