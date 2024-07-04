package InterviewPrograms;

public class stringReverse {

    public static void main(String[] arg){

        String text = "Geeks";

        String newStr ="";

        char ch;

        System.out.println("Original word: "+text);

        for(int i=0;i<text.length();i++){

            ch=text.charAt(i);

            newStr = ch+newStr;
        }

        System.out.println("Reversed word: "+newStr);

    }

}
