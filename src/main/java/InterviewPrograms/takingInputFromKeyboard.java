package InterviewPrograms;

import java.util.Scanner;

public class takingInputFromKeyboard {

    public static void main(String[] args) {

        System.out.println("Enter the value : ");

        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println("The Entered value is : "+num);

        System.out.println("Enter the Decimal value : ");
        double deci = sc.nextDouble();
        System.out.println("The Decimal value is "+deci);

        //Input String
        System.out.println("Enter the Country value : ");
        String str=sc.next();
        System.out.println("The Country is: "+str);

        //TO Input any Data Type

        System.out.println("Enter any data");
        Object obj = sc.next();
        System.out.println("The Data is "+obj);


    }
}
