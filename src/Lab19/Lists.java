package Lab19;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Lists {
    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();
        myList.add(123);
        myList.add(4);
        myList.add(56);

//        System.out.println(myList.size());
//        System.out.println(myList.remove(2));
//        System.out.println(myList.size());
//        myList.clear();
//        System.out.println(myList.size());

//        Iterator<Integer> iterator = myList.iterator();
//        while (iterator.hasNext()){
//            if(iterator.next().equals(4)){
//                iterator.remove();
//            }
//
//        }
//        for(Integer i : myList){
//            System.out.println(i);
//        }
        ListIterator<Integer> listIterator = myList.listIterator();

        while(listIterator.hasNext()){
            System.out.println(listIterator.next() + " " + listIterator.nextIndex());
        }
        System.out.println("----------------------------------");
        while(listIterator.hasPrevious()){
            Integer index = listIterator.previousIndex();
            Integer value = listIterator.previous();
            System.out.println(index + " " + value);



        }

        System.out.println("----------------------------------");
        Integer[] arr =  new Integer[myList.size()];
        arr = myList.toArray(arr);

        System.out.println(arr[1]);


    }


}
