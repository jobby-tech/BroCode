package InterviewPrograms;

public class phoneNumValid {

    //Validate if the phone number is having 10 digits

    public static void main(String[] args) {

        String phoneNumber = "9444967295";
        boolean isValidNumb=false;
        char ch;
        int count=0;
        for(int i=0;i<phoneNumber.length();i++){

            ch=phoneNumber.charAt(i);

            count=count+1;
        }

        if (count==10){
            System.out.println("Valid Number "+count);
        }
        else System.out.println("Not valid "+count);
    }


}
