package InterviewPrograms;

public class staticMeth {

    static int i=10;
    int j=20;

    static void m1(){
        System.out.println(" Static Method ");
    }

    void m2(){
        System.out.println(" Non Static Method");
    }

    void m3(){          //Calling both static and Non static methods and Variables inside a Non-static methods

        System.out.println(i);
        System.out.println(j);
        m1();
        m2();
    }

    public static void main(String[] args) {

        System.out.println(i);          // Directly called without creating any objects
        m1();       // Directly called without creating any objects

        // System.out.println(j);   // Error Message - Non-static field 'j' cannot be referenced from a static context
       // m2();       // Error Message - Non-static method 'm2()' cannot be referenced from a static context


        staticMeth sm = new staticMeth();

        System.out.println(sm.j);
        sm.m2();

        sm.m3();


    }
}
