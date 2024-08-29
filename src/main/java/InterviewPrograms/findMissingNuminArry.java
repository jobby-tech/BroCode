package InterviewPrograms;

public class findMissingNuminArry {

    public static void main(String[] args) {

        int numArr[]={3,5,7,9};


      // int maxVal= ;
        for(int i=0;i<=numArr[numArr.length-1];i++){

                     for (int j=0;j<=numArr.length-1;j++){

               if(numArr[j]!=i){                // 3!=0  - 0,
                   System.out.println(i);
               }
            }
        }
    }
}
