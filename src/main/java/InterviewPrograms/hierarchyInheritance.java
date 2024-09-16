package InterviewPrograms;


class parentCl{

    void display(int a){
        System.out.println("Partent Class value "+a);
    }
}

class child01 extends parentCl{

    void show(int b){
        System.out.println(" Child class value "+b);
    }

}

class child02 extends parentCl{

    void print(int c){
        System.out.println("Child class value "+c);
    }

}

public class hierarchyInheritance {

    public static void main(String[] args) {

        child01 objC01= new child01();
        objC01.show(7);
        objC01.display(8);

        child02 objC02 = new child02();
        objC02.print(9);
        objC02.display(4);


    }
}
