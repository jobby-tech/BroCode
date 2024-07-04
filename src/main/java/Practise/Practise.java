package Practise;

import java.util.ArrayList;

public class Practise {

    public static void main(String[] args) {

      /*  // Check if a number is Positive or Negative or Zero
        int numb = 8;

        if (numb == 0) {
            System.out.println("The number is Zero " + numb);
        } else if (numb > 0) {
            System.out.println("The number is Positive " + numb);
        } else if (numb < 0) {
            System.out.println("The number is Negative " + numb);
        }*/


        // Find the largest of three numbers

        int numb1 = 8;
        int numb2 = 17;
        int numb3 = 26;

        if(numb1>numb2 && numb2>numb3)
            System.out.println(numb1 +" Is the largest");
        else if(numb2>numb1&& numb2>numb3)
            System.out.println(numb2 +" Is the largest");
        else
            System.out.println(numb3 +" Is the largest");

    }
}
