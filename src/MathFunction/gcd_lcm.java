package MathFunction;

/*  求两个数字的最大公约数
    辗转相除法（欧几里得算法）

    求两个数字的最小公倍数
    两数的乘积 / 最大公约数
 */

import java.util.Scanner;

public class gcd_lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd = gcd(a, b);
        int lcm = a * b / gcd;
        System.out.println(gcd);
        System.out.println(lcm);
    }

    // a 要大于 b 才能进行辗转相除法
    private static int gcd(int a, int b) {  // a = 2, b = 6
        while (b != 0) {                           // b = 6; 2; 0
            int temp = a % b;               // temp = 2 % 6 = 2; 6 % 2 = 0
            a = b;                          // a = 6; 2
            b = temp;                       // b = 2; 0
        }
        return a;                               // a = 2
    }
}
