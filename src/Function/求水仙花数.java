package Function;

/*  求水仙花数
    水仙花数（Narcissistic number）也被称为超完全数字不变数（pluperfect digital invariant, PPDI）、自恋数、自幂数、阿姆斯壮数或阿姆斯特朗数（Armstrong number），
    水仙花数是指一个 3 位数，它的每个位上的数字的 3次幂之和等于它本身（例如：1^3 + 5^3+ 3^3 = 153）。
 */

import java.util.Scanner;

public class 求水仙花数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 3; i <= n; i++) {
            int[] a = new int[i];
            // 101, 1001
            int num = (int) Math.pow(10, i - 1) + 1;
            while (num <= Math.pow(10, i)) {
                int sum = 0;
                // 从左到右遍历所有位数
                for (int j = 0; j < i; j++) {
                    a[j] = (int) (num / Math.pow(10, j) % 10);
                }
                for (int j = 0; j < i; j++) {
                    sum += (int) Math.pow(a[j], i);
                }
                if (num == sum) {
                    System.out.println(num);
                }
                num++;
            }
        }
    }
}
