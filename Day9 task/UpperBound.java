package sdprograms;

public class UpperBound {	
	    public static void main(String args[])
	    {
	        int arr[] = {1, 3, 5, 7, 9, 11, 15, 20};
	        int target = 10;
	        int left = 0;
	        int right = arr.length;
	        int mid;
	        while (left < right) 
	        {
	            mid = (left + right) / 2;
	            if (arr[mid] <= target)
	            {
	                left = mid + 1;
	            } 
	            else 
	            {
	                right = mid;
	            }
	        }
	        if (left < arr.length)
	        {
	            System.out.println("Upper bound found at index " + left + " and value " + arr[left]);
	        }
	        else 
	        {
	            System.out.println("No upper bound found for target " + target);
	        }
	    }
	}

