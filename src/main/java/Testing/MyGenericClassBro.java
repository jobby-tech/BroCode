package Testing;

public class MyGenericClassBro <Thing,Thing2>{    //
// public class MyGenericClassBro <Thing extends Number,Thing2>{
//  Bounded Types can accept only sub data types like   int, float, double, short etc

    Thing x;

    Thing2 y;

    MyGenericClassBro(Thing x,Thing2 y){
        this.x = x;
        this.y=y;
    }

    /*public Thing getValue(){
        return x;
    } */

    public Thing2 getValue(){
        return y;

    }
}
