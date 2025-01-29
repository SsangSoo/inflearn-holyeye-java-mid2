package collection.map.test.cart;

import java.util.HashMap;
import java.util.Map;

public class Cart {

    private Map<Product, Integer> cartMap = new HashMap<>();
    public void printAll() {
        System.out.println("==모든 상품 출력==");
        for(Map.Entry<Product, Integer> entiry : cartMap.entrySet()) {
            System.out.println("상품: " + entiry.getKey() + " 수량: " + entiry.getValue());
        }
    }

    public void add(Product product, int addQuantity) {
        cartMap.put(product, cartMap.getOrDefault(product, 0) + addQuantity);
    }

    public void minus(Product product, int minusQuantity) {
        int existingQuantity = cartMap.getOrDefault(product, 0);
        int newQuantity = existingQuantity - minusQuantity;
        if(newQuantity <= 0) {
            cartMap.remove(product);
        } else {
            cartMap.put(product, newQuantity);
        }

    }
}
