package InterviewPrograms;

public class SearchProgram {

    public static void main(String args[]){

        //Linear Search

        int arr[]={9,8,6,4,4,47};
        int toFindIf =0;
        int j=0;
        int count=0;
        boolean status=false;
        for(int i:arr){
            j++;
            if(i==toFindIf)
            {
                System.out.println("Is Present in position "+ j);
                status=true;
                count++;
               // break;
            }

        }
        if(status==false)
            System.out.println("Not Found");

        System.out.println("Number of occurance : " + count);
    }





}
