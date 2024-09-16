package DataTypesSDET;

import java.util.Arrays;

public class stringProg {

    public static void main(String[] args) {

        String text1 ="Welcome";
        String text2 ="Welcome";
        String text3 ="welcome";

        System.out.println(text1==text2);
        System.out.println("Welcome"==text2);
        System.out.println(text1==text3);
        System.out.println(text1.equals(text2));
        System.out.println(text1.equals("Welcome"));
        System.out.println(text1.equals("welcome"));
        System.out.println(text1.equalsIgnoreCase("welcome"));


        String email="test@gmail.com";

        String split[]=email.split("@");
        System.out.println(split[0]);
        System.out.println(split[1]);

        String amount = "$6,366.10";
        String newAmt = amount.replace("$","");
        newAmt= newAmt.replace(",","");
        Double.parseDouble(newAmt);
        System.out.println(newAmt);


        String randomVal="abs,123@xyz.com";
        String afSpl1 []=randomVal.split("@");
        System.out.println(Arrays.toString(afSpl1));
        String afSpl2[]=afSpl1[0].split(",");
        System.out.println(Arrays.toString(afSpl2));


        String fullName="John L";

        System.out.println(fullName.toLowerCase().contains("n l"));



        StringBuffer s =new StringBuffer("welcome");

        System.out.println(s);

        System.out.println(s.reverse());

        StringBuilder tex=new StringBuilder("To Sum");

        System.out.println(tex.reverse());

    }
}
