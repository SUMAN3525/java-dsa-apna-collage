public class arvin_sir {
    public static void main(String[] args) {
        Fruit f=new Fruit();
        f.apple("apple");
        System.out.println(f.apple);
        f.banana("banana");
        System.out.println(f.banana);
        f.mango("mango");
        System.out.println(f.mango);
        Car c=new Car();
     c.obja();
      
      
    }
                    }
class Fruit{
    String apple;
    String banana;
    String mango;
    void apple(String apple){
       this.apple=apple;
    }
    void banana(String banana){
      this.banana=banana;
    }
    void mango(String mango){
        this.mango=mango;
    }
}
class Car{
    
 // public  String brand;
  //public  String model;
   //public int year;
  public static void obja(){
    System.out.println("BMW");
   System.out.println("X5");
   System.out.println(1999);
   }
 //
}

