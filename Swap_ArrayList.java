import java.util.*;
public class Swap_ArrayList {
    public static void swap(ArrayList<Integer> list, int idxl, int idxp ){
    int temp=list.get(idxp);
    int temps=list.get(idxl);
    list.set(idxp,temps);
    list.set(idxl,temp);
    System.out.println(list);
    }
    public static void main(String []args){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int indxl=2;
        int indxp=3;
        swap(list,indxl,indxp);
    }
}
