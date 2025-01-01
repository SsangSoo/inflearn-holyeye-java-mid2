package generic.ex1;

public class BoxMain2 {

    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.set(10);
        Integer integer = (Integer) integerBox.get();
        System.out.println("integer = " + integer);

        ObjectBox stringBox = new ObjectBox();
        stringBox.set("hello");
        String str = (String) stringBox.get();
        System.out.println("str = " + str);
        // 여기까진 이전과 동일결과


        // 잘못된 타입의 인수 전달시 ClassCastException 발생
        integerBox.set("문자 100");
        Integer result = (Integer) integerBox.get();
        System.out.println("result = " + result);
    }
}
