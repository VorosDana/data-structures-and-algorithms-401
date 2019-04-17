import java.util.Arrays;

public class ArrayReverse {
  public static void main(String[] args){
    int[] testArray1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int[] testArray2 = {67, 2, 4, 6, 18, 690, 62};
    reverseArray(testArray1);
    fancyReverse(testArray2);

    System.out.println("Test Array 1:");
    System.out.println(Arrays.toString(testArray1));

    reverseArray(testArray1);

    System.out.println("\n\nTest array 1 reversed back:");
    System.out.println(Arrays.toString(testArray1));


    System.out.println("\n\nTest Array 2:");
    System.out.println(Arrays.toString(testArray2));

  }

  public static int[] reverseArray(int[] arr){
    for(int i = 0; i < arr.length / 2; i++){
      int temp = arr[i];
      arr[i] = arr[arr.length - 1 - i];
      arr[arr.length - 1 - i] = temp;
    }
    return arr;
  }

  public static int[] fancyReverse(int[] arr){
    for(int i = 0; i < arr.length >>1; i++){
      arr[i] ^= arr[arr.length - 1 - i];
      arr[arr.length - 1 - i] ^= arr[i];
      arr[i] ^= arr[arr.length - 1 - i];
    }
    return arr;
  }
}