import java.util.Arrays;

/**
 * (Occurrence of max numbers) Write a program that reads integers, finds the
largest of them, and counts its occurrences. Assume that the input ends with
number 0. Suppose that you entered 3 5 2 5 5 5 0; the program finds that the
largest is 5 and the occurrence count for 5 is 4.
Enter numbers: 3 5 2 5 5 5 0
The largest number is 5
The occurrence count of the largest number is 4
 */
public class OccurenceMaxNum {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 2, 5, 5, 5, 6};
        System.out.println("Enter numbers: " + Arrays.toString(numbers));
        count(numbers);
    }

    public static void count(int[] numbers) {
        int max = numbers[0];
        int counter = 1;
        for (int i = 1; i < numbers.length; i++) {
            int cur = numbers[i];
            if (max < cur) {
                max = cur;
                counter = 1;
            } else if (max == cur) {
                counter++;
            }
        }
        System.out.println("The largest is " + max);
        System.out.println("The occurrence count of the largest number is " + counter);
    }
}

/**
 * 1 - find the max number by comparing one by one
 * 2 - if the curr > max: 
 *          max = curr;
 *          initiate the counter;
 * 3 - if the curr = max;
 *          counter ++;
 */