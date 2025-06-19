package InterviewPrograms;

import java.util.HashSet;

public class removeDupHashSet {


    public static void main(String[] args) {


        int [] arr = {1,2,3,4,5,5,5};

        HashSet<Integer> intH = new HashSet<>();

        for(int i: arr){
            intH.add(i);
        }

        System.out.println(intH.toString());

    }
}
