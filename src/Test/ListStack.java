package Test;

/*  LC 71 对于 List<String> list = new ArrayList<>(stack); 的测试
    通过上述语句，发现 stack 传入 list 以后的顺序已经实现逆序
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ListStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        // Test1
        List<String> list1 = new ArrayList<>(stack);
        for (String s : list1) {
            System.out.println(s);
        }
        // Test2
        List<String> list2 = new ArrayList<>();
        while (!stack.isEmpty()) {
            list2.add(stack.pop());
        }
        for (int i = list2.size() - 1; i >= 0; i--) {
            System.out.println(list2.get(i));
        }
    }
}
