package qaSDET;

public class reverseWord {

    public static void main(String[] args) {

        /* Approach 1

        String str = "Welcome to java";  // Original String
        String[] words= str.split(" ");      // Split into Words

        String revStr ="";

        for(String w:words){

            String revWord="";

            for (int i=w.length()-1;i>=0;i--){
                revWord=revWord+w.charAt(i);
            }

            revStr = revStr+revWord+" ";
        }
        System.out.println(revStr);*/


        String str = "Welcome to java";  // Original String
        String[] words= str.split(" ");      // Split into Words

        String revStr ="";

        for(String w: words){
            StringBuilder sb = new StringBuilder(w);
            sb.reverse();
            revStr = revStr+sb.toString()+ " ";
        }
        System.out.println(revStr);



        // Direct Full Reverse
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println(sb.toString());


        // Using StringBuffer - Synchronized and  Thread Safe
        StringBuffer sf = new StringBuffer(str);
        sf.reverse();
        System.out.println(sf.toString());

    }
}
