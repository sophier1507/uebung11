package p3;

public class P3_main {

	public static void main(String[] args) {
		System.out.println(kapital(1004, 2));
		

	}
	public static int kapital(int k, int n) {
		if (n == 0) {
			return k;
		}
		return kapital(k * (105) / 100, n - 1);
	}
}
