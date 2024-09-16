package DataTypesSDET;

import java.util.Arrays;

public class immutMute {


    // Immutable - Cannot change the value   - String
    // Mutable - Can change                  - StringBuffer , StringBuilder

    public static void main(String[] args) {

        int a[]={9,5,7};

        System.out.println(Arrays.toString(a));
        Arrays.sort(a);         //mutable
        System.out.println(Arrays.toString(a));


//Immutable
        String text ="NewString";
        System.out.println(text);
        System.out.println(text);


//Mutable - the orginal values can be updated
        StringBuffer stbu = new StringBuffer("Welcome");

        System.out.println("Before Concat/Append: "+stbu);
        stbu.append(" Suffix");
        System.out.println("After Concat/Append: "+stbu);

//Mutable - the orginal values can be updated
        StringBuilder stbuild = new StringBuilder("Verb");

        stbuild.append(" Suffix ");

        System.out.println(stbuild);

    }


}
