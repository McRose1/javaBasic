package Function;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Scanner;

public class 阶乘 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigInteger res = layerMul(n);
        System.out.println(res);
    }

    private static BigInteger layerMul(int n) {
        if (n == 0) {
            return BigInteger.valueOf(1);
        }
        BigInteger sum = BigInteger.valueOf(n);
        while (n-- != 0) {
            sum = sum.multiply(BigInteger.valueOf(n));
        }
        return sum;
    }
}
