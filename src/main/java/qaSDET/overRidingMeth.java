package qaSDET;


class Bank{

    double roi(){
        return 0;
    }

    double savings(){
        return 0;
    }

}

class hdfcBank extends Bank{


    double roi(){
        return 7;
    }

    double savings(){       //Over Riding
        return 2;
    }

    double savings(int age){  // Over Loading
        return 2*age;
    }
}

class sbiBank extends Bank{

    double roi(){
        return 8.5;
    }
}

public class overRidingMeth {

    public static void main(String[] args) {

        hdfcBank objHdfc = new hdfcBank();
        System.out.println(objHdfc.roi());

        sbiBank objSBI = new sbiBank();
        System.out.println(objSBI.roi());

        System.out.println(objHdfc.savings());
        System.out.println( objHdfc.savings(50));

    }
}
