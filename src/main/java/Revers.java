public class Revers {
    public static void main(String[] args) {
        int[] numbers = new int[] {10, 32, 45, 23, 876, 23, 21, 456, 8976};
        revers(numbers);
        System.out.println(printArray(numbers));
    }
    private static void revers(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[n - i - 1];
            arr[n - i - 1] = arr[i];
            arr[i] = temp;
        }
    }

    private static String printArray(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(arr[i]);
        }
        sb.append("]");
        return sb.toString();
    }
}
