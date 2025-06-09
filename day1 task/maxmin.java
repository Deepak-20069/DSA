package sdprograms;

public class maxmin {
	public static void main (String args[]) {
		int[] arr = {4, 7, 1, 9, -3, 12};
        int max = arr[0], min = arr[0];
        for (int i : arr) {
            max = Math.max(max, i);
            min = Math.min(min, i);
        }
        System.out.println("Max: " + max + ", Min: " + min);
	}

}
