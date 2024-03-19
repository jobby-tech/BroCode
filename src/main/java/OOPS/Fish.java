package OOPS;

public class Fish implements Prey,Predator{


    @Override
    public void Hunt() {
        System.out.println("This fishing is hunting smaller fish");
    }

    @Override
    public void flee() {
        System.out.println("This fish is fleeing from large fish");
    }
}
