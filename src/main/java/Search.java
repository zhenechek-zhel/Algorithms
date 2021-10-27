import jdk.swing.interop.SwingInterOpUtils;

public class Search {
    public static void main(String[] args) {
        int[] numbers = new int[]{13, 10, 43, 34, 56, 89, 90, 62, 53, 77, 71, 18};
        bubbleSort(numbers);
        System.out.println(printArray(numbers));
        System.out.println(binarySearch(numbers, 89));
    }

    private static int lineSearch(int[] arr, int findElement) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Searching at index: " + i + ", element: " + arr[i]);
            if (arr[i] == findElement) {
                System.out.println("Search index: " + i);
                return arr[i];
            }
        }
        return -1;
    }


    private static int binarySearch (int[] arr, int findElement) {
        int startIndex = 0;
        int endIndex = arr.length;
        int middleIndex;

        while(startIndex <= endIndex) {
            middleIndex = startIndex + (endIndex - startIndex) / 2;
            System.out.println("startIndex: " + startIndex + ", endIndex: " + endIndex + ", middleIndex: " + middleIndex);
            if (arr[middleIndex] == findElement) {
                System.out.println("found " + findElement + " at: " + middleIndex);
                return middleIndex;
            }

            if (arr[middleIndex] < findElement) {
                startIndex = middleIndex + 1;
            } else {
                endIndex = middleIndex - 1;
            }
        }
        return -1;
    }

   private static int binaryRecursive (int[] arr, int startIndex, int endIndex, int findElement) {
        if (startIndex <= endIndex) {
            int middleIndex = startIndex + (endIndex - startIndex) / 2;
            if (arr[middleIndex] == findElement) {
                return middleIndex;
            }

            if (arr[middleIndex] < findElement) {
                return binaryRecursive(arr, middleIndex + 1, endIndex, findElement);
            } else {
                return binaryRecursive(arr, startIndex, middleIndex - 1, findElement);
            }
        }
        return -1;
   }

    private static void bubbleSort(int[] arr) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
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
            arr[i] = (int) ((Math.random() * 100) - 50);
        }
    }
}
