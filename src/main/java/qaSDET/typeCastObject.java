package qaSDET;


class parentType{

    int par = 5;

    void metho01(){
        System.out.println("Parent method");
    }

}
class childType extends parentType{

    int chi=7;

    void method02(){
        System.out.println("Child method");
    }

}
public class typeCastObject {
    public static void main(String[] args) {

        //Normal Method
        childType chiObj = new childType();
        System.out.println(chiObj.chi);
        System.out.println(chiObj.par);
        chiObj.metho01();
        chiObj.method02();


        //Upcasting
        parentType parObj = new childType(); // Upcasting , creating a new instance of child class, and assigning to parent type

        System.out.println(parObj.par);         // Only the Parent methods and variables can be accessed
        parObj.metho01();

       // System.out.println(parObj.chi);  // Cannot be accessed
       // parObj.metho02(); // Cannot be accessed

       /*//Downcasting  // Throws ClassCast Exception during Runtime

        parentType pObj = new parentType();
        childType cObj = (childType) pObj;  // Throws ClassCast Exception

        System.out.println(cObj.par);
        System.out.println(cObj.chi);
        cObj.metho01();
        cObj.method02();*/


    }
}
