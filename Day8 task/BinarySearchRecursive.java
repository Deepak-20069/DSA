package sdprograms;

public class BinarySearchRecursive {
	
	    public static void main(String[] args) {
	        int[] arr = {2, 4, 6, 8, 9, 12, 15};
	        int target = 9;
	        int result = binarySearch(arr, target, 0, arr.length - 1);
	        
	        if (result == -1) {
	            System.out.println("Element not found");
	        } else {
	            System.out.println("Element found at index: " + result);
	        }
	    }

	    public static int binarySearch(int[] arr, int target, int left, int right) {
	        if (left > right) {
	            return -1;
	        }
	        
	        int mid = left + (right - left) / 2;
	        
	        if (arr[mid] == target) {
	            return mid;
	        }
	        
	        if (arr[mid] > target) {
	            return binarySearch(arr, target, left, mid - 1);
	        } else {
	            return binarySearch(arr, target, mid + 1, right);
	        }
	    }
	}



