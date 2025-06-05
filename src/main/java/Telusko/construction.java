package Telusko;


class A{

    public A(){
        System.out.println("in A parent");
    }

}

class B extends A{

    public B(){
        System.out.println("in B cons Child");
    }

    public B(int b){
        System.out.println("in B INT");
    }

}
public class construction {

    public static void main(String[] args) {

        B obj = new B();

    }

}
