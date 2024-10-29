import java.util.ArrayList;
public class basic_arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<String> list2=new ArrayList<>();
        ArrayList<Boolean> list3=new ArrayList<>();
        //add element o(1)
       list1.add(1);
       list1.add(2);
       list1.add(3);
       list1.add(4);
       list1.add(5);
        System.out.println(list1);
        //get element o(1)
        int element=list1.get(1);
        System.out.println(element);
        //remove element o(n)
        list1.remove(2);
        System.out.println(list1);
        // set.
        list1.set(0,10);
        System.err.println(list1);
        //contains (yes & no)
        System.out.println(list1.contains(10));
        System.out.println(list1.contains(20));
        // add
        list1.add(2,10);
        System.out.println(list1);
        //size
        System.out.println(list1.size());
    }
}
