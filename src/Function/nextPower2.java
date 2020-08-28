package Function;

import java.util.Scanner;

/*
    给定一个正整数 n，算出它的下一个 2 的指数：1、2、4、8、16、32、64...
 */
public class nextPower2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        n--;
        n |= n >> 1;
        n |= n >> 2;
        n |= n >> 4;
        n |= n >> 8;
        n |= n >> 16;

        System.out.print(n + 1);
    }
}
