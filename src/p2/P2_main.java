package p2;

public class P2_main {

	public static void main(String[] args) {
		int a = 32;
		System.out.println(rek_ld(a));
		System.out.println(it_ld(a));

	}
	public static int rek_ld(int a) {
		if (a == 1) {
			return 0;
		}
		return 1 + rek_ld(a / 2);
	}
	public static int it_ld(int a) {
		int count = 0;
		while (a != 1) {
			a /= 2;
			count++;
		}
		return count;
	}

}
