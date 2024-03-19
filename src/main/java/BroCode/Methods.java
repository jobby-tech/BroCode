package BroCode;

public class Methods {
    public static void main(String[] args) {

        // Method = a block of code that is executed whenever it is called upon

        /*hello();
        String name="Alfred";
        printName(name);  //Argument - name
        int age=13;
        printNameAndAge(name,age);*/


        //Method with Return Type

//        int x=3;
//        int y=4;

//        int z=sum(x,y);
//        System.out.println(z);
//
//        System.out.println(sum(x,y));


        //Over Loaded BroCode.Methods  =methods that share same name, but have different parameters
        // Method name + parameters = Method Signature

        int x=3;
        int y=4;
        int z=7;
        int a=9;
        double g = 7.34;
        double f=9.0;
        System.out.println(add(x,y));
        System.out.println(add(x,y,z));
        System.out.println(add(x,y,z,a));
        System.out.println(add(g,f));

    }

    /*static void hello(){
        System.out.println("Hello !");
    }

    static void printName(String paraName){   //Parameter - name
        System.out.println("Hello"+paraName);
    }

    static void printNameAndAge(String name,int age){
        System.out.println(name);
        System.out.println(age);
    }*/


    //Method with Return Type

  /*  static int sum(int a,int b){

//            int x=a+b;
//        return x;

        return a+b;
    }*/




    //Over Loaded BroCode.Methods  =methods that share same name, but have different parameters
            // Method name + parameters = Method Signature


    static int add(int a, int b){
        return a+b;
    }

    static int add(int a, int b,int c){
        return a+b+c;
    }
    static int add(int a, int b,int c, int d){
        return a+b+c+d;
    }

    static double add(double g, double f){
        return g+f;
    }

}
