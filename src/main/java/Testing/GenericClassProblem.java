package Testing;

import java.util.ArrayList;

public class GenericClassProblem {
    public static void main(String[] args) {



/*

        MyIntergerClass myInt = new MyIntergerClass(8);
        MyDoubleClass myDouble = new MyDoubleClass(1.8);
        MyCharacterClass myChar = new MyCharacterClass('C');
        MyStringClass myStr = new MyStringClass("Str");
*/


        /*MyGenericClassBro<Integer> myInt = new MyGenericClassBro(8);
        MyGenericClassBro<Double> myDouble = new MyGenericClassBro(1.8);
        MyGenericClassBro<Character> myChar = new MyGenericClassBro('C');
        MyGenericClassBro<String> myStr = new MyGenericClassBro("Str");*/

       /* //Multi parameter Generic to return only 1 value

        MyGenericClassBro<Integer,Integer> myInt = new MyGenericClassBro(8,4);
        MyGenericClassBro<Double,Double> myDouble = new MyGenericClassBro(1.8,3.4);
        MyGenericClassBro<Character,Character> myChar = new MyGenericClassBro('C','T');
        MyGenericClassBro<String,Character> myStr = new MyGenericClassBro("Str",'!');

        // Similar to ArrayList implementation
        ArrayList<String>  friends= new ArrayList<>();

        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
        System.out.println(myChar.getValue());
        System.out.println(myStr.getValue());*/

        // Bounded Types = you can create the objects of a generic class to have data of
        //                  specific drived types ex: Number

                // < Thing extends Number>  // can accept only sub data types like   int, float, double, short etc

    }
}
