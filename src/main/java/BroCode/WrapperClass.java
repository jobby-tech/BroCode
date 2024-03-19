package BroCode;

import java.util.ArrayList;

public class WrapperClass {
    public static void main(String[] args) {


        //Wrapper class provides a way to use primitive data types as Reference data types
        // Reference datatypes contain useful methods
        // can be used with collections (ex.Array List)
/*
         Primitive   - Wrapper
            boolean    Boolean
            char       Character
            int        Integer
            double     Double

         Autoboxing = Automatic conversion that the Java compiler makes between
                    the primitive types and their corresponding object wrapper class

         Unboxing = the reverse of autoboxing. Automatic coversion of wrapper class to primitive   */


        /*Boolean a= true;
        Character b = '@';
        Integer c= 123;
        Double d = 3.14;
        String e = "Alfred";
*/


        // ArrayList   - Is a collection  - a resizable Array, Elements can be added or removed after compilation phase
        //Store reference data types


        /*ArrayList<String> food=new ArrayList<String>();

        food.add("pizza");
        food.add("Hotdog");
        food.add("ham");

        food.set(0,"Sushi");
        food.remove(2);
        food.clear();
        for (int i=0;i< food.size();i++){
            System.out.println(food.get(i));
        }
*/


        // 2D Array List

        ArrayList<ArrayList<String>> groceryList = new ArrayList();

        ArrayList<String> bakeryList = new ArrayList();

        bakeryList.add("Pasta");
        bakeryList.add("Gingerbread");
        bakeryList.add("dounuts");

        ArrayList<String> produceList = new ArrayList();

        produceList.add("Tomato");
        produceList.add("Peper");
        produceList.add("Zuchi");

        ArrayList<String> drinksList = new ArrayList();

        drinksList.add("Soda");
        drinksList.add("Cola");


        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinksList);

        System.out.println(groceryList);
        System.out.println(groceryList.get(0));
        System.out.println(groceryList.get(0).get(0));
        System.out.println(groceryList.get(2).get(0));




    }
}
