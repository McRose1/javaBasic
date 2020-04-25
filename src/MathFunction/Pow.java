package MathFunction;

/*  实现 Pow(x, n)
    -100.0 < x < 100.0
    n is a 32-bit signed integer, within the range [−2^31, 2^31 − 1]
    结果可能为小数，所以声明为 double
 */

import java.util.Scanner;
//  Recursion
public class Pow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextInt();
        int n = sc.nextInt();
        double pow = pow(x, n);
        System.out.println(pow);
    }

    private static double pow(double x, int n) {
        double temp;
        if (n == 0) return 1;
        temp = pow(x, n / 2);

        if (n % 2 == 0) return temp * temp;
        else {
            if (n > 0) return x * temp * temp;
            else return (temp * temp) / x;
        }
    }
}
