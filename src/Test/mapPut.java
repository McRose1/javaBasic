package Test;

/*
    测试用 map.put() 对相同的 key 传入不同的值
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class mapPut {
    public static void main(String[] args) {
        Map<String, List<Integer>> map = new HashMap<>();
        map.put("2-1-1", Arrays.asList(2));
        // 相同的 key 会自动更新
        map.put("2-1-1", Arrays.asList(2, 0));
        for (String key : map.keySet()) {
            System.out.println(map.get(key));   // [2, 0]
        }
    }
}
