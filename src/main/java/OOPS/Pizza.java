package OOPS;

public class Pizza {

    String bread;
    String cheese;
    String sause;
    String topping;
    Pizza(String bread,String cheese,String sause,String topping){
        this.bread=bread;
        this.cheese=cheese;
        this.sause=sause;
        this.topping=topping;

    }

    Pizza(String bread,String cheese,String sause){
        this.bread=bread;
        this.cheese=cheese;
        this.sause=sause;

    }

    Pizza(String bread,String cheese){
        this.bread=bread;
        this.cheese=cheese;
    }

    Pizza(String bread){
        this.bread=bread;
    }

    Pizza(){
    }
}
