package Collections;

import java.util.*;

public class test {
    public static void main(String[] args) {
        List<Integer> A = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 10));
        Map<String, String> B = new HashMap<>();
        B.put("a", "1");
        B.put("b", "2");
        B.put("c", "10");
        List<Integer> res = new ArrayList<>();
        for (int n : A) {
            if (!B.containsValue(n + "")) {
                res.add(n);
            }
        }
        for (int n : res) {
            System.out.println(n);
        }
    }
}
