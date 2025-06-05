package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashMapProgENTRY {

    public static void main(String[] args) {

        HashMap<Integer,String> hm = new HashMap();

        hm.put(100,"Aj");
        hm.put(101,"Gj");
        hm.put(102,"Hj");
        hm.put(103,"Zj");

        /*for (Map.Entry entry : hm.entrySet()){
            System.out.println("Key "+entry.getKey() +" Value "+entry.getValue());
        }*/

        //Using Iterator Method for retrieval

        Set s = hm.entrySet();
        Iterator irt = s.iterator();

        while (irt.hasNext()){
            //System.out.println(irt.next());
            Map.Entry entry = (Map.Entry) irt.next();
            System.out.println("Key "+entry.getKey()+" Value "+ entry.getValue());
        }
    }
}
