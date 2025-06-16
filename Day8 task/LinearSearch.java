package sdprograms;

public class LinearSearch {
	    public static void main(String[] args) 
	    {
	        int[] arr = {3, 6, 8, 2, 4, 9, 5};
	        int target = 4;
	        int result = linearSearch(arr, target);
	        
	        if (result == -1)
	        {
	            System.out.println("Element not found");
	        } 
	        else 
	        {
	            System.out.println("Element found at index: " + result);
	        }
	    }

	    public static int linearSearch(int[] arr, int target)
	    {
	        for (int i = 0; i < arr.length; i++) 
	        {
	            if (arr[i] == target)
	            {
	                return i;
	            }
	        }
	        return -1;
	    }
	}



