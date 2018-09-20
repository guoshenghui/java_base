package base.grammar.string;

import java.util.Formatter;

public class Test {
	/*
	 * 对齐示例
	 */
	private double total = 0;
	private Formatter f = new Formatter(System.out);

	public void printTitle() {
		f.format("%-5s %5s %10s\n", "Item", "Qty", "Price");
		f.format("%-15s %5s %10s\n", "----", "---", "-----");
	}

	public void print(String name, int qty, double price) {
		f.format("%-15s %5s %10.2f\n", name, qty, price);
		total += price;
	}

	public void printTotal() {
		f.format("%-15s %5s %8.2f\n", "Tax", "", total * 0.06);// 百分比
		f.format("%-15s %5s %8s\n", "", " ", "-----");
		f.format("%-15s %5s %8.2f\n", "Total", "", total * 1.06);
	}

	public static void main(String[] args) {
		String src = "info.outPayPrice";
		String a = "中国人大老师发了";
		System.out.println(src.split("\\.")[0]);

		System.out.println(a.getBytes().length);
		System.out.print(getString(a, 30));
		System.out.print(getString("爱的发声", 30));
	}

	public static String getString(String src, int length) {
		byte[] bytes = src.getBytes();
		if (bytes.length < length) {
			StringBuffer sb = new StringBuffer(src);
			for (int i = 0; i < length - bytes.length; i++) {
				sb.append(" ");
			}
			// System.out.println(sb.length());
			return sb.toString();
		}
		return src;
	}
}