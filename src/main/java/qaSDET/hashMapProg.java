package qaSDET;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class hashMapProg {

    public static void main(String[] args) {


        //Declaration
        HashMap hmObj = new HashMap();  // Or

        Map maObj = new HashMap();



        //Declaration with Type
        HashMap <Integer,String> empIdName = new HashMap<Integer,String>();

        //Adding Pairs
        empIdName.put(1001,"Aj");
        empIdName.put(1002,"Bj");
        empIdName.put(1003,"Cj");
        empIdName.put(1004,"Cj");


        System.out.println(empIdName);    // {1001=Aj, 1002=Bj, 1003=Cj, 1004=Cj}

        //Size of the Hash Map - pairs
        System.out.println(empIdName.size());  //4

        //Access the value of particular Key

        System.out.println(empIdName.get(1003));  //Cj

        //Get all the keys

        System.out.println("All the Keys in the Form of Set "+empIdName.keySet());   // [1001, 1002, 1003, 1004]

        //Get all the Values
        System.out.println("All the Values in the Form of Set "+empIdName.values());   // [Aj, Bj, Cj, Cj]

        //Retrieve the Key-Value Pair
        System.out.println("All the Key-Value in the Form of Set "+empIdName.entrySet()); // [1001=Aj, 1002=Bj, 1003=Cj, 1004=Cj]

        //Update the existing Value for the Key
        empIdName.put(1001,"Rj");
        System.out.println(empIdName); // {1001=Rj, 1002=Bj, 1003=Cj, 1004=Cj}

        //Reading Data from HashMap
        //Using Enhanced For Loop

        for(int k:empIdName.keySet()){
            System.out.println(empIdName.get(k));  //
        }


        //Reading Data from HashMap Using Iterator

        Iterator<Map.Entry<Integer,String>> it = empIdName.entrySet().iterator();

        System.out.println("Using Iterator ");
        while (it.hasNext()){
            Map.Entry<Integer,String> entry = it.next();
            System.out.println(entry.getKey()+" "+entry.getValue());

           // System.out.println(it.next());
              /*  1001=Rj
                1002=Bj
                1003=Cj
                1004=Cj*/

        }


    }
}
