package InterviewPrograms;


interface shape{

    int length=10;  //Final and Static variable by default inside an Interface
    int width=20;   //Final and Static variable by default inside an Interface

    void square();  // Abstract Method. No implementation, only declaration.  Interface abstract methods cannot have body

   /* void square(){        //  Interface abstract methods cannot have body
    }*/

    default void squareDef(){
        System.out.println("Default Method is allowed");
    }

    static void rectangle(){
        System.out.println("Static method is allowed");
    }

}
public class interfacePrg implements shape{    // Class 'interfacePrg' must either be declared abstract or implement abstract method 'square()' in 'shape'

    /*@Override
    void square() {   //attempting to assign weaker access privileges ('package-private'); was 'public'
    }*/
    @Override
    public void square(){
        System.out.println(" Squr meth implemetation");
    }

    int lengthX=20;
    public static void main(String[] args) {

        interfacePrg objInt =new interfacePrg();

        shape sh = new interfacePrg();   // Interface variable, new class object instance

        sh.square();
        sh.squareDef();
        shape.rectangle(); // calling static method directly

        System.out.println(objInt.lengthX);   // to access variables outside

    }

}
