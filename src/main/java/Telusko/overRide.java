package Telusko;


class Alpha{


    double pie=3.14;
    public void show(){
        System.out.println("in A Show");
    }

    public void config(){
        System.out.println("in A config");
    }
}

class Beta extends Alpha{


    @Override
    public void show(){

        double d = super.pie;  // To call the super class variable
        System.out.println(d);

        super.show();  // To call the Super Class Method

        System.out.println("in B show");
    }
}


public class overRide {

    public static void main(String[] args) {

        Beta obj = new Beta();
        obj.show();
        obj.config();

    }
}
