package Package1;
import Package2.*;
public class A {

    // Access Modifiers

    protected String protrectedMsg = "Protracted Mesg";

    public static void main(String[] args) {

        //C c = new C();  // Error when the class C is Not public , and will be visible only within the package2
        C c = new C();
        //System.out.println(c.defaultMessage);  Error for the default access modifier cannot be inherited
        System.out.println(c.publicMessage);  // No error message


        B b = new B();
       // System.out.println(b.privateMsg);  // Cannot access
    }
}
