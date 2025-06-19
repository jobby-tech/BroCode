package InterviewPrograms;

public class integerArray {

    public static void main(String[] args) {


        int[] a = {1,3,6,4,1,9};
        int[] b = {6,3,6,1};

        int[] comb= new int[a.length+b.length];

        for (int i=0;i<a.length;i++){
            comb[i] =a[i];
        }

        for (int i=0;i<b.length;i++){
            comb[a.length+i] =b[i];
        }

        // find Duplicate

        int count = 0;

        for(int i=0;i<comb.length;i++){
            for(int j=i+1;j<comb.length;j++){
                if(comb[i]==comb[j]){
                    count++;
                }
            }
            if(count==1)
                System.out.println(comb[i]);
            count=0;
        }

        /*for (int i=0;i<comb.length;i++){
            System.out.println(comb[i] );
        }*/
    }
}
