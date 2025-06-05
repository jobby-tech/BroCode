package Collections;

import java.util.HashSet;
import java.util.Set;

public class hashSetProg {
    public static void main(String[] args) {

        //There is No Index in Hash

        //Set<String > setH = new HashSet<>();  // Set is an interface , HashSet is a class, and abstract class cannot be instantiated

        HashSet<Integer> has= new HashSet<>();

        has.add(7);
        has.add(7);  // Duplicate will be ignored
        has.add(3);
        has.add(9);
        has.add(5);
        System.out.println(has);

        has.remove(7);      // Removing will be based on Object and Not index

        System.out.println(has);

        HashSet has2 = new HashSet();

        has2.add(7);
        has2.add(4);
        has2.add(3);
        System.out.println(has2);

       /* // Unions
        has.addAll(has2);
        System.out.println("Union "+ has);*/

        /*// Intersections
        has.retainAll(has2);
        System.out.println("Intersection " +has);*/

        /*//Difference
        has.removeAll(has2);
        System.out.println("Difference"+has);*/

        //Subset
        has.containsAll(has2);
        System.out.println("Subset "+has);


    }
}
