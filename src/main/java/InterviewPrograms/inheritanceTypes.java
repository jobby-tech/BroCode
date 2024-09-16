package InterviewPrograms;


class A{            //Parent Class

    int a =10;

    void displayA(){
        System.out.println(a);
        System.out.println("Class A");
    }

}

class B extends A{          //Child Class

    int b=8;
    void showB(){
        System.out.println(b);
        System.out.println("Class B");
    }

}


class C extends B{  //Multilevel Inheritance

    int c=7;
    void showC(){
        System.out.println(b);
        System.out.println("Class C");
    }

}
public class inheritanceTypes {

    public static void main(String[] args) {

        /*B objB = new B();

        A objA= new A();

        objB.displayA();

        objA.displayA();
*/
        C objC = new C();    //Multilevel Inheritance, A to B , B to C

        objC.displayA();
        objC.showB();
        objC.showC();
    }
}
