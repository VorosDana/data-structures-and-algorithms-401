//package challenge02;

public class InsertShiftArray

        public static void main(String[] args) {

        }

        public static int[] insertShiftArray(int[] input, int newNum) {
            int[] output = new int[input.length + 1];

            for (int i = 0; i < input.length - input.length / 2; i++) {
                output[i] = input[i];
            }

            output[output.length / 2] = newNum;

            for (int i = 0; i < input.length / 2; i++) {
                output[output.length - 1 - i] = input[input.length - 1 - i];
            }

            return output;
        }
}