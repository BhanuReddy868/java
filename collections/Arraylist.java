import java.util.ArrayList;
public class Arraylist{
    public static void main(String args[]){
        ArrayList<String> arrlist=new ArrayList<>();
        arrlist.add("one");
        arrlist.add("two");
        arrlist.add("three");
        for(String str:arrlist){
            System.out.print("\t"+str);
        }
    }
}