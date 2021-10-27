public class ChoiceSort {
    public static void main(String[] args) {
        int[] numbers = new int[20];
        fillArray(numbers);
        choiceSort(numbers);
        System.out.println(printArray(numbers));
    }

    private static void choiceSort(int[] arr) {
        for (int step = 0; step < arr.length; step++) {
            int index = min(arr, step);

            int temp = arr[step];
            arr[step] = arr[index];
            arr[index] = temp;
        }
    }

    private static int min (int[] arr, int start) {
        int minValue = arr[start];
        int minIndex = start;

        for (int i = start + 1; i < arr.length; i++) {
            if (arr[i] < minValue){
                minValue = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
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
