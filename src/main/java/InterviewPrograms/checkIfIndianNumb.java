package InterviewPrograms;

public class checkIfIndianNumb {

    public static void main(String[] args) {

        String phn="+91-9444967295";

        char phChar[]= phn.toCharArray();
        String newChr="";
        for (int i=0;i<phChar.length;i++){
            newChr=newChr+phChar[i];
            System.out.println(newChr);

            if(newChr.equals("+91"))
            {
                System.out.println("Is a Indian number");
                break;
            }
        }
    }
}
