import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Arraylist {
    public static void main(String args[]) {
        ArrayList<Integer> arrlist = new ArrayList<>();
        arrlist.add(1);
        arrlist.add(2);
        arrlist.add(3);
        arrlist.add(4);
        arrlist.add(5);
        arrlist.remove(2);
        arrlist.add(2, 3);
       /*  for(Integer num:arrlist){
             if(num.equals(3)){
                 arrlist.remove(num); // here the iterating through for loop is throwong the exception to
             }                          //handle this exception we will use iterator() method for iterating
             System.out.print(num);      // iterator handles the execption thrown when modifications done in iterating the elements.
         } */
        Iterator<Integer> it = arrlist.iterator();
        while (it.hasNext()) {
            Integer obj = it.next(); // using iterator class  we can handle exception thrown when modification done at the
            if (obj.equals(3)) {     //time of iterating..
                it.remove();
            }
        }
        System.out.println(arrlist);

    }
}