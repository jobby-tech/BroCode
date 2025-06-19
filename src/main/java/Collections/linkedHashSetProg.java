package Collections;

import java.util.LinkedHashSet;

public class linkedHashSetProg {

    public static void main(String[] args) {

        LinkedHashSet lk = new LinkedHashSet<>();

        lk.add(45);
        lk.add(67);
        lk.add(87);
        lk.add(27);
        lk.add(27); //Duplicates not allowed

        System.out.println(lk);
    }
}
