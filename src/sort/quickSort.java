package sort;

/*  Quick Sort
    Time = O(n * logn) -> O(n^2) Space = O(1)
    快速排序也是 Divide and Conquer 的一个典型实例，但是没有用额外空间
    pivot 的选择不同会影响时间复杂度，一般 random 选择
    follow up：Quick Select
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class quickSort {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        Scanner in2 = new Scanner(line);

        while (in2.hasNextInt()) {
            list.add(in2.nextInt());
        }

        int[] nums = new int[list.size()];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = list.get(i);
        }
        quickSort(nums, 0, nums.length - 1);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    private static void quickSort(int[] nums, int left, int right) {
        if (left >= right) return;

        int pivot = partition(nums, left, right);
        quickSort(nums, left, pivot - 1);
        quickSort(nums, pivot + 1, right);
    }
    // 在规定范围内随机选取一个元素作为 pivot，并且和最后一个元素交换（个人偏好，也可跟第一个元素交换）
    private static int partition(int[] nums, int left, int right) {
        Random random = new Random();
        // 随机选取 pivot
        int pivotIndex = random.nextInt(right - left + 1) + left;
        // 记录 pivot 的值，以便后面比较
        int pivotValue = nums[pivotIndex];
        // 记录最后一个元素的位置，因为最后还要把 pivot 换回去
        int savedPosition = right;
        // 将 pivot 和最后一个元素交换
        swap(nums, pivotIndex, right);
        // 右指针指向 pivot 左边的第一个元素
        right--;

        while (left <= right) {
            if (nums[left] > pivotValue) {
                swap(nums, left, right);
                right--;
            } else {
                left++;
            }
        }
        // 将 pivot 换回来，此时 pivot 左边的元素都小于等于它，右边的元素都大于它
        swap(nums, left, savedPosition);
        return left;
    }

    private static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
