import java.util.Arrays;

public class L4CountingElements {

    public static void main(String args[]) {
//        int[] permTest = {1,2,3,4};System.out.println("is permutation? " + isPerm(permTest, permTest.length));;

        int[] leafTest = {2, 3, 4, 6, 2, 2, 2, 2, 1, 1, 1, 1, 5};
        System.out.println("jump time: " + frog(leafTest, 6));

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

    public static int frog(int[] A, int X) {
        int len = A.length;
        int counter = 0;

        int[] leaves = new int[X];
        for (int leaf : leaves) {
            leaf = 0;
        }
        System.out.println(Arrays.toString(leaves));

        for (int i = 0; i < len; i++) {
            if (leaves[A[i] - 1] == 0) {
                leaves[A[i] - 1] = 1;
                counter++;
                if (counter == X) {
                    return i + 1;
                }
            }
        }

        return -1;
    }

    public static int[] counters(int[] A, int N) {

        
    }

}
