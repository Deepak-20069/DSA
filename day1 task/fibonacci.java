package sdprograms;

public class fibonacci {
	static int fact(int n) { return (n <= 1) ? 1 : n * fact(n - 1); }
    static int fib(int n)  { return (n <= 1) ? n : fib(n - 1) + fib(n - 2); }

    public static void main(String[] args) {
        System.out.println("Factorial of 5: " + fact(5));
        System.out.println("Fibonacci of 6: " + fib(6));
		
	}

}
