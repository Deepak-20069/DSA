package sdprograms;

import java.util.Scanner;

public class FrequencyCount {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of elements: ");
	        int n = scanner.nextInt();
	        int[] arr = new int[n];
	        
	        System.out.println("Enter the elements of the sorted array: ");
	        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();

	        System.out.print("Enter the target element: ");
	        int target = scanner.nextInt();

	        int firstIndex = binarySearch(arr, target, true);
	        int lastIndex = binarySearch(arr, target, false);

	        System.out.println(firstIndex == -1 ? "Element not found." : "Frequency of " + target + " is: " + (lastIndex - firstIndex + 1));

	        scanner.close();
	    }

	    public static int binarySearch(int[] arr, int target, boolean findFirst) {
	        int left = 0, right = arr.length - 1, result = -1;
	        while (left <= right) {
	            int mid = left + (right - left) / 2;
	            if (arr[mid] == target) {
	                result = mid;
	                if (findFirst) right = mid - 1;
	                else left = mid + 1;
	            } else if (arr[mid] < target) left = mid + 1;
	            else right = mid - 1;
	        }
	        return result;
	    }
	}



