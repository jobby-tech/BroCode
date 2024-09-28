package InterviewPrograms;


interface interNew01{

    void drive();

}

interface  interNew02{

    void steer();

}

class parentClass01{
    void forward(){

    };
}

class childClass02  implements interNew01,interNew02{   // Multiple Inheritence

    @Override
    public void drive() {
        System.out.println("Child class implementation of interface from New01");

    }

    @Override
    public void steer() {
        System.out.println("Child class implementation of interface from New02");
    }
}


class grandChildHybridInher extends parentClass01 implements interNew01,interNew02{  // Hybrid inheritence, both multi and hireac

    @Override
    public void drive() {

    }

    @Override
    public void steer() {

    }
}

public class multipleInherInterfac {

    public static void main(String[] args) {

    }
}
