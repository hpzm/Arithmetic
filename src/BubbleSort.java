/**
 * @author 夏雨
 */
public class BubbleSort {
  public static void main(String[] args) {
    int[] arr={2,3,1,7,4,8,5,9,6};
    bubbleSort(arr);
  }

  private static void bubbleSort(int[] arr) {
    for (int i = 0; i < arr.length-1; i++) {
      for (int j = 0; j < arr.length - 1 - i; j++) {
        if (arr[j] > arr[j + 1]) {
          arr[j] = arr[j] ^ arr[j + 1];
          arr[j + 1] = arr[j] ^ arr[j + 1];
          arr[j] = arr[j] ^ arr[j + 1];
        }
      }
    }
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]+" ");
    }
  }


}
