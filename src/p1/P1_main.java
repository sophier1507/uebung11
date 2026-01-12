package p1;

public class P1_main {

	public static void main(String[] args) {
		double a = 1.5; //net float!!!
		int b = 3;
		System.out.println(rpotenz(a, b));
		System.out.println(ipotenz(a, b));

	}
	public static double rpotenz(double a, int b) {
		if (b == 0) {
			return 1;
		}
		return a * rpotenz(a, b - 1);
	}
	public static double ipotenz(double a, int b) {
		double result = 1;
		for (int i = 0; i < b; i++) {
			result *= a;
		}
		return result;
	}

}
