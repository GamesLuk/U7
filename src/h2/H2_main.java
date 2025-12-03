package h2;

import java.util.Arrays;

public class H2_main {

    public static void main(String[] args) {

        int[] a = {2, 7, 1, 9};
        int[] b = {5, 6, 7};

        System.out.println(Arrays.toString(change(a, b, 2, 4)));
        System.out.println(Arrays.toString(change(a, a, 2, 4)));
        System.out.println(Arrays.toString(change(a, a, 3, 2)));

    }

    public static int[] change(int[] a, int[] b, int start, int end) {
        if (start < end) {
            if (Arrays.compare(a, b) != 0) {
                return Arrays.copyOfRange(a, 0, a.length);
            } else {
                Arrays.sort(a);
                return Arrays.copyOfRange(a, start, end);
            }
        } else {
            return new int[0];
        }
    }

}
