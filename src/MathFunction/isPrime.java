package MathFunction;

/*  判断一个 int 是否为 prime number
    对正整数n（除了 2 是质数），如果用 2 到 根号n 之间的所有整数去除，均无法整除，则n为质数
 */

import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(isPrime(num));
    }

    private static boolean isPrime(int num) {
        if (num <= 1) return false;
        // Loop's ending condition is i*i <= num instead of i <= sqrt(num) to avoid repeatedly calling an expensive function sqrt()
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
