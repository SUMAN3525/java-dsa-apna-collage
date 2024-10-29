import java.util.ArrayList;
public class TwoD_Array_List {
    public static void main(String []args){
    ArrayList<ArrayList<Integer>> mainlist=new ArrayList<>();
    ArrayList<Integer> list1=new ArrayList<>();
    list1.add(1);
    list1.add(2);
    mainlist.add(list1);
    ArrayList<Integer> list2=new ArrayList<>();
    list2.add(3);
    list2.add(4);
    mainlist.add(list2);
    for(int i=0; i<mainlist.size(); i++){
     ArrayList<Integer> currentlist=mainlist.get(i);
     for(int j=0; j<currentlist.size(); j++){
    System.out.print(currentlist.get(i));
     }
     System.out.println();
    }
    }
}
