package sdprograms;

public class RotatedSortedArray {
	    public static void main(String[] args)
	    {
	        int[] arr = {6, 7, 9, 15, 19, 2, 3};
	        int target = 3;
	        int result = search(arr, target);
	        
	        if (result == -1) 
	        {
	            System.out.println("Element not found");
	        }
	        else 
	        {
	            System.out.println("Element found at index: " + result);
	        }
	    }
	    public static int search(int[] arr, int target)
	    {
	        int left = 0;
	        int right = arr.length - 1;
	        
	        while (left <= right)
	        {
	            int mid = left + (right - left) / 2;
	            
	            if (arr[mid] == target)
	            {
	                return mid;
	            }	         	            
	            if (arr[left] <= arr[mid]) 
	            {
	                if (arr[left] <= target && target < arr[mid]) 
	                {
	                    right = mid - 1; 
	                } 
	                else 
	                {
	                    left = mid + 1; 
	                }
	            } 	            
	            else
	            {
	                if (arr[mid] < target && target <= arr[right])
	                {
	                    left = mid + 1; 
	                } 
	                else
	                {
	                    right = mid - 1;
	                }
	            }
	        }	        
	        return -1; 
	    }
	}



