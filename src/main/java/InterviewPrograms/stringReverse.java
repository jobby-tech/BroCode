package InterviewPrograms;

public class stringReverse {

    public static void main(String[] arg) {


        /*{

        String text = "Geeks";
        String newStr ="";
        char ch;

        System.out.println("Original word: "+text);
        for(int i=0;i<text.length();i++){
            ch=text.charAt(i);
            newStr = ch+newStr;
        }
        System.out.println("Reversed word: "+newStr);

        }*/

   /* {

        String text = "Geeks for Gems";
        String newStr = "";
        for (int i = text.length()-1; i >= 0; i--) {
            newStr = newStr + text.charAt(i);

        }
        System.out.println(newStr);
    }*/


        String scentance="New Joined Per";
        String revStr="";
        String splT[]=scentance.split(" ");

        for(int j=0;j<=splT.length-1;j++) {
            for (int i = splT[j].length() - 1; i >= 0; i--) {
                revStr = revStr + splT[j].charAt(i);

            }
            revStr=revStr+" ";
        }
        System.out.println(revStr);
/*



        StringBuffer s =new StringBuffer("welcome");

        System.out.println(s);

        System.out.println(s.reverse());

        StringBuilder tex=new StringBuilder("To Sum");

        System.out.println(tex.reverse());

    }


*/


      /*  String words="Given Find the number of words";
        int count=0;
        char c[]=words.toCharArray();
        for(int i=0;i<c.length;i++){
            if(c[i]==' '){
                count=count+1;
            }
        }

        System.out.println("Total Number of words = "+(count+1));
*/




    }

}
