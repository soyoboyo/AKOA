import com.sun.org.apache.xpath.internal.operations.Number;

public class Slices {

    public static void main(String args[]) {

        int[] avgTest = {-1, 0, 1, 2};
        System.out.println(slices(avgTest));
    }

    public static int slices(int[] A) {
        int slices = 0;

        for (int i = 0; i < A.length; i++) {

            double avg = 0, count = 0;

            for (int j = i; j < A.length; j++) {
                avg += (double) A[j];
                count++;
                if (count >= 3) {
                    double result = avg / count;
                    // all integers are modulo 1
                    if (result % 1 == 0
//                            || (result*10)%5 == 0
                            ) {
                        slices++;
                    }
                }
            }
        }
        return slices;
    }

}
