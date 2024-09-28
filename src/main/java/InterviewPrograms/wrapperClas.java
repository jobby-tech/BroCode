package InterviewPrograms;

public class wrapperClas {

    public static void main(String[] args) {


        String str ="String Variable";

        String strOb = new String("String Object");  // Not a wrapper class, as there is no primitive type for String

        int x =100;         // Primitive data types
        //Integer objX = new Integer(23);  // Depreciated   // Wrapper class

        String price ="34.6";
        String quantity = "58";
        String flag ="FaLSE";
        String gender ="M";
        Double conPrice = Double.parseDouble(price);
        Integer intPrice = Integer.parseInt(quantity);
        Boolean bolFlag = Boolean.parseBoolean(flag);

        //Char gendCh = Character.paras   // String to Char parsing is NOT possible

        System.out.println(conPrice);
        System.out.println(intPrice);
        System.out.println(bolFlag);

        Double total = conPrice*intPrice;
        System.out.println(total);


        //Converting Primitive data types to STRING

        int a=7;
        double pie=3.4;
        char letter='A';
        boolean left =true;

        String.valueOf(a);
        String.valueOf(pie);
        String.valueOf(letter);  // Character to String is possible
        String.valueOf(left);

    }
}
