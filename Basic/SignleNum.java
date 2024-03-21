import java.util.Scanner;

/**
 * 6. Given a non-empty array of integers nums, every element appears twice except for one. 
Find that single one. Could you implement a solution with a linear runtime complexity and 
without using extra memory?(Hint: xor)
Input: nums = [2,2,1]
Output: 1
Input: nums = [4,1,2,1,2]
Output: 4
 */
public class SignleNum {
    public static void main(String[] args) {
        int[] nums = {2, 2, 1};
        System.out.println(findSingleNumber(nums));
    }

    public static int findSingleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
}

/**
 * A number XOR itself is 0: 
a⊕a=0
A number XOR 0 is the number itself: 
a⊕0=a
XOR is commutative and associative: Meaning 
a⊕b=b⊕a and (a⊕b)⊕c=a⊕(b⊕c). 
This allows for the order of operations to be rearranged without affecting the result.
 */
