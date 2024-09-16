package DataTypesSDET;


import org.w3c.dom.ls.LSOutput;

class newTest{

    double pie=3.14;
    final double fixedPie=3.14;


    //Cannot be Over Ride if the Method is having final keyword
   final void meth01(){
        System.out.println("Method 01");
    }
}

final class newTestChild02 extends newTest{

    int a;
    void metho04(){
        System.out.println("Method 4");
    }
}

//Error Message, as Final Class cannot be extended
/*class newTestChild04 extends newTestChild02{

}*/

class newTestChild extends newTest{


    //Cannot Over Ride if the Method is having final keyword
   /* void meth01(){
        System.out.println("Method Over Ridded");
    }
    */
}
public class finalKeywords {

    public static void main(String[] args) {

        newTest objTEst =new newTest();

        System.out.println("Before Update "+objTEst.pie);
        objTEst.pie=objTEst.pie+200;
        System.out.println("Updated Value "+objTEst.pie);

        System.out.println("Final variable value "+objTEst.fixedPie);

        //objTEst.fixedPie= objTEst.fixedPie;+10; // Error Message - Cannot assign a value to final variable 'fixedPie'

    }
}
