package Function;

/*  实现 Sqrt(x)
    x is non-negative integer
    Since the return type is an integer, the decimal digits are truncated and only the integer part of the result is returned
 */

import java.util.Scanner;
//  Binary Search
public class Sqrt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int sqrt = sqrt(x);
        System.out.println(sqrt);
    }

    private static int sqrt(int x) {
        if (x <= 1) return x;

        int left = 1;
        int right = x;
        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if (mid == x / mid) return mid;
            else if (mid > x / mid) {
                right = mid;
            } else {
                left = mid;
            }
        }
        if (right > x / right) return left;
        else return right;
    }
}
