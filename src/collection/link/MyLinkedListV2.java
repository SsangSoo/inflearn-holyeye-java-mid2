package collection.link;

public class MyLinkedListV2 {

    private Node first;
    private int size = 0;

    public void add(Object e) {
        Node newNode = new Node(e);
        if(first == null) {
            first = newNode;
        } else {
            Node lastNode = getLastNode();
            lastNode.next = newNode;
        }
        size++;
    }

    //추가 코드
    public void add(int index, Object e) {
        Node newNode = new Node(e);
        if(index == 0) {                        // 처음이라면
            newNode.next = first;               // 새로운 노드는 첫 번째 노드를
            first = newNode;                    // 추가한 노드가 첫 번째 노드가 되도록 함.
        } else {
            Node prev = getNode(index - 1); // 추가할 위치 직전 노드
            newNode.next = prev.next;            // 추가할 노드는 직전 노드가 참조하는 다음 노드를 참조하도록 함.
            prev.next = newNode;                 // 직전 노드가 추가한 노드를 참조하도록 함.
        }
        size++;
    }


    private Node getLastNode() {
        Node x = first;
        while(x.next != null) {
            x = x.next;
        }
        return x;
    }

    public Object set(int index, Object element) {
        Node x = getNode(index);
        Object oldValue = x.item;
        x.item = element;
        return oldValue;
    }

    // 추가 코드
    public Object remove(int index) {
        Node removeNode = getNode(index);          // 삭제할 노드 위치 찾기
        Object removedItem = removeNode.item;
        if(index == 0) {                            // 첫 번째 노드라면,
            first = removeNode.next;                // 첫 노드가 첫 번째의 노드를 참조하도록 함.
        } else {
            Node prev = getNode(index - 1);       // 삭제할 노드의 직전 노드
            prev.next = removeNode.next;               // 삭제할 노드의 직전 노드가 삭제할 노드의 다음 노드를 참조하도록 함.
        }
        removeNode.item = null;
        removeNode.next = null;
        size--;
        return removedItem;
    }

    public Object get(int index) {
        Node node = getNode(index);
        return node.item;
    }

    private Node getNode(int index) {
        Node x = first;
        for(int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    public int indexOf(Object o) {
        int index = 0;
        for (Node x = first; x != null; x = x.next) {
            if(o.equals(x.item)) {
                return index;
            }
            index++;
        }
        return -1;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "MyLinkedListV1{" +
                "first=" + first +
                ", size=" + size +
                '}';
    }
}
