package com.jza.lessons;

import java.util.Arrays;

public class DemoTask {

    public static int findSmall(int []A) {

        Arrays.sort(A);

        int min = 1;
        boolean inArray = false;

        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] + 1 != A[i + 1] && A[i] > 0) {
                min = A[i] + 1;
                inArray = true;
            }
        }

        if (inArray == false && A[A.length-1] > 0 ) {
            min = A[A.length-1] + 1;
        }
        return min;
    }

}


/*


This is a demo task.

Write a function:

    class Solution { public int solution(int[] A); }

that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

For another example, given A = [1, 2, 3], the function should return 4.

Given A = [−1, −3], the function should return 1.

Assume that:

        N is an integer within the range [1..100,000];
        each element of array A is an integer within the range [−1,000,000..1,000,000].

Complexity:

        expected worst-case time complexity is O(N);
        expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).

Elements of input arrays can be modified.


 */