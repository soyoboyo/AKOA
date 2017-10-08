
import java.util.Arrays;

public class TimeComplexity {
    public static void main(String args[]) {

//        int[] testMissing = {1, 2, 3, 5, 4, 6, 8};
//        System.out.println("missing number: " + missingNumber(testMissing, 3));


//        System.out.println("jumps: " + frogJumps(10,85,30));

        int[] testTape = {3, 1, 2, 4, 3};
        System.out.println("min number = " + tapeCutter(testTape, testTape.length));

    }

    static int missingNumber(int[] A, int N) {
        Arrays.sort(A);
        for (int i = 0; i < A.length; i++) {
            System.out.println("A[" + i + "] = " + A[i]);
        }
        for (int i = 0; i < A.length; i++) {
            if (i + 1 != A[i]) {
                return i + 1;
            }
        }

        return 0;
    }

    static int frogJumps(int X, int Y, int D) {
        int dist = Y - X;
        System.out.println("dist to do: " + dist);
        return dist / D + D;
    }

    static int tapeCutter(int[] A, int N) {
        int min = 1000000;
        int P = 2;
        int leftSum = 0, rightSum = 0;

        for (int i = 0; i < N - 1; i++) {
            if (i <= P - 1) {
                leftSum += A[i];
            } else {
                rightSum += A[i];
            }
            min = Math.min(min, absolu(leftSum - rightSum));
            leftSum = 0;
            rightSum = 0;
        }


        return min;
    }

    static int absolu(int x) {
        if (x >= 0) {
            return x;
        } else {
            return -1 * x;
        }
    }

}
