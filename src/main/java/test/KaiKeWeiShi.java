package test;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class KaiKeWeiShi {
    public static void main(String[] args) {
        // getNarcissusNums();
       // caculate(2, 5);
        int[] nums = {12, 18, 19, 15, 26, 29, 49, 15, 12, 19, 29, 12, 18};
       // getRepeatNums(nums);
        print(8);
    }

    public static void getNarcissusNums() {
        int g = 0, s = 0, b = 0, sum = 0;
        for (int i = 100; i <= 999; i++) {
            b = i / 100;
            s = (i - b * 100) / 10;
            g = i - b * 100 - s * 10;
            sum = b * b * b + s * s * s + g * g * g;
            // sum = (int) (Math.pow(b,3)+Math.pow(s,3)+Math.pow(g,3));
            if (sum == i) {
                System.out.println(i);
            }
        }
    }

    public static int caculate(int a, int b) {
        int c = 0, sum = 0;
        for (int n = 1; n <= b; n++) {
            c = (c * 10) + a;
            sum += c;
        }
        System.out.print("sum=" + sum);
        return sum;
    }

    public static void getRepeatNums(int[] nums) {
        // map 的键 为 nums 中的整数，值 为 nums 中整数的位置
        Map<Integer, List<Integer>> map = new LinkedHashMap<>(); // LinkedHashMap 可以维护键值对 加入 map 的顺序
        for (int i = 0; i < nums.length; i++) {
            List<Integer> positions = map.get(nums[i]);
            if (positions == null) { // 如果 map 的键 中不存在这个整数
                positions = new ArrayList<>(1);
                map.put(nums[i], positions); // 将这个整数和与其关联的位置 positions 放入 map
            }
            positions.add(i);
        }
        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            List<Integer> positions = entry.getValue();
            if (positions.size() > 1) { // 如果一个整数对应的位置数量大于 1，说明这个整数重复
                int num = entry.getKey();
                StringBuilder result = new StringBuilder();
                result.append(num).append(' ').append(positions);
                System.out.println(result);
            }
        }
    }

    public static void print(int size) {
        // 计算菱形大小
        if (size % 2 == 0) { size++;}
        for (int i = 0; i < size / 2 + 1; i++) {
            for (int j = size / 2 + 1; j > i + 1; j--) {
                System.out.print(" "); // 输出左上角位置的空白
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*"); // 输出菱形上半部边缘
            }
            System.out.println(); // 换行
        }
        for (int i = size / 2 + 1; i < size; i++) {
            for (int j = 0; j < i - size / 2; j++) {
                System.out.print(" "); // 输出菱形左下角空白
            }
            for (int j = 0; j < 2 * size - 1 - 2 * i; j++) {
                System.out.print("*"); // 输出菱形下半部边缘
            }
            System.out.println(); // 换行
        }
    }

}
