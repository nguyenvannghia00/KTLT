package nguyenvannghia.buoi4;
import java.util.Scanner;
public class it24b {
   int arr [] ={ 3, 5, 8, 10, 14, 25};
   public static void bai4_1() {
      int arr[] = { 3, 5, 8, 10, 14, 25 };
      System.out.print("\nDanh sách phần tử của mảng arr là: ");
      for (int i = 0; i < arr.length; i++) {
          System.out.printf("\narr[%d] = %d", i, arr[i]);
      }
  }

  public static void bai4_2() {
      String nguHanh[] = { "kim", "mộc", "thủy", "hỏa", "thổ" };
      System.out.print("\nDanh sách phần tử của mảng nguHanh là: ");
      for (int i = 0; i < nguHanh.length; i++) {
          System.out.printf("\nnguHanh[%d] = %s", i, nguHanh[i]);
      }
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
      int num;
      System.out.print("\nNhập giá trị: ");
      num = sc.nextInt();
      bai4_1();
 }
}