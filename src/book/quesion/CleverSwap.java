package book.quesion;

public class CleverSwap {

	public static void main(String[] args) {
		int x = 1984;// (0x7c0)
		int y = 2001;// (0x7dl)
		x ^= y ^= x ^= y;
		System.out.println("x=" + x + ";y=" + y);
	}
}
