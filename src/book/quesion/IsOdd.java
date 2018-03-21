package book.quesion;

public class IsOdd {
	public static void main(String[] args) {
		System.out.println(isOdd(-1));
		System.out.println(isOdd1(-1));
		System.out.println(isOdd2(-1));
	}

	public static boolean isOdd(int i) {
		return i % 2 == 1;
	}

	public static boolean isOdd1(int i) {
		return i % 2 != 1;
	}

	public static boolean isOdd2(int i) {
		return (i & 1) != 0;
	}
}
