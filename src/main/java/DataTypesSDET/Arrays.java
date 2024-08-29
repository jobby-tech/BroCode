package DataTypesSDET;

public class Arrays {


    public static void main(String arg[])
    {

       /* //Approach 1
        *//*int a[] = new int[5];   // Array declaration
        a[0]=10;        // Assignment
        a[2]=6;*//*

        //Approach 2
        int b[]={3,4,5};

        int c[]={};

        int d[]={9,9,9};

        //To find the length/size of the Array
        int arrayLen=b.length;
        System.out.println(arrayLen);
        System.out.println(c.length);

        //To Read data from an array with Index number

        System.out.println(b[2]);

        // To Read all the data in an Array using Loops

        //Classic For Loop

        for(int i=0;i<d.length;i++){
            System.out.println(d[i]);
        }

        //Enhanced For loop - For Each - No need for Initialization or Condition , iteration

        for(int x:d){
            System.out.println(x);
        }
*/

        //Multi Dimensional Array

        //Approach 1
        int ab[][]= new int[2][3];
        ab[0][0]=3;
        ab[0][1]=2;

        int xy[][]={{2,3,4},
                    {4,5,6}};

        int rst[][] = { {3,4,5},
                        {6,7,8},
                        {1,2,3}};
        //System.out.println(xy[0][0]);

        //Find the size of the Array
      //  System.out.println("Number of Rows "+xy.length);
      //  System.out.println("Number of Columns "+xy[0].length);

        //Read Single value from the array

      //  System.out.println(xy[1][0]);

        //Read all the rows and columns
        /*//With Classic For Loop
        for(int row=0;row<rst.length;row++){
            for(int col=0;col<rst.length;col++){
                System.out.println(rst[row][col]);
            }
        }*/

        //Enhanced FOR loop

        /*for(int arr[]:rst){
            for(int x: arr )
        {
            System.out.println(x);
        }
    }*/

        // Heterogeneous data types in Object Array

        Object obj[] = {"Wlecome" , 2, 5.0, 'Y', true};

        for(Object x:obj)
        {
            System.out.println(x);
        }

        for(int i=0;i<obj.length;i++)
        {
            System.out.println(obj[i]);
        }

    }

}
