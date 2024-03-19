package Practise;

import java.util.ArrayList;

public class Practise {

    public static void main(String[] args) {


        ArrayList<Integer> num = new ArrayList<Integer>();

        num.add(2);
        num.add(3);
        num.add(6);

        for (int i=0;i<num.size();i++){
            System.out.println(num.get(i));
        }
    }
}
