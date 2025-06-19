package InterviewPrograms;

public class findMissingNuminArry {
    public static void main(String[] args) {


        int[] arr = {9,8, 2, 4, 5, 7};

            int n = arr.length + 1;

            for (int i = 1; i <=n ; i++) {
                boolean found = false;
                for (int j = 0; j < n - 1; j++) {
                    if (arr[j] == i) {
                        found = true;
                        break;
                    }
                }

                // If the current number is not present
                if (!found)
                    System.out.println(i);
            }
        }



}



