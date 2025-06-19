package InterviewPrograms;

import java.util.ArrayList;
import java.util.Collections;

public class strRevColl {

    public static void main(String[] args) {

        String str= "text prog";

        char [] chAr = str.toCharArray();
        ArrayList<Character> arL = new ArrayList<>();

        for (char c:chAr){
            arL.add(c);
        }

        Collections.reverse(arL);

        System.out.println(arL);
    }
}
