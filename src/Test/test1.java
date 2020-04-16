package Test;

/*
    4,2,6,9
    309
    nums = [4,2,6,9] -> [4,6,9] -> [4,9] -> [9] -> []
    coins = 4*2*6 + 4*6*9 + 1*4*9 + 1*9*1 = 309
 */

import java.util.Scanner;
/*
    区间dp，用dp[i][j]表示从第i个金猪到第j个金猪的最大收益，则：
    dp[i][j]=max(dp[i][k]+dp[k][j]+mi×mk×mj)dp[i][j]
 */
public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(",");
        int n = input.length;
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(input[i]);
        }
        if (n == 0) {
            System.out.print(0);
            return;
        }
        if (n == 1) {
            System.out.print(nums[0]);
            return;
        }

        int res = 0;
        res += nums[0] * nums[1];
        for (int i = 1; i < n - 1; i++) {
            res += nums[i] * nums[i + 1];
        }
        res += nums[n - 1];

        System.out.print(res);
    }
}
