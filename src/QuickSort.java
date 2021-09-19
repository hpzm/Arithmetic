/**
 * @author 夏雨
 */
public class QuickSort {
  public static void main(String[] args) {
      int[] arr={2,3,1,7,4,8,5,9,6};
      quickSort(arr,0,arr.length-1);
      for (int i = 0; i < arr.length; i++) {
          System.out.print(arr[i] + " ");
      }
  }

    private static void quickSort(int[] arr,int left,int right) {

        if(right<left){
            return;
        }

      int left0=left,right0=right,baseNumber=arr[left0];

      while (left != right){
          while (arr[right] >= baseNumber && right > left ){
              right--;
          }

          while (arr[left] <= baseNumber && right > left){
              left++;
          }

          int temp = arr[left];
          arr[left] = arr[right];
          arr[right] = temp;
      }

        int temp = arr[left];
        arr[left] = arr[left0];
        arr[left0] = temp;

      quickSort(arr,left0,left-1);
      quickSort(arr,left+1,right0);

    }
}
