package qaSDET;

import Package1.A;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class arrayListProg {

    public static void main(String[] args) {

        /*Array List - is a class which is implemented List Interface
            1. Heterogenous data - Allowed
            2. Insertion Order - Preserved (Indexed)
            3. Duplicate  Elements - Allowed
            4. Multiple Nulls - Allowed
        */

        //Declaration
        //ArrayList myList = new ArrayList();  //  myList -> Reference variable
        List myLi = new ArrayList();  // Child class Object can hold on the Parent class variable

        ArrayList myList = new ArrayList();  // allows heterogenous data

        ArrayList <Integer> mylistInt = new ArrayList<Integer>();  // To restrict to allow only Homogenous data, with the help of Wrapper class

        ArrayList <String> mylistStr = new ArrayList<String>();

        //ArrayList<Employee> myListEmp = new ArrayList<Employee>();  // To store only Employee class type objects


        //Adding Data into Array List

        mylistInt.add(20);
        mylistInt.add(40);
        myList.add(10.5);
        myList.add(true);
        mylistStr.add("text");




        System.out.println(myList.size());

        System.out.println(myList);


        //Removing data
        myList.remove(0);
        System.out.println(myList);


        //Insert data, add method overloaded with index parameter
        myList.add("String");
        System.out.println(myList);
        myList.add(1,false);
        System.out.println(myList);

        //Modify data

        myList.set(1,true);
        System.out.println(myList);

        // Extract specific element from ArrayList

        System.out.println(myList.get(1));

        // Reading all the elements from the ArrayList

        //Approach 1: Using Normal For Loop
            System.out.println("Using For Loop: ");
            for(int i=0;i<myList.size();i++){
                System.out.println(myList.get(i));
            }

        //Approach 2: Using Enhanced For Loop
        System.out.println("Using Enh For Loop: ");
            for(Object x:myList){
                System.out.println(x);
            }

        //Approach 3: Using Collections Interator
        System.out.println("Using Collections Iterator: ");
            Iterator it = myList.iterator();  // New variable creates the object, here only the method is called and assigned to variable type
            while (it.hasNext()){
                System.out.println(it.next());
            }

        //Checking if the ArrayList is Empty
        System.out.println(myList.isEmpty());

            //Delete all the elements from the ArrayList
              //  myList.clear();
        System.out.println(myList);
            //Delete the elements from the ArrayList

        ArrayList myList2 = new ArrayList();
        myList2.add(true);
        myList2.add(true);
        myList2.add("String");
        myList2.add(false);

        myList.removeAll(myList2);

        System.out.println(myList);


        ArrayList myList03 = new ArrayList();

        myList03.add(null);
        myList03.add(null);
        System.out.println(myList03);


    }
}
