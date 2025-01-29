package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class CommonKeyValueSum2 {
    public static void main(String[] args) {
        Map<String, Integer> map1 = Map.of("A",1, "B",2,"C",3);
        Map<String, Integer> map2 = Map.of("B", 4, "C", 5, "D", 6);

        // 코드 작성
        // 나의 답
//        Map<String, Integer> commonMap = new HashMap<>();
//
//        for(String map1Key : map1.keySet()) {
//            for(String map2Key : map2.keySet()) {
//                if(map1Key.equals(map2Key)) {
//                    commonMap.put(map2Key, map1.get(map1Key) + map2.get(map2Key));
//                }
//            }
//        }
//        System.out.println(commonMap);

        // 영한님 답
        Map<String, Integer> result = new HashMap<>();
        
        for(String key : map1.keySet()) {
            if(map2.containsKey(key)) {
                int value = map1.get(key) + map2.get(key);
                result.put(key, value);
            }
        }

        System.out.println(result);
        
    }
}
