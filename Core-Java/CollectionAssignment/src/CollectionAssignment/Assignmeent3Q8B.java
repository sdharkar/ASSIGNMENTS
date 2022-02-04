package CollectionAssignment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Assignmeent3Q8B {
    public static CopyOnWriteArrayList<Integer> failFast(CopyOnWriteArrayList<Integer> list){
        Iterator itr = list.iterator();
        while (itr.hasNext()){
            Integer num = (Integer)itr.next();
            System.out.println(num);

            list.add(78);
        }
   return  list;
    }
    public static void main(String args[]) {
        CopyOnWriteArrayList<Integer> list
                = new CopyOnWriteArrayList<Integer>(new Integer[] { 1, 3, 5, 8 });

        failFast(list);
    }
}