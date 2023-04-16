package sortingAlgorithms;

import java.util.Arrays;

/**
 * The following class describes a few sorting approaches that might be used and effective
 * in accordance with a number of values that are passed
 */
public class SortingAlgs {

    public static void main(String[] args) {
        int[] data = {11, 3, 14, 16, 7};
        bubbleSort(data);
        quickSort(data, 0, data.length - 1);

    }

    /**
     * The method describe one of the simplest but the least effective sorting algorithms
     *
     * @param intArray - an array of integer values that should be sorted in the ascending way
     */
    private static void bubbleSort(int[] intArray) {

        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < intArray.length - 1; i++) {
                if (intArray[i] > intArray[i + 1]) {
                    isSorted = false;

                    buf = intArray[i];
                    intArray[i] = intArray[i + 1];
                    intArray[i + 1] = buf;
                }
            }
        }
        System.out.println("Bubble sort: " + Arrays.toString(intArray));
    }


    /**
     * An array is divided into subarrays by selecting a pivot element (element selected from the array).
     * <p>
     * While dividing the array, the pivot element should be positioned in such a way that elements less than pivot are kept on the left side and elements greater than pivot are on the right side of the pivot.
     * The left and right subarrays are also divided using the same approach. This process continues until each subarray contains a single element.
     * At this point, elements are already sorted. Finally, elements are combined to form a sorted array.
     */
    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];

        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;

                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }

        }

        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return (i + 1);
    }

    private static void quickSort(int[] array, int low, int high) {
        if (low < high) {

            int pi = partition(array, low, high);

            quickSort(array, low, pi - 1);

            quickSort(array, pi + 1, high);
        }
    }
}
