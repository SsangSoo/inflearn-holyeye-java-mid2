package generic.ex3;

import generic.animal.Cat;

public class CatHospital {

    private Cat animal;

    public void set(Cat animal) {
        this.animal = animal;
    }


    // .고양이의 이름과 크기를 출력 + sound() 메서드 호출
    public void checkup() {
        System.out.println("동물 이름: " + animal.getName());
        System.out.println("동물 크기: " + animal.getSize());
        animal.sound();
    }

    // 다른 고양이와 크기 비교 > 둘 중에 큰 것을 반환
    public Cat bigger(Cat target) {
        return animal.getSize() > target.getSize() ? animal : target;
    }

}
