package OOPS;

public class CarAbstract extends VehicleAbstract{


    //Abstract class cannot be instantiated, as its not a fully implemented class, so its abstract methods cannot be executed
    // Compiler doesnt allow to instantiate


    //Can we declare abstract methods as final?
        // No, because it should be allowed to overridden in subclass


    //Can we declare abstract as private?
            // No because it should be inherited to subclass as it leads to compilation error

    @Override
    void go() {
        System.out.println("The driver is driving the car");
    }

    //VehicleAbstract va = new VehicleAbstract();   // 'VehicleAbstract' is abstract; cannot be instantiated

}
