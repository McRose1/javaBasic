package MathFunction;

/*  实现对 X 进行 Y 次开根号
    Sqrt() 函数的拓展版本
 */

import java.util.Scanner;

public class SqrtX_Y {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        int y = sc.nextInt();
        x = sqrt(x, y);
        System.out.println(String.format("%.12f", x));
    }

    private static double sqrt(double m, int n) {
        double left = 0;
        double right = m;
        while (left + 10e-12 < right) {
            double mid = left + (right - left) / 2;
            double temp = mid;
            for (int i = 0; i < n - 1; i++) {
                temp *= mid;
            }
            if (temp == m) return mid;
            else if (temp > m) {
                right = mid;
            } else {
                left = mid;
            }
        }
        if (right > m / right) return left;
        else return right;
    }
}
