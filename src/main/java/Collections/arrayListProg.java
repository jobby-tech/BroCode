package Collections;

import Package1.A;

import java.util.*;

public class arrayListProg {
    public static void main(String[] args) {

       /* // Array List is dynamic and the size is Not fixed as in an Array

        //ArrayList<String> al = new ArrayList<>();
        LinkedList<String> al = new LinkedList<>();

        al.add("Hi");
        al.add("sub");

        Iterator it = al.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }*/

       /*
       //Fixed size homogeneous Array , Not growable
       String a[] = {"one","two"};
        for(String x:a){
            System.out.println(x);
        }*/

/*

        Object b[] = {"Str",5.6,'c'};

        for (Object x:b){
            System.out.println(x);
        }

        ArrayList<String> al = new ArrayList<>();
*/


        //Converting Array into ArrayList
        String a[] = {"test","null"};

        ArrayList alInt = new ArrayList(Arrays.asList(a));

        System.out.println(alInt);


    }
}
