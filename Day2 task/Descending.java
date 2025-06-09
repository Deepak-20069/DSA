package sdprograms;

import java.util.Arrays;

public class Descending {
	public static void main(String[] args) {
        int[] arr = {10, 30, 20, 50, 40};
        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);
        for (int i = 0; i < sortedArr.length / 2; i++) {
            int temp = sortedArr[i];
            sortedArr[i] = sortedArr[sortedArr.length - i - 1];
            sortedArr[sortedArr.length - i - 1] = temp;
        }
        System.out.print("Sorted array in descending order: ");
        for (int num : sortedArr) {
            System.out.print(num + " ");
        }
    }

}
