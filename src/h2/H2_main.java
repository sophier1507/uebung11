package h2;


public class H2_main {

	static int[] numbers = new int[1000];
	
	public static void main(String[] args) {

		//benchmark(8);
		
	}
	
	public static int fibonacci(int n) { 
		if ((n == 1) || (n == 2)) {
			return 1;
		}
		return (fibonacci(n - 1) + fibonacci(n - 2));	} 
	
	public static int fibonacciCached(int n) {
		if (numbers[n - 1] != 0) {
			return numbers[n - 1];
		}
		if ((n == 1) || (n == 2)) {
			numbers[n - 1] = 1;
			return 1;
		}
		numbers[n - 1] = fibonacciCached(n - 1) + fibonacciCached(n - 2);
		return numbers[n - 1];
		
	}
	
	public static int it_fibonacci(int n) {
		if ((n == 1) || (n == 2)) {
			return 1;
		}
		int n1 = 1;
		int n2 = 1;
		int temp;
		for(int i = 3; i <= n; i++) {
			temp = n2;
			n2 += n1;
			n1 = temp;	
		}
		return n2;
	}
	
	public static void benchmark(int n) {
		long start = System.nanoTime();
		System.out.println(fibonacci(n));
		long end = System.nanoTime();
		System.out.println("Elapsed nanoseconds (fibonacci) : " + (end - start));
		
		start = System.nanoTime();
		System.out.println(fibonacciCached(n));
		end = System.nanoTime();
		System.out.println("Elapsed nanoseconds (fibonacciCached) : " + (end - start));
		
		start = System.nanoTime();
		System.out.println(it_fibonacci(n));
		end = System.nanoTime();
		System.out.println("Elapsed nanoseconds (it_fibonacci): " + (end - start));
		}
	
	
}
