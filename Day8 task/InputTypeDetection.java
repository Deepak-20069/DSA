package sdprograms;

import java.util.Scanner;

public class InputTypeDetection {
	    public static void main(String[] args) 
	    {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number of elements: ");
	        int n = scanner.nextInt();
	        int[] arr = new int[n];
	        
	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < n; i++) 
	        {
	            arr[i] = scanner.nextInt();
	        }

	        System.out.print("Enter the element to search: ");
	        int target = scanner.nextInt();

	        int result = linearSearch(arr, target);

	        if (result == -1) {
	            System.out.println("Element not found.");
	        } else {
	            System.out.println("Element found at index: " + result);
	        }
	        
	        scanner.close();
	    }

	    public static int linearSearch(int[] arr, int target) 
	    {
	        for (int i = 0; i < arr.length; i++) 
	        {
	            if (arr[i] == target) {
	                return i;
	            }
	        }
	        return -1;
	    }
	}

	    
	



