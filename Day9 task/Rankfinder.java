package sdprograms;

import java.util.Arrays;

public class Rankfinder {	
	    public static int findRank(int[] arr, int target)
	    {
	        int[] sorted = Arrays.copyOf(arr, arr.length);
	        Arrays.sort(sorted);
	        for (int i = 0; i < sorted.length; i++) 
	        {
	            if (sorted[i] == target)
	            {
	                return i + 1;
	            }
	        }
	        return -1; 
	    }
	    public static void main(String[] args)
	    {
	        int[] arr = {50, 20, 30, 20, 40};
	        int target = 30;
	        int rank = findRank(arr, target);
	        if (rank != -1) 
	        {
	            System.out.println("Rank of " + target + " is: " + rank);
	        }
	        else 
	        {
	            System.out.println(target + " not found in the array.");
	        }
	    }
	}


