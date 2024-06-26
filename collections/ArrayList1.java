import java.util.*;
import java.util.Collections;

public class Arraylist1 {
    public static void main(String args[]) {

        ArrayList<Integer> arrlist = new ArrayList<>();
        arrlist.add(2);
        arrlist.add(1);
        arrlist.add(4);
        arrlist.add(3);
        arrlist.add(5);
        Collections.sort(arrlist); // sorts the arraylist using collection class.sort();
        for(Integer num:arrlist) {

            System.out.println(num);
        }


        System.out.println("Reverse order");
        Collections.reverse(arrlist); // reverse the list using collections.reverse()method



        System.out.println("Traverse in forward ");
       ListIterator<Integer> list =arrlist.listIterator(); //here we are using only listiterator() we are not using any parameters
        // ,the traverse from the 0th position..
        while (list.hasNext()) {
            System.out.println(list.next());
        }



        ListIterator<Integer> list1 =arrlist.listIterator(arrlist.size());// traverse from the last position
                                                      // here we using arrlist.size(); to traverse from last position;
        System.out.println("traverse in the backward");
        while (list1.hasPrevious()){
            System.out.println(list1.previous());
        }


        arrlist.stream().forEach(System.out::println);// using streams we can traverse the list
    }

}