package base.algorithm;

public class PrintTriangle {
    public static void main(String[] args) {
      print1(7);
    }

    public static void print1(int n) {
        for (int i = 0; i < n; i++) {
            if (i < n / 2 + 1) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < n - 2 * i; k++) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                for (int j = 1; j < n - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < 2 * i + 2 - n; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
