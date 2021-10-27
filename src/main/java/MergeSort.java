public class MergeSort {
    public static void main(String[] args) {
        int[] numbers = new int[11];
        fillArray(numbers);
        mergeSort(numbers);
        System.out.println(printArray(numbers));

        }

    private static int[] mergeSort (int[] array) {
        int[] temp;
        int[] currentSrc = array;
        int[] currentDest = new int[array.length];

        int size = 1;
        while(size < array.length) {
            for (int i = 0; i < array.length; i += size * 2) {
                merge(currentSrc, i, currentSrc, i + size, currentDest, i, size);
            }
            temp = currentSrc;
            currentSrc = currentDest;
            currentDest = temp;

            size *= 2;
            System.out.println(printArray(array));
        }
        return currentSrc;
    }

    private static void merge (int[] src1, int src1Start, int[] src2, int src2Start, int[] dest, int destStart, int size) {
        int index1 = src1Start;
        int index2 = src2Start;

        int src1End = Math.min(src1Start + size, src1.length);
        int src2End = Math.min(src2Start + size, src2.length);

        if (src1Start + size > src1.length) {
            for (int i = src1Start; i < src1End; i++) {
                dest[i] = src1[i];
            }
            return;
        }
        int iterationCount = src1End - src1Start + src2End - src2Start;

        for (int i = destStart; i < dest.length; i++) {
            if (index1 < src1End && (index2 >= src2End || src1[index1] < src2[index2])) {
                dest[i] = src1[index1];
                index1++;
            } else {
                dest[i] = src2[index2];
                index2++;
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

    private static void fillArray (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)((Math.random() * 100) - 50);
        }
    }
}
