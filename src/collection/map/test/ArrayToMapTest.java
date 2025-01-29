package collection.map.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ArrayToMapTest {
    public static void main(String[] args) {
        String[][] productArr = {{"Java", "10000"}, {"Spring", "20000"}, {"JPA", "30000"}};

        // 주어진 배열로부터 Map 생성 - 코드 작성 - 내가 함
//        Map<String, Integer> productMap = new HashMap<>();
//        for(String[] product : productArr) {
//            String productKey = product[0];
//            int productPrice = Integer.parseInt(product[1]);
//            productMap.put(productKey, productPrice);
//        }

        // 주어진 배열로부터 Map 생성 - 코드 작성 - 영한님 답
        Map<String, Integer> productMap = new HashMap<>();
        for(String[] product: productArr) {
            productMap.put(product[0], Integer.valueOf(product[1]));
        }


        // Map의 모든 데이터 출력 - 코드 작성 - 내가 함
//        Set<Map.Entry<String, Integer>> entries = productMap.entrySet();
//        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
//        while(iterator.hasNext()) {
//            Map.Entry<String, Integer> product = iterator.next();
//            System.out.println("제품: " + product.getKey() + ", 가격: " + product.getValue());
//        }

        // Map의 모든 데이터 출력 - 코드 작성 - 영한님 답
        for(String key : productMap.keySet()) {
            System.out.println("제품: " + key + ", 가격: " + productMap.get(key));
        }

    }
}
