package BroCode;

public class Basics {

        public static void main(String[] args){


       /* //Swap Variables
        String var1="Book";
        String var2="Note";
        String temp=null;

        System.out.println("Var1 :"+ var1);
        System.out.println("Var2 :"+ var2);
        System.out.println("Temp :"+ temp);

        temp=var1;
        var1=var2;
        var2=temp;

        System.out.println("Var1 :"+ var1);
        System.out.println("Var2 :"+ var2);
        System.out.println("Temp :"+ temp);
        */


            //Input Data from user

       /* Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name ? ");
        String name = scanner.nextLine();
        System.out.println("How old are you? ");
        byte age=scanner.nextByte();
        scanner.nextLine(); // To avoid the system being stopped due to the escape character
        System.out.println("What is your Gender ? ");
        String gender = scanner.nextLine();

        System.out.println("Hello "+name);
        System.out.println("Age: "+age);
        System.out.println("Gender: "+gender);*/


        /*//Data Types
        int squrMter=600;
        float pie=3.14f;
        char symbol ='@';


        System.out.println("The square meter is :"+squrMter+"  "+pie);
        String myMobNmbr="89444967295";
        String regexStr ="^[0-9]{10}$";

        if(myMobNmbr.matches(regexStr)){
            System.out.println("Matches");        }
        else System.out.println("Not match");*/



            // Operations
            //Expression = operands & operators
            //Operands = values, variables, numbers, quality
            //Operators = + - / %


            //Relational Operators

        /*    int a=100,b=40;

            System.out.println(a<b);
            System.out.println(a>b);
            System.out.println(a<=b);
            System.out.println(a>=b);
            System.out.println(a!=b);
            System.out.println(a==b);
*/
            //Logical Operators

        /*    boolean val1 = true;
            boolean val2 = false;

            System.out.println(val1 && val2);
            System.out.println(val1 || val2);
            System.out.println(!val1);
            System.out.println(!val2);
*/

            boolean b1 = 10>20;
            System.out.println(b1);

            boolean b2 = 30>10;
            System.out.println(b2);

            System.out.println(b1 && b2);
            System.out.println(b1 || b2);

            System.out.println((10>30)&&(30<10));


           /* int totalFriends=100;
            System.out.println(totalFriends);
            totalFriends=totalFriends+1;
            System.out.println(totalFriends);
            totalFriends++;
            System.out.println(totalFriends);
            totalFriends=totalFriends-1;
            System.out.println(totalFriends);
            totalFriends--;
            System.out.println(totalFriends);
            totalFriends=totalFriends/2;
            System.out.println(totalFriends);

            totalFriends=totalFriends%3;
            System.out.println(totalFriends);

            double decimalFri=100;
            decimalFri=(double) decimalFri/3;    //Casting to print the decimals reminders
            System.out.println(decimalFri);
*/


            //Printf = Optional method to contro, format, and display text to the console window
            // two arguments = format string + (object/variable/value)
            // [% flags] [precision] [width] [conversion-character]

          /*  System.out.printf("%d This is a format string", 123);

            boolean myBoo = true;
            char charact='@';
            String myStr="Alfred";
            int myInt=50;
            double myDouble=70.00;

            System.out.printf("%b",myBoo);
            System.out.printf("%c",charact);
            System.out.printf("%s",myStr);
            System.out.printf("%d",myInt);
            System.out.printf("%f",myDouble);
*/


//            double pie=3.14159;
//            pie=4;

        /*    final double PI=3.14159;  // the value remains the same
            //PI=45;
            System.out.println(PI);
*/

        }
    }


