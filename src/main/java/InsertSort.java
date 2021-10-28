import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[] numbers = new int[]{2, 7, 5, 3, 9, 1, 6, 4, 8, 11, 12, 10};
        insertSorting(numbers);
        System.out.println(Arrays.toString(numbers));
    }

   private static void insertSorting(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i;
            while (j > 0 && arr[j - 1] > current) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = current;
        }
   }
}
