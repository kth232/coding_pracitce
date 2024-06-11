package textbook.chapter08.animal;

import java.util.ArrayList;

public class AnimalTest {
    ArrayList<Animal> aniList = new ArrayList<Animal>(); //Animal 형으로 ArrayLIst 배열 객체 생성

    public void addAnimal() {
        aniList.add(new Human()); //ArrayList에 추가되면서 Animal형으로 묵시적 형변환(업캐스팅)
        aniList.add(new Tiger());
        aniList.add(new Eagle());

        for (Animal ani : aniList) { // 배열의 요소들을 Animal형으로 꺼내서 move 호출
            ani.move(); // 각자 클래스에 오버라이딩된 move()가 호출됨
        }
    }

    public void actAnimal () {
        for (int i = 0; i < aniList.size(); i++) { //모든 배열 요소들을 하나씩 반복
            Animal ani = aniList.get(i); //Animal형으로 값 가져옴
            if (ani instanceof Human) { //instanceof 속성으로 Human 형 확인
                Human h = (Human) ani; //Human 형으로 다운캐스팅(명시적 형변환)
                h.readBook();
            } else if (ani instanceof Tiger) { //instanceof 속성으로 Tiger 형 확인
                Tiger t = (Tiger) ani; //Tiger 형으로 다운캐스팅(명시적 형변환)
                t.hunting();
            } else if (ani instanceof Eagle) { //instanceof 속성으로 Eagle 형 확인
                Eagle e = (Eagle) ani; //Eagle 형으로 다운캐스팅(명시적 형변환)
                e.flying();
            } else {
                System.out.println("This type is not supported");
            }
        }
    }

    public static void main(String[] args) {
        AnimalTest aTest = new AnimalTest();//test 객체 생성
        aTest.addAnimal();
        System.out.println("--DownCasting to the original type--");
        aTest.actAnimal();
    }
}

