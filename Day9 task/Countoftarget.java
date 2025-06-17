package sdprograms;

public class Countoftarget {	
	    public static int countOccurrences(int[] arr, int target)
	    {
	        int count = 0;
	        for (int num : arr)
	        {
	            if (num == target)
	            {
	                count++;
	            }
	        }
	        return count;
	    }

	    public static void main(String[] args) 
	    {
	        int[] arr = {1, 2, 2, 2, 3, 4, 5};
	        int target = 2;

	        int count = countOccurrences(arr, target);
	        System.out.println("Count of " + target + " is: " + count);
	    }
	}



