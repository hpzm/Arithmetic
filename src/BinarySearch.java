/**
 * @author 夏雨
 */

public class BinarySearch {
  public static void main(String[] args) {
    int[] arr={1,2,3,4,5,6,7};
    int number=8;
    int index=binarySearch(arr,number);
    System.out.println(index);
  }

  public static int binarySearch(int[] arr, int number) {
    int min=0,max=arr.length-1;
    while (min<=max){
      int middle=(min+max)/2;
      if(arr[middle]>number){
        max=middle-1;
      }
      if(arr[middle]<number){
        min=middle+1;
      }
      if(arr[middle]==number){
        return middle;
      }
    }
    return -1;
  }
}
