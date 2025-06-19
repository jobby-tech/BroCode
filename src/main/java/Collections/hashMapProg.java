package Collections;

import java.util.HashMap;

public class hashMapProg {
    public static void main(String[] args) {

       /* HashMap<Integer,Character> hm = new HashMap();
        hm.put(7,'C');
        hm.put(8,'C');
       // hm.putAll(another Map);

        System.out.println(hm);

        System.out.println(hm.get(7));

        //hm.remove(KEY)

        System.out.println(hm.containsKey(7));
        System.out.println(hm.containsValue('C'));

        System.out.println(hm.keySet());
        System.out.println(hm.values());
        System.out.println(hm.entrySet());
*/

        HashMap nHash = new HashMap();
        nHash.put(101,"John");
        nHash.put(102,"Lo");
        nHash.put(103,"Ke");
        nHash.put(104,"Iu");
        nHash.put(104,"Xi");

        System.out.println(nHash);

        System.out.println(nHash.get(101));

        System.out.println(nHash.entrySet());  // Returns all the Entries as Set

        for (Object x: nHash.entrySet()){
            System.out.println(x);
        }

        for (Object i : nHash.keySet()){
            System.out.println("Keys "+i+" Values "+nHash.get(i));
        }

        for(Object i:nHash.values()){
            System.out.println("Values "+i);
        }
    }
}
