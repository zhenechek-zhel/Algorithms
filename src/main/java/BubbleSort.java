public class BubbleSort {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        fillArray(numbers);
        bubbleSort(numbers);
       System.out.println(printArray(numbers));
    }

    private static void bubbleSort(int[] array) {
        boolean isSorted = false;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                    isSorted = false;
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
            arr[i] = (int)((Math.random() * 200) - 100);
        }
    }
}
