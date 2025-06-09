package sdprograms;

public class Arrayoperations { 
	public static void main(String[] args) {
		int[] arr = {1, 2, 4, 5};
        int pos = 2, val = 3;
        int[] newArr = new int[arr.length + 1];

        for (int i = 0; i < pos; i++) newArr[i] = arr[i];
        newArr[pos] = val;
        for (int i = pos; i < arr.length; i++) newArr[i + 1] = arr[i];

        for (int n : newArr) System.out.print(n + " ");
       
    }
}
