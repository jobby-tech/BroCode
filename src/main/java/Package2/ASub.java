package Package2;

import Package1.A;

public class ASub extends A {

    // Access Modifiers

    public static void main(String[] args) {

        C c = new C();
        System.out.println(c.defaultMessage);    // Within the same package hence able to access the default access modifier

        ASub aSub = new ASub();

        System.out.println(aSub.protrectedMsg);

    }
}
