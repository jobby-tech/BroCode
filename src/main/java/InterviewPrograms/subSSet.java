package InterviewPrograms;

import java.util.ArrayList;
import java.util.Collections;

public class subSSet {

    // {42, 15, 12, 8, 6, 32}
    //Number - 26
    //find continuous sub array whose sum is equal to Number
    //


    public static void main(String[] args) {

        int [] arrI = {42, 15, 12, 8, 6, 32};

        int sum = 26;

        ArrayList<Integer> aL = new ArrayList<>();

        for(int i: arrI){

            aL.add(i);
        }

        Collections.sort(aL);

        int tot=0;

        for(int i=0;i<aL.size();i++){

            tot=tot+aL.get(i);
            System.out.println(aL.get(i));
            if(tot==sum){
                break;
            }
        }



    }
}
