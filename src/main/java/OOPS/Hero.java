package OOPS;

public class Hero extends Person{


    //Super = keyword refers to the superclass (parent) of an object , very similar to the "this" keyword

    String power;

    Hero(String name,int age, String power){

        super(name,age);    // super refers to the parent class

        this.power=power;
    }

    public String toString(){

        return super.toString() + this.power +"\n";
    }
}
