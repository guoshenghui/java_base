package base.algorithm;

import java.util.HashMap;

/**
 * 有一座高度是10级台阶的楼梯，从下往上走，每跨一步只能向上1级或者2级台阶。要求用程序来求出一共有多少种走法。
 * @author admin
 *
 */
public class ClimbingWay {
	/*
	 * 递归求解
	 */
	static int getClimbingWays(int n) {
		if (n < 1) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else if (n == 2) {
			return 2;
		} else {
			return getClimbingWays(n - 1) + getClimbingWays(n - 2);
		}
	}

	/**
	 * 备忘录算法
	 * @param n
	 * @param map
	 * @return
	 */
	static int getClimbingWays(int n, HashMap<Integer, Integer> map) {
		if (n < 1) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else if (n == 2) {
			return 2;
		}
		if (map.containsKey(n)) {
			return map.get(n);
		} else {
			int value = getClimbingWays(n - 1) + getClimbingWays(n - 2);
			map.put(n, value);
			return value;
		}
	}

	/**
	 * 动态规划求解
	 * @param n
	 * @return
	 */
	static int getClimbingWays2(int n) {
		if (n < 1) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else if (n == 2) {
			return 2;
		} else {
			int a = 1, b = 2, temp = 0;
			for (int i = 3; i <= n; i++) {
				temp = a + b;
				a = b;
				b = temp;
			}
			return temp;
		}
	}

	public static void main(String[] args) {
		System.out.println(getClimbingWays(25));
		System.out.println(getClimbingWays(25, new HashMap<Integer, Integer>()));
		System.out.println(getClimbingWays2(25));
	}
}
