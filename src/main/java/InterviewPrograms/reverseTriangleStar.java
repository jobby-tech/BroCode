package InterviewPrograms;

public class reverseTriangleStar {

    public static void main(String[] args) {


                int rows = 5; // Number of rows in the triangle

                for (int i = 0; i < rows; i++) {


                    // Print stars (decreasing with each row)
                    for (int k = 0; k < rows - i; k++) {
                        System.out.print("*");
                    }

                    // Move to the next line after each row
                    System.out.println();
                }
            }

}
