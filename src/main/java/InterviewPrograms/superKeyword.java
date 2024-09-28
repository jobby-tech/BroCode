package InterviewPrograms;


class ParentC{

    int x=100;

    void sumMetPar(){
        System.out.println("Meth Parent");
    }
}

class ChildS extends ParentC{

    int x=200;

    void sumMetPar(){
        //System.out.println("Meth OVer ride Child");

        super.sumMetPar();      // Super Keyword is used to Invoke the Immediate Parent Method
    }

    void sumSuper(){   // Super Keyword is used to Invoke the Immediate Parent Variable
        System.out.println("Child Method , but Parent/Old implementation Variable "+super.x);
    }

}
public class superKeyword {

    public static void main(String[] args) {

        ParentC objPrC=new ParentC();
        ChildS objChilS = new ChildS();

        System.out.println(objPrC.x);
        System.out.println(objChilS.x);

        objPrC.sumMetPar();
        objChilS.sumMetPar();

        objChilS.sumSuper();  // Super Keyword on Variable



    }
}
