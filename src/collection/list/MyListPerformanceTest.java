package collection.list;

public class MyListPerformanceTest {
    public static void main(String[] args) {
        int size = 50000;
        System.out.println("==MyArrayList 추가==");
        addFirst(new MyArrayList<>(), size);
        addMid(new MyArrayList<>(), size);
        MyArrayList<Integer> arrayList = new MyArrayList<>();
        addLast(arrayList, size);

        int loop = 1000;
        System.out.println("==MyArrayList 조회");


        System.out.println("==MyLinkedList 추가==");
        addFirst(new MyLinkedList<>(), size);
        addMid(new MyLinkedList<>(), size);
        MyLinkedList<Integer> linkedList = new MyLinkedList();
        addLast(linkedList, size);

    }

    private static void addFirst(MyList<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for(int i = 0; i < size; i++) {
            list.add(0, i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("앞에 추가 - 크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");

    }


    private static void addMid(MyList<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for(int i = 0; i < size; i++) {
            list.add(i / 2, i);
    }
        long endTime = System.currentTimeMillis();
        System.out.println("평균 추가 - 크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");

    }

    private static void addLast(MyList<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for(int i = 0; i < size; i++) {
            list.add(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("뒤에 추가 - 크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");

    }





}
