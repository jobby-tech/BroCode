package qaSDET;

import java.util.HashSet;

public class dupInt {

    public static void main(String[] args) {

        int[] a ={4,7,3,9,3,7};
        int[] b = {1,3,4,7,8};

        System.out.println(a.length);
        int[] newIarr=new int[a.length+b.length];

        for(int i=0;i<a.length;i++){
            newIarr[i]=a[i];
        }

        for (int j=0;j<b.length;j++){
            newIarr[(a.length)+j]=b[j];  // [6]  [0]
        }


        for (int i=0;i<newIarr.length;i++){
        System.out.println(newIarr[i]);}

        HashSet<Integer> uniq = new HashSet();

        for(int i:newIarr){
            uniq.add(i);
        }
        System.out.println(uniq);
    }
}
