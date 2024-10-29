public class  practice_2{
    public static void main(String []args){
        final car car=new electriccar();
        System.out.println(car.drive());
    }
}
class automobile{
    private String drive(){
        return "driving a vehicles";
    }
}
class car extends automobile{
    protected String drive(){
        return "driveing a car";
    }
}
class electriccar extends car{
    public final String drive(){
        return "drive a elecar";
    }
}