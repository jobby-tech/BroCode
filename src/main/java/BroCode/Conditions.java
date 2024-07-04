package BroCode;

public class Conditions {
    public static void main(String[] args) {

       /* //Ternery Operator

        //var = exp ? result1:result2;

        int a=200,b=400;

        int x = (a>b)? a:b;
        System.out.println(x);
*/


        /*//if statement = performs a block of code if it's condition evaluates to be true

        int age=18;

        if (age==75){  //  = assignment operator  , == equals to operator
            System.out.println("Senior Citizen");
        }
        else if(age>=18){
            System.out.println("Eligible to vote");
        }
        else {
            System.out.println("Not Eligible to vote");
        }*/

        /*// Boolean conditions

        if(false)   // if(true)
            System.out.println("Print 1");
        else
            System.out.println("Print 2");*/


        /*// Nested IF Else statement

        if(false){

            if(false){
                System.out.println("Print inner if");
            }
            else
                System.out.println("Print inner else block");
        }

        else
            System.out.println("Outer Else block");*/

        /*// Display Week days

        int day=2;

        switch (day){

            case 1: System.out.println("Sunday"); break;
            case 2:System.out.println("Monday"); break;
            default:System.out.println("Not a day");
        }*/

        // switch statement  = statement that allows a variable to be tested for equality against a list of values

        /*String day="SMonday";

        switch (day){
            case "Sunday": System.out.println("Today is Sunday"); break;
            case "Monday": System.out.println("Today is Monday");break;
            case "Friday": System.out.println("Today is Friday");break;
            default: System.out.println("Not a day");
        }*/


        //Logical Operators  = used to connect one or more expressions &&- AND both conditions are true || - OR, !=  NOT Neither

       /* int temperature=24;

        if(temperature>30){
            System.out.println("Its Hot");
        }
        else if(temperature>=25&&temperature<=30){
            System.out.println("Its Normal");
        }
        else System.out.println("Its cold");
        */


        /*Scanner scanner =new Scanner(System.in);
        System.out.println("You are playing a game! Press q or Q to Quit");
        String response = scanner.next();
        if(response.equals("q")||(response.equals("Q"))){
            System.out.println("You Quit the Game");
        }else System.out.println("You are still playing the Game");*/

        // Modification for OR logic

       /* Scanner scanner =new Scanner(System.in);
        System.out.println("You are playing a game! Press q or Q to Quit");
        String response = scanner.next();
        if(!response.equals("q")&&(!response.equals("Q"))){
            System.out.println("You are still playing the Game");
        }else System.out.println("You Quit the Game");*/


    }
}
