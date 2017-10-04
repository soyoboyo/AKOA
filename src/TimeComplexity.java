
import java.util.Arrays;

public class TimeComplexity {
    public static void main(String args[]) {

        int[] testMissing = {1, 2, 3, 5, 4, 6, 8};
        System.out.println("missing number: " + missingNumber(testMissing, 3));

    }

    static int missingNumber(int[] A, int N) {
        Arrays.sort(A);
        for (int i = 0; i < A.length; i++) {
            System.out.println("A[" + i + "] = " + A[i]);
        }
        for (int i = 0; i < A.length; i++) {
            if (i+1 != A[i]) {
                return i+1;
            }
        }

        return 0;
    }
}
