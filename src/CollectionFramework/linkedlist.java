package CollectionFramework;

import java.util.*;

public class linkedlist {
        public static void main(String[] args) {

            List<Integer> list = new LinkedList<>();

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

            List<Integer> list2 = new LinkedList<>();
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

            Iterator<Integer> iterator = list.iterator();
            while (iterator.hasNext()) {
                System.out.println("element :" + iterator.next());
            }

            // set and get

            List<Integer> list3 = new LinkedList<>();
            list3.add(11);
            list3.add(12);
            list3.add(14);
            System.out.println(list3.get(2));
            System.out.println("before set :" + list3);

            list3.set(0, 100);
            System.out.println("After set :" + list3);

            // toArray
            Object[] array = list3.toArray();
            for(Object obj: array){
                System.out.println(obj);
            }
            // contains

            System.out.println(list3.contains(100));


            list.add(12);
            list.add(6);
            System.out.println("printing the entire list " + list);

            // sort an arrayList

            Collections.sort(list);
            System.out.println("printing the entire list " + list);

            // cloning

            LinkedList<Integer> newList = new LinkedList<>(list);
            System.out.println(newList);


            // check the list is empty or not

            System.out.println(newList.isEmpty());
            list.add(30);
            list.add(24);
            list.add(30);

            // check the index of list

            System.out.println(newList.indexOf(40));

            // check the lastindex of list

            System.out.println(newList.lastIndexOf(40));

            // addFirst and AddLast
            list.remove(3);
            list.remove(3);
            list.remove(3);
            list.remove(3);
            System.out.println("Printing original list" + list);







        }
    }



