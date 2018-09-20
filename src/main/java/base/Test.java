package base;

import java.util.Map;

public class Test {

	public static void main(String[] args) {
		// Boolean flag = false;
		// change(flag);
		// System.out.println(flag);
		// System.out.println("619bqjt".equalsIgnoreCase("619BQJT"));
		// T t = new T();
		// System.out.println(t.getI() + ":" + t.getJ() + ":" + t.getS());
		// System.out.println("aaa" + "\r\n" + "bbb");
		// System.out.println("aaa" + "\n" + "bbb");

		// Map<String, String> map = new HashMap<>();
		// getMap(map);
		// System.out.println(map);
		Boolean flag = false;
		getFlag(flag);
		System.out.println(flag);
		int x = 1;
		System.out.println(++x);
		System.out.println(x++);
		System.out.println(System.currentTimeMillis() + "".toString().length());
		Integer i = null;
		String src = (i == 1) ? "ture" : "false";
		System.out.println(src);

	}

	private static void getFlag(Boolean flag) {
		flag = true;
	}

	private static void getMap(Map<String, String> map) {
		map.put("adfa", "sdfas");
		map.put("dsdf", "sdf");
	}

	public static void change(Boolean flag) {
		flag = true;
	}

}

class T {
	public int i;
	public Integer j;
	public String s;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public Integer getJ() {
		return j;
	}

	public void setJ(Integer j) {
		this.j = j;
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

}