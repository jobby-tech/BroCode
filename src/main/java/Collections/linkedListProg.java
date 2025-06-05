package Collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class linkedListProg {
    public static void main(String[] args) {

        LinkedList<String> lnk = new LinkedList<>();


        lnk.add("John");
        lnk.add("Li");
        lnk.add("Aj");
        lnk.add("Ru");

        System.out.println(lnk.get(2));
        ArrayList<String> arrLi = new ArrayList<>();

        arrLi.add("ArJohn");
        arrLi.add("ArLi");
        arrLi.add("ArAj");
        arrLi.add("ArRu");

        System.out.println(arrLi.get(2));
    }
}
