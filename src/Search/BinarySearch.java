package Search;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int res = binarySearch1(nums, target);
        System.out.println(res);
    }

    private static int binarySearch1(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid;
            } else {
                left = mid;
            }
        }
        if (nums[left] == target) return left;
        else if (nums[right] == target) return right;
        else return -1;
    }

    private static int binarySearch2(int[] nums, int target) {
        return -1;
    }

    private static int binarySearch3(int[] nums, int target) {
        return -1;
    }
}
