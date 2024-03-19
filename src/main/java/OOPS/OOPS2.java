package OOPS;

import Package2.C;

import java.util.Scanner;

public class OOPS2 {

    public static void main(String[] args) {


       /* //Sending Objects as Arguments

        Garage garage = new Garage();

        Car car = new Car("Nissan");

        Car car1=new Car("Bent");

        garage.park(car);
        garage.park(car1);*/



       /* //Static  = modifier. A single copy of a variable/method is created and shared.
                        // The class "owns" the static member

        Friend friend = new Friend("Jo");
        Friend friend1= new Friend("Pat");
        Friend friend2= new Friend("Pr");

        System.out.println(Friend.numberOfFriends);  // static method or instance is called with Class Name and not instance name
        Friend.totalNumberOfFriends();*/


    /*    // Inheritence = the process where one class acquires, the attributes and methods of another

            carsInher car = new carsInher();
            car.go();

            BicycleInher bike = new BicycleInher();
            bike.stop();

            System.out.println(car.doors);

            System.out.println(bike.pedels);

*/

        /*// Method Overloading = Declaring a method in sub class which is already present in parent class.
        //  This is done so that a child class can give its own implementation

        Animal animal = new Animal();
        Dog dog = new Dog();
        dog.speak();
        animal.speak();*/



        /*//super  = Keyword refers to the superclass (Parent) of an object
        //          very similar to the "this" keyword

        Hero hero1 = new Hero("Batman",43,"Intell");

        Hero hero2 = new Hero("Super",77,"Mag");

//        System.out.println(hero1.name);
//        System.out.println(hero1.age);
//        System.out.println(hero1.power);

        System.out.println(hero2.toString());*/



       /* //Abstract  = abstract classes cannot be instantiated, but they can have a subclass
        // abstract methods are declared without an implementation
        // To avoid the objects being created
        // Adds a layer of security to the program

            CarAbstract car = new CarAbstract();
           // VehicleAbstract vehicle = new VehicleAbstract();

            car.go();*/

/*

        // Encapsulation = Attributes of a class will be hidden or private,
        // can be accessed only through methods(getters & setters)
        // You should make the attributes private if you dont have a reason to make them otherwise


        CarEncapsule car= new CarEncapsule("BM","Cammer",2024);
        CarEncapsule car2= new CarEncapsule("Ford","v2",2027);

        //System.out.println(car.make); // private variable is not accessible
        //hence have to create the getter method to get the details

       */
/* System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());

       // car.year=2024;  - // private variable is not accessible
        //hence have to create the setter method to set the value

        car.setMake("TV");
        car.setYear(2027);
        car.setModel("v2");

        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());
*//*

        //Copy Objects

        //car2=car;  // Will Not copy the values, only the address
        car2.copy(car);
        //CarEncapsule car2 = new CarEncapsule(car);  // To use the Copy Constructor


        System.out.println(car);    // Prints the address of the Object
        System.out.println(car2);   // Prints the address of the Object
        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());
        System.out.println();
        System.out.println(car2.getMake());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());

*/

/*
        //Interface = A template that can be applied to a class
        //          similar to Inheritance, but specifies what a class has/must do
        //          classes can apply more than one interface, Inheritence is limited to 1 super


        Rabbit rabbit = new Rabbit();
        rabbit.flee();

        Hawk hawk = new Hawk();
        hawk.Hunt();

        Fish fish = new Fish();
        fish.flee();
        fish.Hunt();*/


       /* //Polymorhipsm  - Poly(many)  morph(form)  // The ability of an object to identify as more than one type

        CarPolyM car = new CarPolyM();
        BicyclePolyM bic = new BicyclePolyM();
        BoatPolyM boat = new BoatPolyM();

        VehiclePolyM [] racers ={car,bic,boat};

//        car.go();
//        bic.go();
//        boat.go();

        for (VehiclePolyM i:racers){
            i.go();
        }*/


        //Dynamic Polymorphism   = many forms  , dynamic = after compilation(during runtime)


        Scanner scanner = new Scanner(System.in);
        AnimalDynPoly animal;

        System.out.println("What Animal do you select?");
        System.out.print("1=Dog or 2=Cat ");
        int choice = scanner.nextInt();

        if(choice==1){
           animal = new DogDynPoly();
           animal.speaks();
        }

        else if(choice==2){
            animal= new CatDynPoly();
            animal.speaks();
        }

        else System.out.println("Invalid Choice");

    }
 }

