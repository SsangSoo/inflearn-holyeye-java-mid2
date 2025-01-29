package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest1 {
    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";

        // 코드 작성 - 나의 답
//        Map<String, Integer> map = new HashMap<>();
//
//        String[] fruits = text.split(" ");
//        int start = 1;
//        for(String fruit : fruits) {
//            if(map.containsKey(fruit)) {
//                map.put(fruit, map.get(fruit) + 1);
//            } else {
//                map.put(fruit, start);
//            }
//        }
//
//        System.out.println(map);
//
//

        // 코드 작성 - 영한님 답
        Map<String, Integer> map = new HashMap<>();
        String[] words = text.split(" ");
        for(String word : words) {
            Integer count = map.get(word);
            if(count == null) {
                count = 0;
            }
            count++;
            map.put(word, count);
        }

        System.out.println(map);
    }
}
