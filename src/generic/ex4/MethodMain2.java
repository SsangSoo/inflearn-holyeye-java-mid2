package generic.ex4;

import generic.animal.AnimalMethod;
import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain2 {

    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("냐옹이", 200);

        // 타입 매개변수 추론
        AnimalMethod.checkup(dog);
        AnimalMethod.checkup(cat);

        Dog targetDog = new Dog("큰 멍멍이", 200);
//        Animal bigger = AnimalMethod.bigger(dog, cat);// dog와 cat을 비교하니 반환타입이 Animal로 나옴.
        Dog bigger = AnimalMethod.bigger(dog, targetDog);
        System.out.println("bigger = " + bigger);
    }
}
