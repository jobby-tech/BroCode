package InterviewPrograms;

public class identifyPositionOfChar {

    public static void main(String[] args) {


        String name ="Ruizi";

        char ch;

        for(int i=0;i<name.length();i++){

            ch=name.charAt(i);

            if(ch=='i') {
                System.out.println("Position of 'i' : " + (i + 1));
            }

        }
    }
}
