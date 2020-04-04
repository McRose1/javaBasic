package Sort;

/*  冒泡排序
    每次比较两个相邻的元素，将较大的元素交换至右端
    每一次循环都能确定这次循环右边的最大值
    Time = O(n^2) (best: O(n))
    Space = O(1)
    [3, 1, 6, 2, 5]
    1st:
    1 3 6 2 5
    1 3 6 2 5
    1 3 2 6 5
    1 3 2 5 6
    2nd:
    1 3 2 5
    1 2 3 5
    1 2 3 5
    3rd:
    1 3 2
    1 2 3
    4th:
    1 2
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        // 第一个 scanner 以行为单位读取数据，相当于是用回车（enter）当做结束符
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        // 把读取到的字符串传入第二个 scanner，接下去正常处理即可
        Scanner in2 = new Scanner(line);

        while (in2.hasNextInt()) {
            list.add(in2.nextInt());
        }

        int[] nums = new int[list.size()];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = list.get(i);
        }
        // 循环 len-1 次
        for (int i = nums.length - 1; i > 0; i--) {
            // 每次循环的比较都会减 1
            for (int j = 0; j < i; j++) {
                if (nums[j] >= nums[j + 1]) {
                    swap(nums, j, j + 1);
                }
            }
        }

        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
