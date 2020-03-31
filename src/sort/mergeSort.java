package sort;

/*  Merge Sort
    Time = O(n * logn) Space = O(n)
    归并排序是 Divide and Conquer 的一个典型实例
    先 divide 到最小子问题，进行 sort，再一个一个 merge 回来
    缺点是开辟一个临时数组O(n)的时间复杂度不能省，并且最坏，平均和最佳的时间复杂度均为O(nlogn)
 */

import java.util.*;

public class mergeSort {
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

        mergeSort(nums, 0, nums.length - 1);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
    // 其实应该叫 divide，实质上是二分，最后调用 merge
    private static void mergeSort(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }
        // 不断二分
        int mid = left + (right - left) / 2;
        // 左数组
        mergeSort(nums, left, mid);
        // 右数组
        mergeSort(nums,mid + 1, right);
        // 合并左右数组
        merge(nums, left, mid, right);              // merge(0, 0, 1) [2, 1]
    }
    // merge 的过程实质上就是给定两个数组，维护两个指针遍历，相互之间比大小，把排序好的元素放进第三个数组的过程
    private static void merge(int[] nums, int left, int mid, int right) {   // left = 0, mid = 0, right = 1
        // 创建一个临时数组
        int[] temArray = new int[right - left + 1];         // int[1-0+1] = int[2]
        // 临时数组的遍历起始
        int index = 0;           // index = 0
        // 左数组的遍历起始
        int leftNum = left;         // leftNum = 0
        // 右数组的遍历起始
        int rightNum = mid + 1;     // rightNum = 1

        // 同时遍历左右数组
        while (leftNum <= mid && rightNum <= right) {   // 0 <= 0 && 1 <= 1
            if (nums[leftNum] <= nums[rightNum]) {      // nums[0] = 2 > nums[1] = 1
                temArray[index++] = nums[leftNum++];
            } else {
                temArray[index++] = nums[rightNum++];   // tem[0] = nums[1] = 1, index = 1, rightNum = 2
            }
        }
        // 右数组还没有遍历完
        while (rightNum <= right) {
            temArray[index++] = nums[rightNum++];
        }
        // 左数组还没有遍历完
        while (leftNum <= mid) {                    // 0 <= 0
            temArray[index++] = nums[leftNum++];    // tem[1] = nums[0] = 2, index = 2, leftNum = 1
        }
        // 将临时数组排好序的元素覆盖到原数组上
        for (int i = 0; i < index; i++) {           // i < 2
            nums[left++] = temArray[i];             // nums[0] = tem[0]; nums[1] = tem[1]
        }
    }
}
