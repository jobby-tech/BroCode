package Testing;


import java.util.Scanner;

public class CustomException {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age");
        int age=scan.nextInt();

        try {
            checkAge(age);
        }
        catch (Exception e){
            System.out.println("A problem occured : "+e);
        }
    }

    public static void checkAge(int age)throws AgeExecption{

        if(age<18){
            throw new AgeExecption("\n"+"You must be 18+ to sign up!");

        }

        else System.out.println("You have signed up");

    }
}
