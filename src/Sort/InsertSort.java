package Sort;

/*  插入排序
    Time = O(n^2) (average, worst) best: O(n)
    Space = O(1)
    从头到尾依次扫描未排序序列，将扫描到的每个元素插入有序序列的适当位置。
    类似玩扑克牌
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InsertSort {
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
        insertSort(nums);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    private static void insertSort(int[] nums) {
        // 从 index 为 1的元素开始选择合适的位置插入，因为 index 为 0 只有一个元素，默认有序
        for (int i = 1; i < nums.length; i++) {
            // 记录要插入的数据
            int tmp = nums[i];
            // 从已经排序的序列最右边的开始比较，找出比其小的数
            int j = i;
            while (j > 0 && tmp < nums[j - 1]) {
                // 将原先的有序元素向右移动一位
                nums[j] = nums[j - 1];
                j--;
            }
            // 存在比其小的数，插入
            if (j != i) {
                nums[j] = tmp;
            }
        }
    }
}
