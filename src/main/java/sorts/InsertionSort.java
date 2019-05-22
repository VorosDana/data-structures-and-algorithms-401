package sorts;

public abstract class InsertionSort {
    public static int[] insertionSort(int[] input) {
        if (input == null) {
            return null;
        }

        int[] output = input.clone();

        if (input.length < 2) {
            return input;
        }

        for (int i = 1; i < output.length; i++) {
            int j;
            int valueCurrentlyBeingSorted = output[i];

            for (j = i - 1; j >= 0 && output[j] > valueCurrentlyBeingSorted; j--) {
                output[j + 1] = output[j];
            }

            output[j + 1] = valueCurrentlyBeingSorted;
        }

        return output;
    }
}
