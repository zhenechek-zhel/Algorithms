public class QuickSort {
    public static void main(String[] args) {
        int[] numbers = new int[11];
        fillTheArray(numbers);
       quickSort(numbers, 0, numbers.length - 1);
        System.out.println(printArray(numbers));
    }

    private static void quickSort (int[] arr, int from, int to) {
        if (from < to) {
            int divideIndex = partition(arr, from, to);
            quickSort(arr, from, divideIndex - 1);
            quickSort(arr, divideIndex, to);
        }
    }

    private static int partition (int[] arr, int from, int to) {
        int leftIndex = from;
        int rightIndex = to;

        int pivot = arr[from + (to - from) / 2];

        while (leftIndex <= rightIndex) {
            while (arr[leftIndex] < pivot) {
                leftIndex++;
            }
            while (arr[rightIndex] > pivot) {
                rightIndex--;
            }
            if (leftIndex <= rightIndex) {
                swap(arr, leftIndex, rightIndex);
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }

    private static void swap (int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
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

    private static void fillTheArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)((Math.random() * 200) - 100);
        }
    }
}
