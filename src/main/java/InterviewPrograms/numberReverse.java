package InterviewPrograms;

public class numberReverse {

    public static void main(String args[])
    {

       /* int num=121;
        int revNum=0;
        int temp=num;
       while(num!=0){
           revNum=revNum*10 + num%10;
           num=num/10;
       }

        System.out.println(revNum);
        System.out.println(num);
        if(temp==revNum)
            System.out.println("Is Palindrome");
        else
            System.out.println("Not Palindrome");*/


        /*//Count Number of digits in a number

        int numb=343243;
        int i=0;
        while(numb!=0){
            numb=numb/10;
            i++;
        }
        System.out.println(i);*/

        //Sum of Digits in a number
        int numb=101;
        int temp=0;
        int sum=0;
        while(numb!=0){
            temp=numb%10;
            numb=numb/10;
            sum=sum+temp;
        }
        System.out.println(sum);

    }
}



