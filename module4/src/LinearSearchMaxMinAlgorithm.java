
public class LinearSearchMaxMinAlgorithm {

    static class Pair {
        int min;
        int max;
    }

    static Pair getMinMax(int[] arr) {
        Pair minmax = new  Pair();
        int i;
        int arrayLength = arr.length;

        if (arrayLength == 1) {
            minmax.max = arr[0];
            minmax.min = arr[0];
            return minmax;
        }

        if (arr[0] > arr[1]) {
            minmax.max = arr[0];
            minmax.min = arr[1];
        } else {
            minmax.max = arr[1];
            minmax.min = arr[0];
        }

        if(arrayLength > 2) {
            for (i = 2; i < arrayLength; i++) {
                if (arr[i] > minmax.max) {
                    minmax.max = arr[i];
                } else if (arr[i] < minmax.min) {
                    minmax.min = arr[i];
                }
            }
        }
        return minmax;
    }

    public static void main(String[] args) {
        int[] arr = {1000, 11, 445, 1, 330, 3000};
        Pair minmax = getMinMax(arr);
        System.out.printf("\nMinimum element is %d", minmax.min);
        System.out.printf("\nMaximum element is %d", minmax.max);

    }

}