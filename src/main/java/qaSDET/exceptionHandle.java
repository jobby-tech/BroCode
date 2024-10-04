package qaSDET;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class exceptionHandle {

    public static void main(String[] args) throws FileNotFoundException, InterruptedException {

        System.out.println(" Program Execution started..... ");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number ");



        // Arithmetic Exception

        try {
            int numb = sc.nextInt();
            System.out.println("The Number is " + (100 / numb));
        }

        catch (ArithmeticException e){  // or catch(Exception e)(
            System.out.println("Invalid Data "+e.getMessage());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println(" Program is Completed.... ");

        //Array Index Out of Bounds Exception

        int a[] = new int[5];

        System.out.println(" Enter the position (0-4 ");
        try {
            int post = sc.nextInt();
            System.out.println(" Enter the value: ");
            int value = sc.nextInt();
            a[post]=value;
            System.out.println("Value add is "+a[post]);
        }

        catch (Exception e){
            System.out.println(e);
        }
        // String to number, Number format exception


        try{
            String text01="23";
            int number = Integer.parseInt(text01);
            System.out.println("String to number "+number);
        }
        catch (Exception e){
        }


        finally {  // finally bock will always execute

            System.out.println("Finally Block");

        }

       /*   // Can be handled either by Try Catch Block or by Throws exeception
       try {
            FileInputStream fileObj= new FileInputStream("c:/test.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }*/


            FileInputStream filOb = new FileInputStream("d:/tex.txt");


        /*try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/

        Thread.sleep(500);

    }
}


