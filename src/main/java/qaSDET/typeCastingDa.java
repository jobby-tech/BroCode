package qaSDET;

public class typeCastingDa {

    public static void main(String[] args) {


        // Automatic Upcasting
        int x=10;
        float y=x;

        float z = 40.8F;
        double g=z;
        System.out.println(y);
        System.out.println(g);


        // Downcasting

        float q=46.5F;
        int w= (int) q;

        long e=1352463777;
        int r= (int) e;


        System.out.println(w);
        System.out.println(r);
    }
}
