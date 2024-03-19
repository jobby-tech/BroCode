package OOPS;

import javax.swing.plaf.IconUIResource;

public class Car {

    String brand = "BMW";
    String model= "Sedan";
    int year=2000;
    String color="White";
    double price=4500.00;

    void drive(){
        System.out.println("You drive the car");
    }

    void brake(){
        System.out.println("Brake applied");
    }



    //Passing Objects

    String name;

    Car(String name){
        this.name=name;
    }

}
