package ShRah;

public class stringInterview {

    public static void main(String[] args) {

        String var1 = "hello"; //String literal
        String var2= "hello";  // if created with same value, the var2 will be pointed to var1, if content is same only 1 memory object will be created
        var1.concat("world");
        System.out.println(var1);  // Strings are immutable, the original content cannot be altered
        String var3 = var1.concat(" world");
        System.out.println(var3);

        String  s1 = new String("hellow");  // Using String class creates new object every time in memory
        String s2 = new String("hellow");

        // StringBuffer and StringBuilder classes are Mutable

        StringBuffer sb = new StringBuffer("helloww");
        sb.append(" world");
        System.out.println(sb);  // Mutable
        sb.replace(5,7,"str");
        System.out.println(sb);

        StringBuffer revStr =new StringBuffer("GeekforGeeks") ;
        revStr.reverse();
        System.out.println(revStr);

        // StringBuilder is Not Thread safe, It is Not Synchronized , But it is Faster



        //2. When to use = and when to use equals

        System.out.println(var1.equals(var2));  // Content is matched so True
        System.out.println(var1==var2);  // True as the content is same and both are referring to same Object Reference
        System.out.println(var1==var3);  // False as the Object referene is not same
        System.out.println(s1==s2);  // False as the Object referene is not same, and new Object Reference is created
        System.out.println(s1.equals(s2)); // True as the content is same
    }
}
