package sorts;

public abstract class QuickSort {
    private static int[] quickSort(int[] input, int start, int end) {
        if (end - start < 2) {
            if (input[start] > input[end]) {
                swap(input, start, end);
            }
            return input;
        }

        // Take the index of the pivot
        // The pivot will be the median value of the start, end, and middle element
        int pivotIndex = -1;
        if ((input[start] < input[end] && input[start] > input[(start + end) / 2])
                || (input[start] > input[input.length - 1] && input[start] < input[(start + end) / 2])) {
            pivotIndex = start;
        } else if ((input[end] > input[start] && input[end] < input[(start + end) / 2])
                || (input[end] < input[start] && input[end] > input[(start + end) / 2])) {
            pivotIndex = end;
        } else {
            pivotIndex = (start + end) / 2;
        }

        int fromLeftIndex = Integer.MIN_VALUE;
        int fromRightIndex = Integer.MAX_VALUE;

        // move pivot to the end to get it out of the way
        // it will go where it belongs after this round, we do not know where that is though
        swap(input, pivotIndex, end);

        while (fromRightIndex > fromLeftIndex) {
            fromLeftIndex = Integer.MAX_VALUE;
            fromRightIndex = Integer.MIN_VALUE;

            // find the first element that is greater than the pivot,
            // start from left so we can move it toward the end
            for (int i = start; i < end; i++) {
                if (input[i] > input[end]) {
                    fromLeftIndex = i;
                    break;
                }
            }

            // repeat for first element from right that is
            // less than pivot
            for (int i = end - 1; i >= start; i--) {
                if (input[i] < input[end]) {
                    fromRightIndex = i;
                }
            }

            if (fromLeftIndex < fromRightIndex) {
                swap(input, fromLeftIndex, fromRightIndex);
            }
        }

        swap(input, fromLeftIndex, end);
        quickSort(input, fromLeftIndex + 1, end);
        quickSort(input, start, fromLeftIndex - 1);
        return input;
    }

    private static void swap(int[] arr, int indexA, int indexB) {
        int swap = arr[indexA];
        arr[indexA] = arr[indexB];
        arr[indexB] = swap;
    }

    public static int[] quickSort(int[] input) {
        return quickSort(input, 0, input.length - 1);
    }
}
