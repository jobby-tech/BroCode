package BroCode;

public class Maths {

    public static void main(String[] args) {

        /*double x= 3.14;
        double y=-10;

        double z= Math.max(x,y);
        System.out.println(z);
        z= Math.min(x,y);
        System.out.println(z);
        z= Math.sqrt(x);
        System.out.println(z);

        z= Math.round(x);
        System.out.println(z);

        z= Math.ceil(x);
        System.out.println(z);

        z= Math.floor(x);
        System.out.println(z);
*/

        //Finding the hypot of the triangle
       /* Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side x");
        double x=scanner.nextDouble();
        System.out.println("Enter side y");
        double y=scanner.nextDouble();

        double z=Math.sqrt((x*x)+(y*y));

        System.out.println("The Hypotenuse is "+z);

        scanner.close();*/

        //Pseudo Random

        //Random random = new Random();  //Creating an instance for Random
        //int x=random.nextInt(6)+1;  //To generate a random number between 1-6  , increament by 1 so 0 is not generated
        //double y= random.nextDouble();
        //boolean z=random.nextBoolean();
        //System.out.println(x);


        // Post Increment Pre Increment Post Decrement Pre Decrement

        int a=10;

        int res=a++;

        System.out.println(res);

        System.out.println(a);

        int b=100;
        int preRes=++b;

        System.out.println(preRes);

        int c =200;
        int preDec = --c;
        System.out.println(preDec);

        int d =200;
        int postDec = d--;
        System.out.println(postDec);



        int e=500;
        e--;
        System.out.println(e);



    }
}
