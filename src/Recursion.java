/**
 * @author 夏雨
 */
public class Recursion {
  public static void main(String[] args) {
    int sum=getSum(100);
    System.out.println(sum);
  }

    private static int getSum(int i) {
      if(i == 1){
          return 1;
      }else {
          return i+getSum(i-1);
      }
    }
}
