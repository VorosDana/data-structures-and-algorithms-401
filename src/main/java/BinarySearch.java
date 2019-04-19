public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        // If array is null or empty, target certainly isn't in it
        if (arr == null || arr.length == 0) {
            return -1;
        }

        // Set the search range as the endpoints of the array
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // We check the middle element of the search range
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            // If we're left of the target, make the current midpoint the left end of the search
            // Round up to avoid rounding error-induced infinite loops
            if (arr[mid] < target) {
                // This works for dividing by 2 rounding up, don't think it would work in other situations
                left = (left + right + 1) / 2;
            }

            if (arr[mid] > target) {
                right = mid;
            }
        }

        if (arr[left] == target) {
            return left;
        }

        return -1;
    }
}
