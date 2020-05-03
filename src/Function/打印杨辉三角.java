package Function;

import java.util.Scanner;

public class 打印杨辉三角 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("需要打印几行？");
        int n = sc.nextInt();
        int[][] grid = new int[n][];

        for (int i = 0; i < n; i++) { //数组具体分配空间，两边的1赋值
            grid[i] = new int[i + 1];
            grid[i][0] = 1; //第一个
            grid[i][grid[i].length - 1] = 1;//最后一个
        }

        for (int i = 2; i < grid.length; i++) { //中间赋值
            for (int j = 1; j < grid[i].length - 1; j++) {
                grid[i][j] = grid[i - 1][j] + grid[i - 1][j - 1];
            }
        }

        for (int i = 0; i < grid.length; i++) { //↓纯打印
            for (int z = 0; z < grid.length - 1 - i; z++) { //打印行前空格
                System.out.print(" ");
            }
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(" " + grid[i][j]);
            }
            System.out.println();
        }
    }
}
