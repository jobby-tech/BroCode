package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class intrvProg {

    public static void main(String[] args) {

        int a[] = {4,3,7,8,5,5};

        ArrayList<Integer> newAr = new ArrayList<>();

       // HashSet<Integer> newAr = new HashSet<>();

        for (int i : a){
            newAr.add(i);
        }

      //  Collections.sort(newAr);

        newAr.add(0,7);
        newAr.set(0,8);

      /*  //Reading Data using Iterator

        Iterator it = newAr.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }
*/
     /*   //Reading Data using For loop
        for(int i=0;i<newAr.size();i++){
            System.out.println(newAr.get(i));
        }
*/
     /*   //Reading Data using Enhanced For loop - as Object
        for (Object i:newAr){
            System.out.println(i);
        }*/

        //Reading Data using Enhanced For loop - as Integer
        for (int x:newAr){
            System.out.println(x);
        }

//        Collections.reverse(newAr);
//        System.out.println(newAr);


    /*    String word = "Geeks for Geek";
        String rev ="";
        char[] chAr = word.toCharArray();
        for(int i=chAr.length-1;i>=0;i--){
            if (chAr[i]!=' '){
                rev = rev+chAr[i];
            }
            else rev = rev+' ';

        }
        System.out.println(rev+' ');*/

    }
}
