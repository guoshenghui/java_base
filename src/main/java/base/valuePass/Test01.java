package base.valuePass;

public class Test01 {
	public static void main(String[] args) {
		T t = new T("2");
		System.out.println(t);
		change(t);
		System.out.println(t.getName());
	}

	private static void change(T t) {
		System.out.println(t);
		t = new T("1");
		System.out.println(t);
	}
}

class T {
	String name;

	public T(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
