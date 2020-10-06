package Function;

import java.util.PriorityQueue;
import java.util.Scanner;

public class SecondLargestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        if (nums == null || nums.length < 2) {
            System.out.println("No second largest number");
            return;
        }
        if (nums.length == 2) {
            System.out.println(Math.min(nums[0], nums[1]));
            return;
        }
        int res = secondLargest(nums);
        System.out.println(res);
    }

    private static int secondLargest(int[] nums) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int n : nums) {
            minHeap.offer(n);
            if (minHeap.size() > 2) {
                minHeap.poll();
            }
        }
        return minHeap.poll();
    }
}
