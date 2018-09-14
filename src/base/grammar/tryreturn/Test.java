package base.grammar.tryreturn;

public class Test {
	public static void main(String[] args) {
		Test test = new Test();
		System.out.println(test.add());
	}

	public int add() {
		int x = 1;
		try {
			// System.exit(0);
			return x << 2;
		} catch (Exception e) {

		} finally {
			++x;
		}
		return x;
	}
}
