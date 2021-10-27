public class EvenUneven {
    public static void main(String[] args) {
        int[] numbers = new int[] {15, 13, 10, 12, 22, 33, 44, 55, 66, 77, 87, 88};

        sort(numbers);
        System.out.println(printArray(numbers));
    }

    private static void sort(int[] arr) {
        int i = arr[0];
        int j = arr.length - 1;

        while(j > i) {
            if (arr[i] % 2 != 0 && arr[j] % 2 == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            } else {
                if (arr[i] % 2 == 0) {
                    i++;
                }
                if (arr[j] % 2 != 0) {
                    j--;
                }
            }
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

    private static void fillArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((Math.random() * 200) - 100);
        }
    }
}
