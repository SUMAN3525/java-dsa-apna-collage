import java.util.ArrayList;
public class Store_water_arraylist {
    public static int storewater(ArrayList<Integer> height){
        int maxstore=0;
        for(int i=0; i<height.size(); i++){
            for(int j=i+1; j<height.size(); j++){
                int ht=Math.min(height.get(i), height.get(j));//dout
                int with=j-i;
                int currentwater=ht*with;
                System.out.println(ht);
              //  System.out.println(currentwater);
                maxstore=Math.max(maxstore, currentwater);
            }
        }
        return maxstore;
    }
    public static void main(String []args){
        ArrayList<Integer> height=new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println();
        System.out.println(storewater(height));
    }
}