package qaSDET;

import java.util.HashSet;

public class dupString {

    public static void main(String[] args) {

        String strAr[] = {"java", " c++","c","java","c"};


        //Approach 1

        /*boolean flag = false;
        for(int i=0;i<strAr.length;i++){
            for(int j=i+1;j<strAr.length;j++){   // j=i+1 because the first has to be compared with second

                if(strAr[i]==strAr[j]){
                    System.out.println("Duplicate Element "+strAr[i]);
                    flag=true;
                }
            }
        }
        if(flag==false){
        System.out.println("Duplicate element not found");}*/



        // Approach 2 Using Hash set
        // Behaviour of hash set is it doesnt allow duplicates

        HashSet<String> langs = new HashSet();

        /*
        langs.add("java");
        langs.add("python");
        langs.add("java");
        langs.add("python");*/

        /*System.out.println(langs.add("java"));
        System.out.println(langs.add("java"));// returns false as java value is already available*/

        //Simple Approach

       /* for (String l:strAr){
            langs.add(l);
            //System.out.println(langs.add(l););  // to see True or False , duplicate or Not
        }
        System.out.println(langs.toString());  // Outputs only the unique elements*/


        boolean flag=false;
        for(String l:strAr){

            if(langs.add(l)==false){
                System.out.println("Duplicate found "+l);
                flag=true;
            }
        }

        if (flag==false){
            System.out.println("No duplicates found");
        }

        System.out.println(langs.toString()); // Duplicate removed


    }
}
