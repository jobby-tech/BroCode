package InterviewPrograms;

public class stringComparison {

    public static void main(String[] args) {

        String s1="Welcome";
        String s2="Welcome";

        System.out.println(s1==s2);  // True
        System.out.println(s1.equals(s2));   // True


        String s3=new String("Welcome");  // Created as Objects
        String s4=new String("Welcome");

        System.out.println(s3==s4); // False    - Compares The Objects
        System.out.println(s3.equals(s4));  // True   - Compares the Values of Objects


        String s5="Welcome";
        String s6=new String("Welcome") ;

        System.out.println(s5==s6);
        System.out.println(s5.equals(s6));


        String s7="Welcome";
        String s8=new String("Welcome");
        String s9=s8;

        System.out.println(s7==s9);
        System.out.println(s7==s8);
        System.out.println(s7.equals(s9));
        System.out.println(s7.equals(s8));

        System.out.println(s8==s9);

    }
}
