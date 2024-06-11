package textbook.chapter07.dog;

import java.util.ArrayList;

public class DogTestArrayList {
    public static void main(String[] args) {

        ArrayList<Dog> list = new ArrayList<Dog>(); //Dog 클래스 자료형 arraylist 생성
        list.add(new Dog("멍멍이", "치아와"));
        list.add(new Dog("뽀삐", "진돗개"));
        list.add(new Dog("순심이", "삽살개"));
        list.add(new Dog("철이", "마르티스"));
        list.add(new Dog("초코", "푸들")); //add()로 arraylist에 인스턴스 요소 추가


        for(int i =0; i<list.size(); i++) { //arraylist의 size()로 추가된 요소 전체 개수만큼 반복
            System.out.println(list.get(i).showDogInfo()); //get()로 index 위치에 있는 요소 값 반환
        }

        for(Dog dog : list) { //향상된 for문, Dog 클래스 자료형 dog 변수에 list 배열 각 요소 대입
            System.out.println(dog.showDogInfo()); //강아지 정보 출력
        }
    }
}
