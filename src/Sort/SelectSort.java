package Sort;

/*  选择排序
    Time = O(n^2) (best, average, worst)
    Space = O(1)
    每次选取最小的放在最前面
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SelectSort {
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
        selectSort(nums);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    private static void selectSort(int[] nums) {
        // 总共要经过 N-1 轮比较
        for (int i = 0; i < nums.length - 1; i++) {
                int min = i;
            // 每轮需要比较的次数 N-i
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[min]) {
                    // 记录目前能找到最小值元素的 index
                    min = j;
                }
            }
            // 将找到的最小值和i位置所在的值进行交换
            if (i != min) {
                swap(nums, i, min);
            }
        }
    }

    private static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
