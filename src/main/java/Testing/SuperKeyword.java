package Testing;




class A{

    public A(){
        //super();  //Will be a default method
        System.out.println("in A");
    }

    public A(int i){
        //super();  //Will be a default method

        System.out.println("in  A int ");
    }
}


class B extends A{

    public B(){

        //super();  //Will be a default method
        //super(5); // to call the parameterized constructor of the parent class
        System.out.println("in B");
    }

    public B(int i){
        //super();  //Will be a default method
        super(i);  //This will now call the parameterized constructor of the parent class
        System.out.println("in  B int ");
    }

}


public class SuperKeyword {




    public static void main(String[] args) {

        //A obj1 = new A();
         //B obj2 = new B();  // when the object is created for sub class, the constructor of Parent class is also created
       // B obj3 = new B(5);  // Default constuctor of super class will be called, and the parameterized constuctor of subclass will be called
        B obj4 = new B();

    }
}