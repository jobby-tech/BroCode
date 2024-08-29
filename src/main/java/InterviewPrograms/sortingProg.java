package InterviewPrograms;


import java.util.Arrays;

public class sortingProg {
    public static void main(String args[]) {


        /*int vals[] = {5, 7, 6, 4, 1, 8, 3, 9, 2};

        System.out.println("Before Sort "+Arrays.toString(vals));

        Arrays.sort(vals);
        System.out.println("After Sort "+Arrays.toString(vals));

        String s[]={"Gamma","Omega","Beta","Alpha"};

        Arrays.sort(s);
        System.out.println("After Sort "+Arrays.toString(s));
*/
        String name="India is my country";
        char newarr[]=name.toCharArray();
        String revArr="";
        for(int i=newarr.length-1;i>=0;i--){

           revArr=revArr+newarr[i];

        }
        System.out.println(revArr);


    }

}