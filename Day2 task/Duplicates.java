package sdprograms;

import java.util.Scanner;

public class Duplicates {
	public static int removeDuplicates(int[] nums) {
        int left = 0;
        for (int right = 1; right < nums.length; right++) {
            if (nums[left] != nums[right]) {
                nums[++left] = nums[right];
            }
        }
        return left + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) nums[i] = sc.nextInt();
        int len = removeDuplicates(nums);
        for (int i = 0; i < len; i++) System.out.print(nums[i] + " ");
    sc.close();
    }

}
