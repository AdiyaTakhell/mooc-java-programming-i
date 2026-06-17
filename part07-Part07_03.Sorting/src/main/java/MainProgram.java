import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        int[] array = {3, 1, 5, 99, 3, 12};
        sort(array);
    }

    public static int smallest(int[] array) {
        int smallestNumber = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallestNumber) {
                smallestNumber = array[i];
            }
        }
        return smallestNumber;
    }

    public static int indexOfSmallest(int[] array) {
        int smallestIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[smallestIndex]) {
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallestIndex = startIndex;
        for (int i = startIndex; i < table.length; i++) {
            if (table[i] < table[smallestIndex]) {
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = indexOfSmallestFrom(array, i);
            swap(array, i, minIndex);
            System.out.println(Arrays.toString(array));
        }
    }
}
