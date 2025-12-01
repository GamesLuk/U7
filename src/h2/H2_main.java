package h2;

import java.util.Arrays;

public class H2_main {

    public static void main(String[] args) {

    }

    public static int[] change(int[] a, int[] b, int start, int end) {
        if (start < end) {
            if (Arrays.compare(a, b) == 0) {
                return Arrays.copyOfRange(a, 0, a.length-1);
            } else {
                Arrays.sort(a);
                return Arrays.copyOfRange(a, start, end-1);
            }
        } else {
            return new int[0];
        }
    }

}
