package Testing;

public class GenericMethod {

    public static void main(String[] args) {

        //Generics = enable types (classes and interfaces) to be parameters when defining
        //   classes, interfaces and methods
        //   a benefit is to eliminate the need to create multiple versions
        //   of methods or classes for various data types
        //   Use 1 version for all reference data types

        Integer[] intArray = { 1,2,3,4,5};
        Double[] doubleArray = { 3.4 , 5.6, 4.7, 8.9};
        Character[] charArray = {'I', 'L', 'O', 'R'};
        String[] strArray ={ "Num", "Char", "Val"};

//        displayArray(intArray);
//        displayArray(doubleArray);
//        displayArray(charArray);
//        displayArray(strArray);

        System.out.println(getFirst(intArray));
        System.out.println(getFirst(doubleArray));
        System.out.println(getFirst(charArray));
        System.out.println(getFirst(strArray));
    }

    public  static <Thing> void displayArray(Thing[] array){
        for (Thing i: array){
            System.out.print(i);
        }
        System.out.println(" ");
    }

    public static <Thing> Thing getFirst(Thing[] array){
        return array[0];
    }


/*     // Not Reqired if Generics are used

    public  static  void displayArray(Double [] array){
        for (Double i: array){
            System.out.print(i);
        }
        System.out.println(" ");
    }

    public  static  void displayArray(Character[] array){
        for (Character i: array){
            System.out.print(i);
        }
        System.out.println(" ");
    }
    public  static  void displayArray(String [] array){
        for (String i: array){
            System.out.print(i);
        }
        System.out.println(" ");
    }
*/



}
