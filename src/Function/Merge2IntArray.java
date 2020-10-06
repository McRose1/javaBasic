package Function;

import java.util.Scanner;

public class Merge2IntArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] nums1 = new int[m];
        for (int i = 0; i < m; i++) {
            nums1[i] = sc.nextInt();
        }
        int[] nums2 = new int[n];
        for (int i = 0; i < n; i++) {
            nums2[i] = sc.nextInt();
        }
        int[] res = merge(nums1, nums2);
        for (int num : res) {
            System.out.print(num);
        }
    }

    private static int[] merge(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int n = n1 + n2;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            if (i < n1) {
                res[i] = nums1[i];
            } else {
                res[i] = nums2[i - n1];
            }
        }
        return res;
    }
}
