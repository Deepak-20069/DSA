package sdprograms;

import java.util.Scanner;

public class main_program {
	 static int[] a = new int[100];
	 static int n = 0; 
	 static Scanner sc = new Scanner(System.in);
	    static void menu() {
	        System.out.println("1-Add 2-Del 3-Show 4-Search 5-Exit");
	        switch (sc.nextInt()) {
	            case 1 -> a[n++] = sc.nextInt();
	            case 2 -> { int i = sc.nextInt();
	            if (i < n) System.arraycopy(a, i + 1, a, i, --n - i); }
	            case 3 -> { for (int i = 0; i < n; i++)
	            	System.out.print(a[i] + " "); 
	            System.out.println(); 
	            }
	            case 4 -> { int v = sc.nextInt();
	            
	            for (int i = 0; i < n; i++) if (a[i] == v) { 
	            	System.out.println("At " + i); break; } 
	            }
	            case 5 -> { return; }
	        }
	        menu();
	    }
	    public static void main(String[] args) { menu(); }

}
