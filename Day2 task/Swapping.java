package sdprograms;

import java.util.Scanner;

public class Swapping
 {
	public static int reverseNumber(int n) {
        String numStr = Integer.toString(n);
        char[] numArray = numStr.toCharArray();
        int left = 0, right = numArray.length - 1;
        while (left < right) {
            char temp = numArray[left];
            numArray[left] = numArray[right];
            numArray[right] = temp;
            left++;
            right--;
        }
        return Integer.parseInt(new String(numArray));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        System.out.println("Reversed number: " + reverseNumber(number));
    sc.close();
    }

}
