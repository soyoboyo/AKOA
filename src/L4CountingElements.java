import java.util.Arrays;

public class L4CountingElements {

    public static void main(String args[]) {
//        int[] permTest = {1,2,3,4};System.out.println("is permutation? " + isPerm(permTest, permTest.length));;


    }

    public static boolean isPerm(int[] A, int N) {
        boolean isPerm = true;

        Arrays.sort(A);

        for (int i = 1; i < N - 1; i++) {
            if (A[i - 1] != (A[i] - 1)) {
                isPerm = false;
            }
        }

        return isPerm;
    }

}
