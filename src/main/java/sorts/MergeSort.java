package sorts;

import java.util.Arrays;

public abstract class MergeSort {
    public static int[] mergeSort(int[] input) {
        int[] output = new int[input.length];

        if (input.length > 1) {
            output = merge(Arrays.copyOfRange(input, 0, input.length / 2),
                    Arrays.copyOfRange(input, input.length / 2, input.length));
            return output;
        }

        return input;
    }

    private static int[] merge(int[] a, int[] b) {
        if (a.length > 1) {
            a = merge(Arrays.copyOfRange(a, 0, a.length / 2),
                    Arrays.copyOfRange(a, a.length / 2, a.length));
        }

        if (b.length > 1) {
            b = merge(Arrays.copyOfRange(b, 0, b.length / 2),
                    Arrays.copyOfRange(b, b.length / 2, b.length));
        }


        int indexA = 0;
        int indexB = 0;

        int[] output = new int[a.length + b.length];

        for (int i = 0; i < output.length; i++) {
            if (indexA >= a.length) {
                output[i] = b[indexB];
                indexB++;
            } else if (indexB >= b.length) {
                output[i] = a[indexA];
                indexA++;
            } else if (a[indexA] < b[indexB]) {
                output[i] = a[indexA];
                indexA++;
            } else {
                output[i] = b[indexB];
                indexB++;
            }
        }

        return output;
    }
}
