package BroCode;

public class stringClassBro {
    public static void main(String[] args) {

        String name ="Alfred  A  ";

        boolean result=name.equalsIgnoreCase("Alfred");
        boolean result2=name.equals("alfred");
        boolean result3=name.isEmpty();

        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);

        int strLeng=name.length();
        char charOfStr=name.charAt(0);
        int indexAt = name.indexOf('f');
        String caseTest=name.toLowerCase();
        System.out.println(strLeng);
        System.out.println(charOfStr);
        System.out.println(indexAt);
        System.out.println(caseTest);
        System.out.println(name.trim());

    }
}
