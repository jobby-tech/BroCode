package qaSDET;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class hashSetProg {

    public static void main(String[] args) {


        //Declaration for Heterogeneous data
        HashSet mySet = new HashSet();

       // Set mySet = new HashSet();

        // Homogeneous data
       // HashSet <String> mySetS = new HashSet<String>();


        //Adding Elements
            mySet.add(null);
            mySet.add(null);
            mySet.add(true);
            mySet.add(true);
            mySet.add("String");
            mySet.add("String");
            mySet.add(45);
            mySet.add(45);

        System.out.println(mySet);   // O/P [null, String, 45, true]


        //Removing specific element from the Hash Set

        mySet.remove(true);  // Specify the Value directly
        System.out.println(mySet);

        mySet.remove("String");
        System.out.println(mySet);

        //Size of HashSet
        System.out.println(mySet.size());

        // Inserting specify element in Hash Set
                // NOT Possible

        //Accessing specific Element from the Hash Set
                // Not Possible

        //Convert Hash Set to ArrayList

        ArrayList newA = new ArrayList(mySet);

        System.out.println(newA.get(1));

        //Reading all the elements using Enhanced For Loop
        System.out.println("Using Enhanced For Loop");
        for (Object x:mySet){
            System.out.println(x);
        }

        //Reading all the elements using Iterator

        Iterator it = mySet.iterator();

        System.out.println("Using Iterator");
        while (it.hasNext()){
            System.out.println(it.next());
        }

        //Removing all the elements
        mySet.clear();
        System.out.println(mySet.isEmpty());
    }
}
