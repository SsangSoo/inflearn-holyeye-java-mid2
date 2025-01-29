package collection.map.test;

import java.util.*;

public class ItemPriceTest {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("사과", 500);
        map.put("바나나", 500);
        map.put("망고", 1000);
        map.put("딸기", 1000);

        // 코드 작성 - 나의 답
//        Map<String, Integer> resultMap = new HashMap<>();
//
//        for(String key : map.keySet()) {
//            Integer price = map.get(key);
//            if(price == 1000) {
//                resultMap.put(key, price);
//            }
//        }
//
//        Set<String> keySet = resultMap.keySet();
//        String[] result = new String[keySet.size()];
//        
//        int index = 0;
//        Iterator<String> iterator = keySet.iterator();
//
//        while(iterator.hasNext()) {
//            result[index] = iterator.next();
//            index++;
//        }
//
//        System.out.println(Arrays.toString(result));

        // 코드 작성 - 영한님 답
        List<String> list = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue().equals(1000)) {
                list.add(entry.getKey());
            }
        }

        System.out.println(list);
        
    }
}
