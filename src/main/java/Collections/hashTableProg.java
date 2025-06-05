package Collections;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashTableProg {

    public static void main(String[] args) {

        Hashtable<Integer,String > ht = new Hashtable<>();

        ht.put(1001,"AJ");
        ht.put(1002,"ThJ");
        ht.put(1003,"HgJ");
        ht.put(1004,"UjJ");
        ht.put(1005,"IkJ");
        ht.put(1006,"AJ");
//        ht.put(null,"IkJ"); //NullPointerException
//        ht.put(1006,null);  //NullPointerException

        System.out.println(ht);

        for(Object x: ht.keySet()){
            System.out.println("Key "+ x+ " Value "+ ht.get(x));
        }

        for (Map.Entry entry: ht.entrySet()){
            System.out.println("Key "+ entry.getKey()+ " Value "+ entry.getValue());
        }

        //Using Iterator

        Set s = ht.entrySet();
        Iterator itr = s.iterator();
        while (itr.hasNext()){
           // System.out.println(itr.next());
            Map.Entry entry = (Map.Entry) itr.next();

            System.out.println("Key "+ entry.getKey()+ " Value "+ entry.getValue());
        }
    }
}
