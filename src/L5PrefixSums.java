import com.sun.javafx.scene.control.skin.VirtualFlow;

import java.util.ArrayList;

public class L5PrefixSums {
    public static void main(String args[]) {

        int[] countDivsTest = {6, 11, 2,
                0, 0, 11,
                11, 345, 17,
                10, 10, 5,
                10, 10, 7,
                10, 10, 20};
        int[] countDivTestAns = {3, 1, 20, 1, 1, 1};

        for (int i = 0, j = 0; j < countDivTestAns.length - 1; i += 3, j++) {
            System.out.println(
                    countDividers(countDivsTest[i], countDivsTest[i + 1], countDivsTest[i + 2]) == countDivTestAns[j]
            );
        }

    }

    public static int countDividers(int a, int b, int k) {
        int count;
        count = (b - a);
        int divs = count / k;
        if (a == b && a%k == 0) {
            divs++;
        }

        return divs;
    }
}
