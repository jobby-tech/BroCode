package BroCode;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.SortedMap;

public class Loops{
    public static void main(String[] args){


        //While Loop

        //While loops = executes a block of code as long as its condition remains true

       /* Scanner scanner = new Scanner(System.in);
        String name ="";*/

        /*while (name.isBlank()){
            System.out.print("Enter your name:");
            name=scanner.nextLine();
        }
        System.out.println("Hello "+name);*/


        //Do While loop, The do block gets executed once before the while condition gets executed

        /*do {
            System.out.print("Enter your name:");
            name=scanner.nextLine();
        }
        while (name.isBlank());

        System.out.println("Hello "+name);*/


        //For Loop = executes a block of code for limited amount of times , Index , Condition, Iteration

      /*  for(int index=1;index<=10;index++){
            System.out.println(index);
        }*/

        /*for(int i=10;i>=0;i--){
            System.out.println(i);
        }
        System.out.println("Happy New Year !");*/


        //Nested Loop = a loop inside a loop
/*
        Scanner scanner = new Scanner(System.in);

        int rows;
        int columns;
        String symbol="";

        System.out.println("Enter the number of Rows: ");
        rows=scanner.nextInt();
        System.out.println("Enter the number of Columns: ");
        columns=scanner.nextInt();
        System.out.println("Enter Symbol to use: ");
        symbol=scanner.next();

        for(int i=1;i<=rows;i++){
            System.out.println();
            for (int j=1;j<=columns;j++){
                System.out.print(symbol);
            }
        }*/


        //For Each Loop   = Traversing technique to iterate through the elements in an array/collection
        // Less steps and more Readable, Less Flexible

        /*String [] animals = {"Cat", "Dog", "Bird"};

        for (String i:animals) {
            System.out.println(i);
        }

        ArrayList<String> birds = new ArrayList<String>();
        birds.add("Parrot");
        birds.add("Crow");
        birds.add("Duck");

        for (String i:birds) {
            System.out.println(i);
        }*/

        /*ArrayList<Integer> primeNum=new ArrayList<Integer>();
        primeNum.add(2);
        primeNum.add(3);
        primeNum.add(5);

        for(Integer i:primeNum){
            System.out.println(i);
        }*/



    }
}