package qaSDET;

import java.util.Scanner;

public class exceptionHandle {

    public static void main(String[] args) {

        System.out.println(" Program Execution started..... ");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number ");

        int numb = sc.nextInt();

        System.out.println("The Number is "+(100/numb)); // Arithmetic Exception

        System.out.println(" Program is Completed.... ");
    }
}


