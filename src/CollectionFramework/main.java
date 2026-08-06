package CollectionFramework;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class main {
    public static void main(String[] args) {


       ArrayList<Integer> arr =  new ArrayList<>();
       List<Integer> list = new ArrayList<>();
        Collection<Integer> collection = new ArrayList<>();

        //add
         list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        list.add(40);
        System.out.println(list);

        list.remove(0);
        System.out.println(list);

        //addAll

        List<Integer> list2 = new ArrayList<>();
        list2.add(101);
        list2.add(102);

        list.addAll(list2);
        System.out.println(list);
        list.removeAll(list2);
        System.out.println(list);
        System.out.println(list.size());

        System.out.println("printing list 2 ;" + list2);
        list2.clear();
        System.out.println(list2.size());

        // I want to traverse list using iterator

    }
}
