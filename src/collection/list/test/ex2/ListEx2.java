package collection.list.test.ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("n개의 정수를 입력하세요 (종료 0)");
        List<Integer> list = new ArrayList<>();

        while (true) {
            int integer = input.nextInt();
            if(integer == 0) {
                System.out.println("출력");
                break;
            }
            list.add(integer);
        }
        print(list);

    }

    private static void print(List<Integer> list) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
            if(i < list.size()-1 ) {
                sb.append(", ");
            }
        }
        System.out.println(sb.toString());
    }
}
