package collection.list.test.ex2;


// 배열 참고
public class ShoppingCartArray {

    private Item[] items = new Item[10];
    private int itemCount;


    public void addItem(Item item) {
        if(itemCount >= items.length) {
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }
        items[itemCount++] = item;
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");

        for(int index = 0 ; index < itemCount; index++) {
            Item item = items[index];
            System.out.println("상품명:" + item.getName() + ", 합계:" + item.getTotalPrice());
        }

        System.out.println("전체 가격 합:" + calculateTotalPrice());
    }

    private int calculateTotalPrice() {
        int totalPrice = 0;
        for(int index = 0 ; index < itemCount; index++) {
            Item item = items[index];
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }
}

