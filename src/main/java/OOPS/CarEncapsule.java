package OOPS;

public class CarEncapsule {

    private String make;
    private String model;
    private int year;

    CarEncapsule(String make, String model, int year){
        this.make=make;
        this.model=model;
        this.year=year;
    }

    //Copy Constructor
    CarEncapsule(CarEncapsule x){
        this.copy(x);
    }

    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }

    public void setMake(String make){
        this.make=make;
    }

    public void setModel(String model){
        this.model=model;
    }

    public void setYear(int year){
        this.year=year;
    }

    public void copy(CarEncapsule x){
        this.setMake(x.getMake());
        this.setModel(x.getModel());
        this.setYear(x.getYear());
    }


}
