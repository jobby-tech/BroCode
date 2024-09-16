package InterviewPrograms;

public class thisKeyword {


    int x,y;

    /*thisKeyword(int a,int b){
        x=a;
        y=b;
    }*/
/*
    thisKeyword(int x,int y){
        this.x=x;  //this keyword is representing the class, to differentiate the local and class variable
        this.y=y;
    }*/

    /*void setData(int a, int b){
        x=a;
        y=b;
    }*/

    /*void setData(int x, int y){
        x=x;
        y=x;
    }*/

    void setData(int x, int y){
        this.x=x;
        this.y=y;
    }

    void displayMet(){
        System.out.println(x+" "+y);
    }
    public static void main(String[] args) {

     //   thisKeyword th = new thisKeyword(4,7);    //   Constructor

        thisKeyword th = new thisKeyword();
        th.setData(4,7);

        th.displayMet();

    }
}
