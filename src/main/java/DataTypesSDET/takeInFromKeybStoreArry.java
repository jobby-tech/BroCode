package DataTypesSDET;

import java.util.Arrays;
import java.util.Scanner;

public class takeInFromKeybStoreArry {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a[] = new int[6];
        System.out.println("Input Array values");
        for (int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }

        System.out.println(Arrays.toString(a));

    }
}
