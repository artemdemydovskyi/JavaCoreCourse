public class LoopExamples {

    public static void main(String[] args) {
// Using a for loop
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

// Using a foreach loop
        int[] nums = {1, 2, 3, 4, 5};
        for (int num : nums) {
            System.out.println(num);
        }

// Using a while loop
        int j = 1;
        while (j <= 5) {
            System.out.println(j);
            j++;
        }

// Using a do-while loop
        int k = 1;
        do {
            System.out.println(k);
            k++;
        } while (k <= 5);
    }
}


